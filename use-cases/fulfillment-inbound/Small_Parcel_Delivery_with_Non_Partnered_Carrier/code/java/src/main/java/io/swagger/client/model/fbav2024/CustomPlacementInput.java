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
import io.swagger.client.model.fbav2024.ItemInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provide units going to the warehouse.
 */
@ApiModel(description = "Provide units going to the warehouse.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class CustomPlacementInput {
  @SerializedName("items")
  private List<ItemInput> items = new ArrayList<ItemInput>();

  @SerializedName("warehouseId")
  private String warehouseId = null;

  public CustomPlacementInput items(List<ItemInput> items) {
    this.items = items;
    return this;
  }

  public CustomPlacementInput addItemsItem(ItemInput itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items included while creating Inbound Plan.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Items included while creating Inbound Plan.")
  public List<ItemInput> getItems() {
    return items;
  }

  public void setItems(List<ItemInput> items) {
    this.items = items;
  }

  public CustomPlacementInput warehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Warehouse Id.
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "Warehouse Id.")
  public String getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPlacementInput customPlacementInput = (CustomPlacementInput) o;
    return Objects.equals(this.items, customPlacementInput.items) &&
        Objects.equals(this.warehouseId, customPlacementInput.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, warehouseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPlacementInput {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
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

