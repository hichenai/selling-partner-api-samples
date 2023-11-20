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
 * Request schema.
 */
@ApiModel(description = "Request schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-14T15:09:37.314+01:00")
public class GetAdditionalSellerInputsRequest {
  @SerializedName("ShippingServiceId")
  private String shippingServiceId = null;

  @SerializedName("ShipFromAddress")
  private Address shipFromAddress = null;

  @SerializedName("OrderId")
  private String orderId = null;

  public GetAdditionalSellerInputsRequest shippingServiceId(String shippingServiceId) {
    this.shippingServiceId = shippingServiceId;
    return this;
  }

   /**
   * Get shippingServiceId
   * @return shippingServiceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShippingServiceId() {
    return shippingServiceId;
  }

  public void setShippingServiceId(String shippingServiceId) {
    this.shippingServiceId = shippingServiceId;
  }

  public GetAdditionalSellerInputsRequest shipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
    return this;
  }

   /**
   * The address from which to ship.
   * @return shipFromAddress
  **/
  @ApiModelProperty(required = true, value = "The address from which to ship.")
  public Address getShipFromAddress() {
    return shipFromAddress;
  }

  public void setShipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  public GetAdditionalSellerInputsRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * An Amazon defined order identifier
   * @return orderId
  **/
  @ApiModelProperty(required = true, value = "An Amazon defined order identifier")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAdditionalSellerInputsRequest getAdditionalSellerInputsRequest = (GetAdditionalSellerInputsRequest) o;
    return Objects.equals(this.shippingServiceId, getAdditionalSellerInputsRequest.shippingServiceId) &&
        Objects.equals(this.shipFromAddress, getAdditionalSellerInputsRequest.shipFromAddress) &&
        Objects.equals(this.orderId, getAdditionalSellerInputsRequest.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingServiceId, shipFromAddress, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAdditionalSellerInputsRequest {\n");
    
    sb.append("    shippingServiceId: ").append(toIndentedString(shippingServiceId)).append("\n");
    sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

