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
import java.math.BigDecimal;

/**
 * Appointment details for carrier pickup or fulfillment center appointments.
 */
@ApiModel(description = "Appointment details for carrier pickup or fulfillment center appointments.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:26:38.822Z")
public class SelfShipAppointmentDetails {
    @SerializedName("appointmentId")
    private BigDecimal appointmentId = null;

    @SerializedName("appointmentSlotTime")
    private AppointmentSlotTime appointmentSlotTime = null;

    @SerializedName("appointmentStatus")
    private String appointmentStatus = null;

    public SelfShipAppointmentDetails appointmentId(BigDecimal appointmentId) {
        this.appointmentId = appointmentId;
        return this;
    }

    /**
     * Identifier for appointment.
     *
     * @return appointmentId
     **/
    @ApiModelProperty(value = "Identifier for appointment.")
    public BigDecimal getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(BigDecimal appointmentId) {
        this.appointmentId = appointmentId;
    }

    public SelfShipAppointmentDetails appointmentSlotTime(AppointmentSlotTime appointmentSlotTime) {
        this.appointmentSlotTime = appointmentSlotTime;
        return this;
    }

    /**
     * Get appointmentSlotTime
     *
     * @return appointmentSlotTime
     **/
    @ApiModelProperty(value = "")
    public AppointmentSlotTime getAppointmentSlotTime() {
        return appointmentSlotTime;
    }

    public void setAppointmentSlotTime(AppointmentSlotTime appointmentSlotTime) {
        this.appointmentSlotTime = appointmentSlotTime;
    }

    public SelfShipAppointmentDetails appointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
        return this;
    }

    /**
     * Status of the appointment.
     *
     * @return appointmentStatus
     **/
    @ApiModelProperty(value = "Status of the appointment.")
    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SelfShipAppointmentDetails selfShipAppointmentDetails = (SelfShipAppointmentDetails) o;
        return Objects.equals(this.appointmentId, selfShipAppointmentDetails.appointmentId) &&
                Objects.equals(this.appointmentSlotTime, selfShipAppointmentDetails.appointmentSlotTime) &&
                Objects.equals(this.appointmentStatus, selfShipAppointmentDetails.appointmentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, appointmentSlotTime, appointmentStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelfShipAppointmentDetails {\n");

        sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
        sb.append("    appointmentSlotTime: ").append(toIndentedString(appointmentSlotTime)).append("\n");
        sb.append("    appointmentStatus: ").append(toIndentedString(appointmentStatus)).append("\n");
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

