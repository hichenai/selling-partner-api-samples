#!/bin/bash

# Get the programming language from the input arguments
language=""
while getopts 'l:' flag; do
  case "${flag}" in
    l) language="${OPTARG}";;
  esac
done

# Set the Lambda runtime based on the programming language
runtime=""
case "${language}" in
  java) runtime="java11";;
  python) runtime="python3.8";;
  *) echo "Undefined language"; exit;;
esac

# Verify pre-requisites
source ../shared/pre-requisites.sh $language
if [ $? -ne 0 ]
then
  echo "Verifying pre-requisites failed"
  echo "Aborting"
  exit -1
fi

# Generate a random string of 6 characters
random_string=$(LC_ALL=C tr -dc 'a-z' < /dev/urandom | fold -w 6 | head -n 1)

# Create and attach the IAM policy
echo "Creating IAM policy"
policy_arn=$(aws iam create-policy --policy-name "sp-api-app-policy-${random_string}" --policy-document file://../iam-policy.json --query "Policy.Arn" --output text)
if [ $? -ne 0 ]
then
  echo "IAM policy creation failed"
  echo "Aborting"
  exit -1
fi

# Sleeping to propagate changes
echo "Processing ..."
sleep 15

# Bootstrap CDK environment
echo "Bootstrapping CDK environment"
aws_account_id=$(aws sts get-caller-identity --query "Account" --output text)
aws_region=$(aws configure get region)
cdk_namespace="spapi"
cdk bootstrap --qualifier "${cdk_namespace}" aws://${aws_account_id}/${aws_region} --cloudformation-execution-policies "${policy_arn}"
if [ $? -ne 0 ]
then
  echo "Bootstrapping CDK environment failed."
  echo "Aborting"
  exit -1
fi

# Create the S3 bucket to host the code
echo "Creating S3 resources"
bucket_name="sp-api-app-bucket-${random_string}"
aws s3 mb "s3://${bucket_name}"
if [ $? -ne 0 ]
then
  echo "S3 bucket creation failed"
  echo "Aborting"
  exit -1
fi

# Sleeping to propagate changes
echo "Processing ..."
sleep 15


# If it's a Python app, package the code and upload it to S3
if [ "$language" == "python" ]; then
	echo "Packaging and uploading Python code"
	python_code_folder="../../../code/python/"
	if [ -d "${python_code_folder}target" ]; then
	    rm -r "${python_code_folder}target"
	fi
	mkdir "${python_code_folder}target"
	python_code_zip="target/sp-api-python-app-1.0-upload.zip"
	code_s3_key="src/sp-api-python-app.zip"
	retrieve_order_handler="src/retrieve_order_handler.lambda_handler"
  inventory_check_handler="src/inventory_check_handler.lambda_handler"
  get_rates_handler="src/get_rates_handler.lambda_handler"
  get_additional_inputs_handler="src/get_additional_inputs_handler.lambda_handler"
  one_click_shipment_handler="src/one_click_shipment_handler.lambda_handler"
  select_shipment_handler="src/select_shipment_handler.lambda_handler"
  purchase_shipment_handler="src/purchase_shipment_handler.lambda_handler"
  presign_s3_label_handler="src/presign_s3_label_handler.lambda_handler"
  process_notification_handler="src/process_notification_handler.lambda_handler"
  subscribe_notifications_handler="src/subscribe_notifications_handler.lambda_handler"
  cancel_shipment_handler="src/cancel_shipment_handler.lambda_handler"
  get_tracking_handler="src/get_tracking_handler.lambda_handler"

	(
    cd "${python_code_folder}" || exit
    if command -v zip >/dev/null 2>&1; then
      zip -rq "${python_code_zip}" . -x "target/"
    elif [[ "$OSTYPE" == "msys"* ]]; then
      powershell -Command "\$filestoArchive = Get-ChildItem -Path . -Exclude 'target'; Compress-Archive -Path \$filesToArchive -DestinationPath '${python_code_zip}'"
    fi
  )
	aws s3 cp "${python_code_folder}${python_code_zip}" "s3://${bucket_name}/${code_s3_key}"
fi

# Upload the StepFunctions state machine definition to S3
state_machine_s3_key="step-functions/state-machine-definition.json"
aws s3 cp ../../step-functions/step-functions-workflow-definition.json "s3://${bucket_name}/${state_machine_s3_key}"
if [ $? -ne 0 ]
then
  echo "State machine definition upload to S3 failed"
  echo "Aborting"
  exit -1
fi

# Retrieve config values
config_file="../../app.config"
sp_api_client_id="$(grep "^ClientId=" "${config_file}" | cut -d"=" -f2)"
sp_api_client_secret="$(grep "^ClientSecret=" "${config_file}" | cut -d"=" -f2)"
sp_api_refresh_token="$(grep "^RefreshToken=" "${config_file}" | cut -d"=" -f2)"
sp_api_region_code="$(grep "^RegionCode=" "${config_file}" | cut -d"=" -f2)"
sp_api_email="$(grep "^NotificationEmail=" "${config_file}" | cut -d"=" -f2)"
sp_api_one_click_shipment="$(grep "^OneClickShipment=" "${config_file}" | cut -d"=" -f2)"

#Create the infrastructure using CDK
cdk_stack_path="../../sp-api-app-cdk/"
stack_name="sp-api-app-cdk-${random_string}"
app_command="npx ts-node --prefer-ts-exts ${cdk_stack_path}bin/sp-api-app-cdk.ts"
cdk_deploy_output="${cdk_stack_path}cdk.out"

# Install npm dependencies
echo "Installing npm dependencies for the cdk stack project..."
currentPath=$(PWD)
cd "${cdk_stack_path}" && npm install
cd "${currentPath}" || exit

# Deploy the CDK stack
echo "Creating CDK stack..."
cdk deploy "${stack_name}" --output "${cdk_deploy_output}" --app "${app_command}" --require-approval never \
  -c RANDOM_SUFFIX="${random_string}" \
  -c CDK_QUALIFIER="${cdk_namespace}" \
  --parameters clientID="${sp_api_client_id}" \
  --parameters clientSecret="${sp_api_client_secret}" \
  --parameters refreshToken="${sp_api_refresh_token}" \
  --parameters regionCode="${sp_api_region_code}" \
  --parameters oneClickShipment="${sp_api_one_click_shipment}" \
  --parameters programmingLanguage="${runtime}" \
  --parameters artifactS3BucketName="${bucket_name}" \
  --parameters lambdaFunctionCodeS3Key="${code_s3_key}" \
  --parameters stepFunctionStateMachineDefinitionS3Key="${state_machine_s3_key}" \
  --parameters notificationEmail="${sp_api_email}" \
  --parameters spapiRetrieveOrderLambdaFunctionHandler="${retrieve_order_handler}" \
  --parameters spapiInventoryCheckLambdaFunctionHandler="${inventory_check_handler}" \
  --parameters spapiEligibleShipmentLambdaFunctionHandler="${eligible_shipment_handler}" \
  --parameters spapiSelectShipmentLambdaFunctionHandler="${select_shipment_handler}" \
  --parameters spapiCreateShipmentLambdaFunctionHandler="${create_shipment_handler}" \
  --parameters spapiPresignS3LabelLambdaFunctionHandler="${presign_s3_label_handler}" \
  --parameters spapiGetRatesLambdaFunctionHandler="${get_rates_handler}" \
  --parameters spapiGetAdditionalInputsLambdaFunctionHandler="${get_additional_inputs_handler}" \
  --parameters spapiOneClickShipmentLambdaFunctionHandler="${one_click_shipment_handler}" \
  --parameters spapiPurchaseShipmentLambdaFunctionHandler="${purchase_shipment_handler}" \
  --parameters spapiCancelShipmentLambdaFunctionHandler="${cancel_shipment_handler}" \
  --parameters spapiGetTrackingLambdaFunctionHandler="${get_tracking_handler}" \
  --parameters spapiProcessNotificationLambdaFunctionHandler="${process_notification_handler}" \
  --parameters spapiSubscribeNotificationsLambdaFunctionHandler="${subscribe_notifications_handler}"

if [ $? -ne 0 ]
then
  echo "CDK stack creation failed"
  echo "Aborting"
  exit -1
fi
echo "CDK stack name = ${stack_name}"

mfn_bucket_name="sp-api-labels-s3-bucket-${random_string}"

# Store resources' IDs in a tmp file for future clean-up
echo "Storing resources' IDs in a tmp file"
tempdir="tmp"
if [ ! -d "$tempdir" ]; then
  mkdir "$tempdir"
fi
filename="tmp/resources.txt"
exec 3<> "$filename"
echo "policy_arn=$policy_arn" >&3
echo "bucket_name=$bucket_name" >&3
echo "app_command=$app_command" >&3
echo "mfn_bucket_name=$mfn_bucket_name" >&3
echo "stack_name=$stack_name" >&3
echo "cdk_deploy_output=$cdk_deploy_output" >&3
echo "random_suffix=$random_string" >&3
echo "aws_account_id=$aws_account_id" >&3
echo "aws_region=$aws_region" >&3
echo "cdk_namespace=$cdk_namespace" >&3
exec 3>&-

echo "Successfully created a Shipping SP-API app"