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
import io.swagger.client.model.fbav2024.RequestedUpdates;
import io.swagger.client.model.fbav2024.TransportationOption;

import java.io.IOException;

/**
 * Preview of the changes that will be applied to the shipment.
 */
@ApiModel(description = "Preview of the changes that will be applied to the shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class ContentUpdatePreview {
    @SerializedName("contentUpdatePreviewId")
    private String contentUpdatePreviewId = null;

    @SerializedName("expiration")
    private String expiration = null;

    @SerializedName("requestedUpdates")
    private RequestedUpdates requestedUpdates = null;

    @SerializedName("transportationOption")
    private TransportationOption transportationOption = null;

    public ContentUpdatePreview contentUpdatePreviewId(String contentUpdatePreviewId) {
        this.contentUpdatePreviewId = contentUpdatePreviewId;
        return this;
    }

    /**
     * Identifier of a content update preview.
     *
     * @return contentUpdatePreviewId
     **/
    @ApiModelProperty(required = true, value = "Identifier of a content update preview.")
    public String getContentUpdatePreviewId() {
        return contentUpdatePreviewId;
    }

    public void setContentUpdatePreviewId(String contentUpdatePreviewId) {
        this.contentUpdatePreviewId = contentUpdatePreviewId;
    }

    public ContentUpdatePreview expiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * The date in ISO 8601 format for when the content update expires.
     *
     * @return expiration
     **/
    @ApiModelProperty(required = true, value = "The date in ISO 8601 format for when the content update expires.")
    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public ContentUpdatePreview requestedUpdates(RequestedUpdates requestedUpdates) {
        this.requestedUpdates = requestedUpdates;
        return this;
    }

    /**
     * Get requestedUpdates
     *
     * @return requestedUpdates
     **/
    @ApiModelProperty(required = true, value = "")
    public RequestedUpdates getRequestedUpdates() {
        return requestedUpdates;
    }

    public void setRequestedUpdates(RequestedUpdates requestedUpdates) {
        this.requestedUpdates = requestedUpdates;
    }

    public ContentUpdatePreview transportationOption(TransportationOption transportationOption) {
        this.transportationOption = transportationOption;
        return this;
    }

    /**
     * Get transportationOption
     *
     * @return transportationOption
     **/
    @ApiModelProperty(required = true, value = "")
    public TransportationOption getTransportationOption() {
        return transportationOption;
    }

    public void setTransportationOption(TransportationOption transportationOption) {
        this.transportationOption = transportationOption;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentUpdatePreview contentUpdatePreview = (ContentUpdatePreview) o;
        return Objects.equals(this.contentUpdatePreviewId, contentUpdatePreview.contentUpdatePreviewId) &&
                Objects.equals(this.expiration, contentUpdatePreview.expiration) &&
                Objects.equals(this.requestedUpdates, contentUpdatePreview.requestedUpdates) &&
                Objects.equals(this.transportationOption, contentUpdatePreview.transportationOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentUpdatePreviewId, expiration, requestedUpdates, transportationOption);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentUpdatePreview {\n");

        sb.append("    contentUpdatePreviewId: ").append(toIndentedString(contentUpdatePreviewId)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    requestedUpdates: ").append(toIndentedString(requestedUpdates)).append("\n");
        sb.append("    transportationOption: ").append(toIndentedString(transportationOption)).append("\n");
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

