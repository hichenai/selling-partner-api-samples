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

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Item preparation instructions.
 */
@JsonAdapter(PrepGuidance.Adapter.class)
public enum PrepGuidance {

    CONSULTHELPDOCUMENTS("ConsultHelpDocuments"),

    NOADDITIONALPREPREQUIRED("NoAdditionalPrepRequired"),

    SEEPREPINSTRUCTIONSLIST("SeePrepInstructionsList");

    private final String value;

    PrepGuidance(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PrepGuidance fromValue(String text) {
        for (PrepGuidance b : PrepGuidance.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<PrepGuidance> {
        @Override
        public void write(final JsonWriter jsonWriter, final PrepGuidance enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PrepGuidance read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PrepGuidance.fromValue(String.valueOf(value));
        }
    }
}

