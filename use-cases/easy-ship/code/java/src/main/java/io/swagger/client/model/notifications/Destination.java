/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, refer to the [Notifications Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.notifications;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about the destination created when you call the &#x60;createDestination&#x60; operation.
 */
@ApiModel(description = "Information about the destination created when you call the `createDestination` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-02T15:59:48.383+09:00")
public class Destination {
  @SerializedName("name")
  private String name = null;

  @SerializedName("destinationId")
  private String destinationId = null;

  @SerializedName("resource")
  private DestinationResource resource = null;

  public Destination name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The developer-defined name for this destination.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The developer-defined name for this destination.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Destination destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * The destination identifier generated when you created the destination.
   * @return destinationId
  **/
  @ApiModelProperty(required = true, value = "The destination identifier generated when you created the destination.")
  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public Destination resource(DestinationResource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource that will receive notifications associated with this destination.
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "The resource that will receive notifications associated with this destination.")
  public DestinationResource getResource() {
    return resource;
  }

  public void setResource(DestinationResource resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Destination destination = (Destination) o;
    return Objects.equals(this.name, destination.name) &&
        Objects.equals(this.destinationId, destination.destinationId) &&
        Objects.equals(this.resource, destination.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, destinationId, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destination {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

