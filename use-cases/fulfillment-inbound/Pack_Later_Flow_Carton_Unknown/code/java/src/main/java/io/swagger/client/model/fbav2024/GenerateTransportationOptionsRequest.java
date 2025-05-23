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
import io.swagger.client.model.fbav2024.ShipmentTransportationConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;generateTransportationOptions&#x60; request.
 */
@ApiModel(description = "The `generateTransportationOptions` request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class GenerateTransportationOptionsRequest {
    @SerializedName("placementOptionId")
    private String placementOptionId = null;

    @SerializedName("shipmentTransportationConfigurations")
    private List<ShipmentTransportationConfiguration> shipmentTransportationConfigurations = new ArrayList<ShipmentTransportationConfiguration>();

    public GenerateTransportationOptionsRequest placementOptionId(String placementOptionId) {
        this.placementOptionId = placementOptionId;
        return this;
    }

    /**
     * The placement option to generate transportation options for.
     *
     * @return placementOptionId
     **/
    @ApiModelProperty(required = true, value = "The placement option to generate transportation options for.")
    public String getPlacementOptionId() {
        return placementOptionId;
    }

    public void setPlacementOptionId(String placementOptionId) {
        this.placementOptionId = placementOptionId;
    }

    public GenerateTransportationOptionsRequest shipmentTransportationConfigurations(List<ShipmentTransportationConfiguration> shipmentTransportationConfigurations) {
        this.shipmentTransportationConfigurations = shipmentTransportationConfigurations;
        return this;
    }

    public GenerateTransportationOptionsRequest addShipmentTransportationConfigurationsItem(ShipmentTransportationConfiguration shipmentTransportationConfigurationsItem) {
        this.shipmentTransportationConfigurations.add(shipmentTransportationConfigurationsItem);
        return this;
    }

    /**
     * List of shipment transportation configurations.
     *
     * @return shipmentTransportationConfigurations
     **/
    @ApiModelProperty(required = true, value = "List of shipment transportation configurations.")
    public List<ShipmentTransportationConfiguration> getShipmentTransportationConfigurations() {
        return shipmentTransportationConfigurations;
    }

    public void setShipmentTransportationConfigurations(List<ShipmentTransportationConfiguration> shipmentTransportationConfigurations) {
        this.shipmentTransportationConfigurations = shipmentTransportationConfigurations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateTransportationOptionsRequest generateTransportationOptionsRequest = (GenerateTransportationOptionsRequest) o;
        return Objects.equals(this.placementOptionId, generateTransportationOptionsRequest.placementOptionId) &&
                Objects.equals(this.shipmentTransportationConfigurations, generateTransportationOptionsRequest.shipmentTransportationConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placementOptionId, shipmentTransportationConfigurations);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateTransportationOptionsRequest {\n");

        sb.append("    placementOptionId: ").append(toIndentedString(placementOptionId)).append("\n");
        sb.append("    shipmentTransportationConfigurations: ").append(toIndentedString(shipmentTransportationConfigurations)).append("\n");
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

