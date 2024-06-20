/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.pricing;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * CompetitivePriceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-07T17:09:04.171+01:00")
public class CompetitivePriceType {
  @SerializedName("CompetitivePriceId")
  private String competitivePriceId = null;

  @SerializedName("Price")
  private PriceType price = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("subcondition")
  private String subcondition = null;

  @SerializedName("offerType")
  private OfferCustomerType offerType = null;

  @SerializedName("quantityTier")
  private Integer quantityTier = null;

  @SerializedName("quantityDiscountType")
  private QuantityDiscountType quantityDiscountType = null;

  @SerializedName("sellerId")
  private String sellerId = null;

  @SerializedName("belongsToRequester")
  private Boolean belongsToRequester = null;

  public CompetitivePriceType competitivePriceId(String competitivePriceId) {
    this.competitivePriceId = competitivePriceId;
    return this;
  }

   /**
   * The pricing model for each price that is returned.  Possible values:  * 1 - New Buy Box Price. * 2 - Used Buy Box Price.
   * @return competitivePriceId
  **/
  @ApiModelProperty(required = true, value = "The pricing model for each price that is returned.  Possible values:  * 1 - New Buy Box Price. * 2 - Used Buy Box Price.")
  public String getCompetitivePriceId() {
    return competitivePriceId;
  }

  public void setCompetitivePriceId(String competitivePriceId) {
    this.competitivePriceId = competitivePriceId;
  }

  public CompetitivePriceType price(PriceType price) {
    this.price = price;
    return this;
  }

   /**
   * Pricing information for a given CompetitivePriceId value.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Pricing information for a given CompetitivePriceId value.")
  public PriceType getPrice() {
    return price;
  }

  public void setPrice(PriceType price) {
    this.price = price;
  }

  public CompetitivePriceType condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Indicates the condition of the item whose pricing information is returned. Possible values are: New, Used, Collectible, Refurbished, or Club.
   * @return condition
  **/
  @ApiModelProperty(value = "Indicates the condition of the item whose pricing information is returned. Possible values are: New, Used, Collectible, Refurbished, or Club.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public CompetitivePriceType subcondition(String subcondition) {
    this.subcondition = subcondition;
    return this;
  }

   /**
   * Indicates the subcondition of the item whose pricing information is returned. Possible values are: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.
   * @return subcondition
  **/
  @ApiModelProperty(value = "Indicates the subcondition of the item whose pricing information is returned. Possible values are: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.")
  public String getSubcondition() {
    return subcondition;
  }

  public void setSubcondition(String subcondition) {
    this.subcondition = subcondition;
  }

  public CompetitivePriceType offerType(OfferCustomerType offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Indicates the type of customer that the offer is valid for.&lt;br&gt;&lt;br&gt;When the offer type is B2C in a quantity discount, the seller is winning the Buy Box because others do not have inventory at that quantity, not because they have a quantity discount on the ASIN.
   * @return offerType
  **/
  @ApiModelProperty(value = "Indicates the type of customer that the offer is valid for.<br><br>When the offer type is B2C in a quantity discount, the seller is winning the Buy Box because others do not have inventory at that quantity, not because they have a quantity discount on the ASIN.")
  public OfferCustomerType getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferCustomerType offerType) {
    this.offerType = offerType;
  }

  public CompetitivePriceType quantityTier(Integer quantityTier) {
    this.quantityTier = quantityTier;
    return this;
  }

   /**
   * Indicates at what quantity this price becomes active.
   * @return quantityTier
  **/
  @ApiModelProperty(value = "Indicates at what quantity this price becomes active.")
  public Integer getQuantityTier() {
    return quantityTier;
  }

  public void setQuantityTier(Integer quantityTier) {
    this.quantityTier = quantityTier;
  }

  public CompetitivePriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
    this.quantityDiscountType = quantityDiscountType;
    return this;
  }

   /**
   * Indicates the type of quantity discount this price applies to.
   * @return quantityDiscountType
  **/
  @ApiModelProperty(value = "Indicates the type of quantity discount this price applies to.")
  public QuantityDiscountType getQuantityDiscountType() {
    return quantityDiscountType;
  }

  public void setQuantityDiscountType(QuantityDiscountType quantityDiscountType) {
    this.quantityDiscountType = quantityDiscountType;
  }

  public CompetitivePriceType sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier for the offer.
   * @return sellerId
  **/
  @ApiModelProperty(value = "The seller identifier for the offer.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public CompetitivePriceType belongsToRequester(Boolean belongsToRequester) {
    this.belongsToRequester = belongsToRequester;
    return this;
  }

   /**
   *  Indicates whether or not the pricing information is for an offer listing that belongs to the requester. The requester is the seller associated with the SellerId that was submitted with the request. Possible values are: true and false.
   * @return belongsToRequester
  **/
  @ApiModelProperty(value = " Indicates whether or not the pricing information is for an offer listing that belongs to the requester. The requester is the seller associated with the SellerId that was submitted with the request. Possible values are: true and false.")
  public Boolean isBelongsToRequester() {
    return belongsToRequester;
  }

  public void setBelongsToRequester(Boolean belongsToRequester) {
    this.belongsToRequester = belongsToRequester;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitivePriceType competitivePriceType = (CompetitivePriceType) o;
    return Objects.equals(this.competitivePriceId, competitivePriceType.competitivePriceId) &&
        Objects.equals(this.price, competitivePriceType.price) &&
        Objects.equals(this.condition, competitivePriceType.condition) &&
        Objects.equals(this.subcondition, competitivePriceType.subcondition) &&
        Objects.equals(this.offerType, competitivePriceType.offerType) &&
        Objects.equals(this.quantityTier, competitivePriceType.quantityTier) &&
        Objects.equals(this.quantityDiscountType, competitivePriceType.quantityDiscountType) &&
        Objects.equals(this.sellerId, competitivePriceType.sellerId) &&
        Objects.equals(this.belongsToRequester, competitivePriceType.belongsToRequester);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitivePriceId, price, condition, subcondition, offerType, quantityTier, quantityDiscountType, sellerId, belongsToRequester);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitivePriceType {\n");
    
    sb.append("    competitivePriceId: ").append(toIndentedString(competitivePriceId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    subcondition: ").append(toIndentedString(subcondition)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
    sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    belongsToRequester: ").append(toIndentedString(belongsToRequester)).append("\n");
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

