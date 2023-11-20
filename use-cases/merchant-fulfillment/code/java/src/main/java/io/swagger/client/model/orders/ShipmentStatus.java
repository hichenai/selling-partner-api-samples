/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.orders;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The shipment status to apply.
 */
@JsonAdapter(ShipmentStatus.Adapter.class)
public enum ShipmentStatus {
  
  READYFORPICKUP("ReadyForPickup"),
  
  PICKEDUP("PickedUp"),
  
  REFUSEDPICKUP("RefusedPickup");

  private String value;

  ShipmentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentStatus fromValue(String text) {
    for (ShipmentStatus b : ShipmentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ShipmentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShipmentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShipmentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShipmentStatus.fromValue(String.valueOf(value));
    }
  }
}

