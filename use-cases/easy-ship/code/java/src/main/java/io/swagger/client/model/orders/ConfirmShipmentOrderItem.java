/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  **Note:** The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.orders;

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
 * A single order item.
 */
@ApiModel(description = "A single order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-10T13:35:24.271+09:00")
public class ConfirmShipmentOrderItem {
  @SerializedName("orderItemId")
  private String orderItemId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("transparencyCodes")
  private TransparencyCodeList transparencyCodes = null;

  public ConfirmShipmentOrderItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * The unique identifier of the order item.
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the order item.")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public ConfirmShipmentOrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of the item.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ConfirmShipmentOrderItem transparencyCodes(TransparencyCodeList transparencyCodes) {
    this.transparencyCodes = transparencyCodes;
    return this;
  }

   /**
   * The list of transparency codes.
   * @return transparencyCodes
  **/
  @ApiModelProperty(value = "The list of transparency codes.")
  public TransparencyCodeList getTransparencyCodes() {
    return transparencyCodes;
  }

  public void setTransparencyCodes(TransparencyCodeList transparencyCodes) {
    this.transparencyCodes = transparencyCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmShipmentOrderItem confirmShipmentOrderItem = (ConfirmShipmentOrderItem) o;
    return Objects.equals(this.orderItemId, confirmShipmentOrderItem.orderItemId) &&
        Objects.equals(this.quantity, confirmShipmentOrderItem.quantity) &&
        Objects.equals(this.transparencyCodes, confirmShipmentOrderItem.transparencyCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, quantity, transparencyCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmShipmentOrderItem {\n");
    
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    transparencyCodes: ").append(toIndentedString(transparencyCodes)).append("\n");
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

