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
import io.swagger.client.model.fbav2024.InboundPlanSummary;
import io.swagger.client.model.fbav2024.Pagination;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;listInboundPlans&#x60; response.
 */
@ApiModel(description = "The `listInboundPlans` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class ListInboundPlansResponse {
  @SerializedName("inboundPlans")
  private List<InboundPlanSummary> inboundPlans = null;

  @SerializedName("pagination")
  private Pagination pagination = null;

  public ListInboundPlansResponse inboundPlans(List<InboundPlanSummary> inboundPlans) {
    this.inboundPlans = inboundPlans;
    return this;
  }

  public ListInboundPlansResponse addInboundPlansItem(InboundPlanSummary inboundPlansItem) {
    if (this.inboundPlans == null) {
      this.inboundPlans = new ArrayList<InboundPlanSummary>();
    }
    this.inboundPlans.add(inboundPlansItem);
    return this;
  }

   /**
   * A list of inbound plans with minimal information.
   * @return inboundPlans
  **/
  @ApiModelProperty(value = "A list of inbound plans with minimal information.")
  public List<InboundPlanSummary> getInboundPlans() {
    return inboundPlans;
  }

  public void setInboundPlans(List<InboundPlanSummary> inboundPlans) {
    this.inboundPlans = inboundPlans;
  }

  public ListInboundPlansResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInboundPlansResponse listInboundPlansResponse = (ListInboundPlansResponse) o;
    return Objects.equals(this.inboundPlans, listInboundPlansResponse.inboundPlans) &&
        Objects.equals(this.pagination, listInboundPlansResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundPlans, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInboundPlansResponse {\n");
    
    sb.append("    inboundPlans: ").append(toIndentedString(inboundPlans)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

