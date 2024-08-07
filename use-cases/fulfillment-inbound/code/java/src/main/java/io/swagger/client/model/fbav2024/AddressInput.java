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
 * Specific details to identify a place.
 */
@ApiModel(description = "Specific details to identify a place.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class AddressInput {
  @SerializedName("addressLine1")
  private String addressLine1 = null;

  @SerializedName("addressLine2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("stateOrProvinceCode")
  private String stateOrProvinceCode = null;

  public AddressInput addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Street address information.
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "Street address information.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AddressInput addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Additional street address information.
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Additional street address information.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AddressInput city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressInput companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The name of the business.
   * @return companyName
  **/
  @ApiModelProperty(value = "The name of the business.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public AddressInput countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code in two-character ISO 3166-1 alpha-2 format.
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "The country code in two-character ISO 3166-1 alpha-2 format.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressInput email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address.
   * @return email
  **/
  @ApiModelProperty(value = "The email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddressInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the individual who is the primary contact.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the individual who is the primary contact.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressInput phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "The phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AddressInput postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "The postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressInput stateOrProvinceCode(String stateOrProvinceCode) {
    this.stateOrProvinceCode = stateOrProvinceCode;
    return this;
  }

   /**
   * The state or province code.
   * @return stateOrProvinceCode
  **/
  @ApiModelProperty(value = "The state or province code.")
  public String getStateOrProvinceCode() {
    return stateOrProvinceCode;
  }

  public void setStateOrProvinceCode(String stateOrProvinceCode) {
    this.stateOrProvinceCode = stateOrProvinceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInput addressInput = (AddressInput) o;
    return Objects.equals(this.addressLine1, addressInput.addressLine1) &&
        Objects.equals(this.addressLine2, addressInput.addressLine2) &&
        Objects.equals(this.city, addressInput.city) &&
        Objects.equals(this.companyName, addressInput.companyName) &&
        Objects.equals(this.countryCode, addressInput.countryCode) &&
        Objects.equals(this.email, addressInput.email) &&
        Objects.equals(this.name, addressInput.name) &&
        Objects.equals(this.phoneNumber, addressInput.phoneNumber) &&
        Objects.equals(this.postalCode, addressInput.postalCode) &&
        Objects.equals(this.stateOrProvinceCode, addressInput.stateOrProvinceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, companyName, countryCode, email, name, phoneNumber, postalCode, stateOrProvinceCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInput {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvinceCode: ").append(toIndentedString(stateOrProvinceCode)).append("\n");
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

