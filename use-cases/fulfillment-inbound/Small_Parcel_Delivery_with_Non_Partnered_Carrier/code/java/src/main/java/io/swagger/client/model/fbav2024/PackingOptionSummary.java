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
import java.io.IOException;

/**
 * Summary information about a packing option.
 */
@ApiModel(description = "Summary information about a packing option.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class PackingOptionSummary {
  @SerializedName("packingOptionId")
  private String packingOptionId = null;

  @SerializedName("status")
  private String status = null;

  public PackingOptionSummary packingOptionId(String packingOptionId) {
    this.packingOptionId = packingOptionId;
    return this;
  }

   /**
   * Identifier of a packing option.
   * @return packingOptionId
  **/
  @ApiModelProperty(required = true, value = "Identifier of a packing option.")
  public String getPackingOptionId() {
    return packingOptionId;
  }

  public void setPackingOptionId(String packingOptionId) {
    this.packingOptionId = packingOptionId;
  }

  public PackingOptionSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of a packing option. Can be &#39;OFFERED&#39;, &#39;ACCEPTED&#39;, or &#39;EXPIRED&#39;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of a packing option. Can be 'OFFERED', 'ACCEPTED', or 'EXPIRED'.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackingOptionSummary packingOptionSummary = (PackingOptionSummary) o;
    return Objects.equals(this.packingOptionId, packingOptionSummary.packingOptionId) &&
        Objects.equals(this.status, packingOptionSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packingOptionId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingOptionSummary {\n");
    
    sb.append("    packingOptionId: ").append(toIndentedString(packingOptionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

