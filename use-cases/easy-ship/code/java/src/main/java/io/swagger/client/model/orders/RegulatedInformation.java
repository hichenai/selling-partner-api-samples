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
import java.util.ArrayList;
import java.util.List;

/**
 * The regulated information collected during purchase and used to verify the order.
 */
@ApiModel(description = "The regulated information collected during purchase and used to verify the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-10T13:35:24.271+09:00")
public class RegulatedInformation {
  @SerializedName("Fields")
  private List<RegulatedInformationField> fields = new ArrayList<RegulatedInformationField>();

  public RegulatedInformation fields(List<RegulatedInformationField> fields) {
    this.fields = fields;
    return this;
  }

  public RegulatedInformation addFieldsItem(RegulatedInformationField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of regulated information fields as collected from the regulatory form.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "A list of regulated information fields as collected from the regulatory form.")
  public List<RegulatedInformationField> getFields() {
    return fields;
  }

  public void setFields(List<RegulatedInformationField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatedInformation regulatedInformation = (RegulatedInformation) o;
    return Objects.equals(this.fields, regulatedInformation.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatedInformation {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

