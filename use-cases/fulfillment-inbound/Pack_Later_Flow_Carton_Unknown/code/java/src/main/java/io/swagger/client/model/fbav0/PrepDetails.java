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

/**
 * Preparation instructions and who is responsible for the preparation.
 */
@ApiModel(description = "Preparation instructions and who is responsible for the preparation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-06T15:45:02.096-05:00")
public class PrepDetails {
    @SerializedName("PrepInstruction")
    private PrepInstruction prepInstruction = null;

    @SerializedName("PrepOwner")
    private PrepOwner prepOwner = null;

    public PrepDetails prepInstruction(PrepInstruction prepInstruction) {
        this.prepInstruction = prepInstruction;
        return this;
    }

    /**
     * Get prepInstruction
     *
     * @return prepInstruction
     **/
    @ApiModelProperty(required = true, value = "")
    public PrepInstruction getPrepInstruction() {
        return prepInstruction;
    }

    public void setPrepInstruction(PrepInstruction prepInstruction) {
        this.prepInstruction = prepInstruction;
    }

    public PrepDetails prepOwner(PrepOwner prepOwner) {
        this.prepOwner = prepOwner;
        return this;
    }

    /**
     * Get prepOwner
     *
     * @return prepOwner
     **/
    @ApiModelProperty(required = true, value = "")
    public PrepOwner getPrepOwner() {
        return prepOwner;
    }

    public void setPrepOwner(PrepOwner prepOwner) {
        this.prepOwner = prepOwner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrepDetails prepDetails = (PrepDetails) o;
        return Objects.equals(this.prepInstruction, prepDetails.prepInstruction) &&
                Objects.equals(this.prepOwner, prepDetails.prepOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prepInstruction, prepOwner);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrepDetails {\n");

        sb.append("    prepInstruction: ").append(toIndentedString(prepInstruction)).append("\n");
        sb.append("    prepOwner: ").append(toIndentedString(prepOwner)).append("\n");
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

