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
import io.swagger.client.model.fbav2024.AppointmentSlotTime;

import java.io.IOException;

/**
 * The fulfillment center appointment slot for the transportation option.
 */
@ApiModel(description = "The fulfillment center appointment slot for the transportation option.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class AppointmentSlot {
    @SerializedName("slotId")
    private String slotId = null;

    @SerializedName("slotTime")
    private AppointmentSlotTime slotTime = null;

    public AppointmentSlot slotId(String slotId) {
        this.slotId = slotId;
        return this;
    }

    /**
     * An identifier to a self-ship appointment slot.
     *
     * @return slotId
     **/
    @ApiModelProperty(required = true, value = "An identifier to a self-ship appointment slot.")
    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public AppointmentSlot slotTime(AppointmentSlotTime slotTime) {
        this.slotTime = slotTime;
        return this;
    }

    /**
     * Get slotTime
     *
     * @return slotTime
     **/
    @ApiModelProperty(required = true, value = "")
    public AppointmentSlotTime getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(AppointmentSlotTime slotTime) {
        this.slotTime = slotTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppointmentSlot appointmentSlot = (AppointmentSlot) o;
        return Objects.equals(this.slotId, appointmentSlot.slotId) &&
                Objects.equals(this.slotTime, appointmentSlot.slotTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotId, slotTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppointmentSlot {\n");

        sb.append("    slotId: ").append(toIndentedString(slotId)).append("\n");
        sb.append("    slotTime: ").append(toIndentedString(slotTime)).append("\n");
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

