/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fbav0;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * The weight of the package.
 */
@ApiModel(description = "The weight of the package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:45:02.096-05:00")
public class Weight {
    @SerializedName("Value")
    private BigDecimal value = null;

    @SerializedName("Unit")
    private UnitOfWeight unit = null;

    public Weight value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * The weight value.
     *
     * @return value
     **/
    @ApiModelProperty(required = true, value = "The weight value.")
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Weight unit(UnitOfWeight unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    @ApiModelProperty(required = true, value = "")
    public UnitOfWeight getUnit() {
        return unit;
    }

    public void setUnit(UnitOfWeight unit) {
        this.unit = unit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Weight weight = (Weight) o;
        return Objects.equals(this.value, weight.value) &&
                Objects.equals(this.unit, weight.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Weight {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

