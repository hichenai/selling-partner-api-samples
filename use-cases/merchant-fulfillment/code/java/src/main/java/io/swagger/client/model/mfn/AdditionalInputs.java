/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.mfn;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Maps the additional seller input to the definition. The key to the map is the field name.
 */
@ApiModel(description = "Maps the additional seller input to the definition. The key to the map is the field name.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-14T15:09:37.314+01:00")
public class AdditionalInputs {
  @SerializedName("AdditionalInputFieldName")
  private String additionalInputFieldName = null;

  @SerializedName("SellerInputDefinition")
  private SellerInputDefinition sellerInputDefinition = null;

  public AdditionalInputs additionalInputFieldName(String additionalInputFieldName) {
    this.additionalInputFieldName = additionalInputFieldName;
    return this;
  }

   /**
   * The field name.
   * @return additionalInputFieldName
  **/
  @ApiModelProperty(value = "The field name.")
  public String getAdditionalInputFieldName() {
    return additionalInputFieldName;
  }

  public void setAdditionalInputFieldName(String additionalInputFieldName) {
    this.additionalInputFieldName = additionalInputFieldName;
  }

  public AdditionalInputs sellerInputDefinition(SellerInputDefinition sellerInputDefinition) {
    this.sellerInputDefinition = sellerInputDefinition;
    return this;
  }

   /**
   * Get sellerInputDefinition
   * @return sellerInputDefinition
  **/
  @ApiModelProperty(value = "")
  public SellerInputDefinition getSellerInputDefinition() {
    return sellerInputDefinition;
  }

  public void setSellerInputDefinition(SellerInputDefinition sellerInputDefinition) {
    this.sellerInputDefinition = sellerInputDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalInputs additionalInputs = (AdditionalInputs) o;
    return Objects.equals(this.additionalInputFieldName, additionalInputs.additionalInputFieldName) &&
        Objects.equals(this.sellerInputDefinition, additionalInputs.sellerInputDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInputFieldName, sellerInputDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInputs {\n");
    
    sb.append("    additionalInputFieldName: ").append(toIndentedString(additionalInputFieldName)).append("\n");
    sb.append("    sellerInputDefinition: ").append(toIndentedString(sellerInputDefinition)).append("\n");
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

