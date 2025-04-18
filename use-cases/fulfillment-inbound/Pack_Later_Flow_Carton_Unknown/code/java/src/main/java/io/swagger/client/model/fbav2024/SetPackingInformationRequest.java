/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fbav2024;

import java.util.Objects;
import java.util.Arrays;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.fbav2024.PackageGroupingInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;setPackingInformation&#x60; request.
 */
@ApiModel(description = "The `setPackingInformation` request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class SetPackingInformationRequest {
    @SerializedName("packageGroupings")
    private List<PackageGroupingInput> packageGroupings = new ArrayList<PackageGroupingInput>();

    public SetPackingInformationRequest packageGroupings(List<PackageGroupingInput> packageGroupings) {
        this.packageGroupings = packageGroupings;
        return this;
    }

    public SetPackingInformationRequest addPackageGroupingsItem(PackageGroupingInput packageGroupingsItem) {
        this.packageGroupings.add(packageGroupingsItem);
        return this;
    }

    /**
     * List of packing information for the inbound plan.
     *
     * @return packageGroupings
     **/
    @ApiModelProperty(required = true, value = "List of packing information for the inbound plan.")
    public List<PackageGroupingInput> getPackageGroupings() {
        return packageGroupings;
    }

    public void setPackageGroupings(List<PackageGroupingInput> packageGroupings) {
        this.packageGroupings = packageGroupings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetPackingInformationRequest setPackingInformationRequest = (SetPackingInformationRequest) o;
        return Objects.equals(this.packageGroupings, setPackingInformationRequest.packageGroupings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageGroupings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPackingInformationRequest {\n");

        sb.append("    packageGroupings: ").append(toIndentedString(packageGroupings)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

