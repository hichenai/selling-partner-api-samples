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

import java.io.IOException;

/**
 * The &#x60;GenerateShipmentContentUpdatePreviews&#x60; response.
 */
@ApiModel(description = "The `GenerateShipmentContentUpdatePreviews` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class GenerateShipmentContentUpdatePreviewsResponse {
    @SerializedName("operationId")
    private String operationId = null;

    public GenerateShipmentContentUpdatePreviewsResponse operationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * UUID for the given operation.
     *
     * @return operationId
     **/
    @ApiModelProperty(required = true, value = "UUID for the given operation.")
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateShipmentContentUpdatePreviewsResponse generateShipmentContentUpdatePreviewsResponse = (GenerateShipmentContentUpdatePreviewsResponse) o;
        return Objects.equals(this.operationId, generateShipmentContentUpdatePreviewsResponse.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateShipmentContentUpdatePreviewsResponse {\n");

        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

