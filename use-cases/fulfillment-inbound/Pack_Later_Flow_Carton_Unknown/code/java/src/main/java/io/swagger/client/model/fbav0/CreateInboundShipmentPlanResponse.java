/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fbav0;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The response schema for the createInboundShipmentPlan operation.
 */
@ApiModel(description = "The response schema for the createInboundShipmentPlan operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:45:02.096-05:00")
public class CreateInboundShipmentPlanResponse {
    @SerializedName("payload")
    private CreateInboundShipmentPlanResult payload = null;

    @SerializedName("errors")
    private ErrorList errors = null;

    public CreateInboundShipmentPlanResponse payload(CreateInboundShipmentPlanResult payload) {
        this.payload = payload;
        return this;
    }

    /**
     * The payload for the createInboundShipmentPlan operation.
     *
     * @return payload
     **/
    @ApiModelProperty(value = "The payload for the createInboundShipmentPlan operation.")
    public CreateInboundShipmentPlanResult getPayload() {
        return payload;
    }

    public void setPayload(CreateInboundShipmentPlanResult payload) {
        this.payload = payload;
    }

    public CreateInboundShipmentPlanResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    @ApiModelProperty(value = "")
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInboundShipmentPlanResponse createInboundShipmentPlanResponse = (CreateInboundShipmentPlanResponse) o;
        return Objects.equals(this.payload, createInboundShipmentPlanResponse.payload) &&
                Objects.equals(this.errors, createInboundShipmentPlanResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInboundShipmentPlanResponse {\n");

        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

