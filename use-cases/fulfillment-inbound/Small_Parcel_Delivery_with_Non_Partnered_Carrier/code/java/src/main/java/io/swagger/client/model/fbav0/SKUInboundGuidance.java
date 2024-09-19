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
 * Reasons why a given seller SKU is not recommended for shipment to Amazon&#39;s fulfillment network.
 */
@ApiModel(description = "Reasons why a given seller SKU is not recommended for shipment to Amazon's fulfillment network.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:45:02.096-05:00")
public class SKUInboundGuidance {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("InboundGuidance")
  private InboundGuidance inboundGuidance = null;

  @SerializedName("GuidanceReasonList")
  private GuidanceReasonList guidanceReasonList = null;

  public SKUInboundGuidance sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public SKUInboundGuidance ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(required = true, value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public SKUInboundGuidance inboundGuidance(InboundGuidance inboundGuidance) {
    this.inboundGuidance = inboundGuidance;
    return this;
  }

   /**
   * Specific inbound guidance for an item.
   * @return inboundGuidance
  **/
  @ApiModelProperty(required = true, value = "Specific inbound guidance for an item.")
  public InboundGuidance getInboundGuidance() {
    return inboundGuidance;
  }

  public void setInboundGuidance(InboundGuidance inboundGuidance) {
    this.inboundGuidance = inboundGuidance;
  }

  public SKUInboundGuidance guidanceReasonList(GuidanceReasonList guidanceReasonList) {
    this.guidanceReasonList = guidanceReasonList;
    return this;
  }

   /**
   * A list of reasons for the current inbound guidance for this item.
   * @return guidanceReasonList
  **/
  @ApiModelProperty(value = "A list of reasons for the current inbound guidance for this item.")
  public GuidanceReasonList getGuidanceReasonList() {
    return guidanceReasonList;
  }

  public void setGuidanceReasonList(GuidanceReasonList guidanceReasonList) {
    this.guidanceReasonList = guidanceReasonList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SKUInboundGuidance skUInboundGuidance = (SKUInboundGuidance) o;
    return Objects.equals(this.sellerSKU, skUInboundGuidance.sellerSKU) &&
        Objects.equals(this.ASIN, skUInboundGuidance.ASIN) &&
        Objects.equals(this.inboundGuidance, skUInboundGuidance.inboundGuidance) &&
        Objects.equals(this.guidanceReasonList, skUInboundGuidance.guidanceReasonList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, ASIN, inboundGuidance, guidanceReasonList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SKUInboundGuidance {\n");
    
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    inboundGuidance: ").append(toIndentedString(inboundGuidance)).append("\n");
    sb.append("    guidanceReasonList: ").append(toIndentedString(guidanceReasonList)).append("\n");
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

