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
import io.swagger.client.model.fbav2024.Pagination;
import io.swagger.client.model.fbav2024.Pallet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;listInboundPlanPallets&#x60; response.
 */
@ApiModel(description = "The `listInboundPlanPallets` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class ListInboundPlanPalletsResponse {
    @SerializedName("pagination")
    private Pagination pagination = null;

    @SerializedName("pallets")
    private List<Pallet> pallets = new ArrayList<Pallet>();

    public ListInboundPlanPalletsResponse pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     **/
    @ApiModelProperty(value = "")
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListInboundPlanPalletsResponse pallets(List<Pallet> pallets) {
        this.pallets = pallets;
        return this;
    }

    public ListInboundPlanPalletsResponse addPalletsItem(Pallet palletsItem) {
        this.pallets.add(palletsItem);
        return this;
    }

    /**
     * The pallets in an inbound plan.
     *
     * @return pallets
     **/
    @ApiModelProperty(required = true, value = "The pallets in an inbound plan.")
    public List<Pallet> getPallets() {
        return pallets;
    }

    public void setPallets(List<Pallet> pallets) {
        this.pallets = pallets;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInboundPlanPalletsResponse listInboundPlanPalletsResponse = (ListInboundPlanPalletsResponse) o;
        return Objects.equals(this.pagination, listInboundPlanPalletsResponse.pagination) &&
                Objects.equals(this.pallets, listInboundPlanPalletsResponse.pallets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagination, pallets);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInboundPlanPalletsResponse {\n");

        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    pallets: ").append(toIndentedString(pallets)).append("\n");
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

