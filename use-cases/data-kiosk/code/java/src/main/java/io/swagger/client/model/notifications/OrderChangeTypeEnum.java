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

import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The supported order change type of ORDER_CHANGE notification.
 */
@JsonAdapter(OrderChangeTypeEnum.Adapter.class)
public enum OrderChangeTypeEnum {
  
  ORDERSTATUSCHANGE("OrderStatusChange"),
  
  BUYERREQUESTEDCHANGE("BuyerRequestedChange");

  private String value;

  OrderChangeTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderChangeTypeEnum fromValue(String text) {
    for (OrderChangeTypeEnum b : OrderChangeTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OrderChangeTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderChangeTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderChangeTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderChangeTypeEnum.fromValue(String.valueOf(value));
    }
  }
}

