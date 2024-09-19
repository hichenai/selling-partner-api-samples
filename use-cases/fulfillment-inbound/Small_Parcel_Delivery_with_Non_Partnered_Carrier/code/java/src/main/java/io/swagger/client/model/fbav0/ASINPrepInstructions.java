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
 * Item preparation instructions to help with item sourcing decisions.
 */
@ApiModel(description = "Item preparation instructions to help with item sourcing decisions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:45:02.096-05:00")
public class ASINPrepInstructions {
  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("BarcodeInstruction")
  private BarcodeInstruction barcodeInstruction = null;

  @SerializedName("PrepGuidance")
  private PrepGuidance prepGuidance = null;

  @SerializedName("PrepInstructionList")
  private PrepInstructionList prepInstructionList = null;

  public ASINPrepInstructions ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public ASINPrepInstructions barcodeInstruction(BarcodeInstruction barcodeInstruction) {
    this.barcodeInstruction = barcodeInstruction;
    return this;
  }

   /**
   * Get barcodeInstruction
   * @return barcodeInstruction
  **/
  @ApiModelProperty(value = "")
  public BarcodeInstruction getBarcodeInstruction() {
    return barcodeInstruction;
  }

  public void setBarcodeInstruction(BarcodeInstruction barcodeInstruction) {
    this.barcodeInstruction = barcodeInstruction;
  }

  public ASINPrepInstructions prepGuidance(PrepGuidance prepGuidance) {
    this.prepGuidance = prepGuidance;
    return this;
  }

   /**
   * Get prepGuidance
   * @return prepGuidance
  **/
  @ApiModelProperty(value = "")
  public PrepGuidance getPrepGuidance() {
    return prepGuidance;
  }

  public void setPrepGuidance(PrepGuidance prepGuidance) {
    this.prepGuidance = prepGuidance;
  }

  public ASINPrepInstructions prepInstructionList(PrepInstructionList prepInstructionList) {
    this.prepInstructionList = prepInstructionList;
    return this;
  }

   /**
   * Get prepInstructionList
   * @return prepInstructionList
  **/
  @ApiModelProperty(value = "")
  public PrepInstructionList getPrepInstructionList() {
    return prepInstructionList;
  }

  public void setPrepInstructionList(PrepInstructionList prepInstructionList) {
    this.prepInstructionList = prepInstructionList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ASINPrepInstructions asINPrepInstructions = (ASINPrepInstructions) o;
    return Objects.equals(this.ASIN, asINPrepInstructions.ASIN) &&
        Objects.equals(this.barcodeInstruction, asINPrepInstructions.barcodeInstruction) &&
        Objects.equals(this.prepGuidance, asINPrepInstructions.prepGuidance) &&
        Objects.equals(this.prepInstructionList, asINPrepInstructions.prepInstructionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, barcodeInstruction, prepGuidance, prepInstructionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ASINPrepInstructions {\n");
    
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    barcodeInstruction: ").append(toIndentedString(barcodeInstruction)).append("\n");
    sb.append("    prepGuidance: ").append(toIndentedString(prepGuidance)).append("\n");
    sb.append("    prepInstructionList: ").append(toIndentedString(prepInstructionList)).append("\n");
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

