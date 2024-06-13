// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Append value for a Variable of type Array.
 */
@Fluent
public class AppendVariableActivity extends ControlActivity {
    /*
     * Type of activity.
     */
    private String type = "AppendVariable";

    /*
     * Name of the variable whose value needs to be appended to.
     */
    private String variableName;

    /*
     * Value to be appended. Could be a static value or Expression
     */
    private Object value;

    /**
     * Creates an instance of AppendVariableActivity class.
     */
    public AppendVariableActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the variableName property: Name of the variable whose value needs to be appended to.
     * 
     * @return the variableName value.
     */
    public String getVariableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Name of the variable whose value needs to be appended to.
     * 
     * @param variableName the variableName value to set.
     * @return the AppendVariableActivity object itself.
     */
    public AppendVariableActivity setVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get the value property: Value to be appended. Could be a static value or Expression.
     * 
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: Value to be appended. Could be a static value or Expression.
     * 
     * @param value the value value to set.
     * @return the AppendVariableActivity object itself.
     */
    public AppendVariableActivity setValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("state", getState() == null ? null : getState().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            getOnInactiveMarkAs() == null ? null : getOnInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", getDependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", getUserProperties(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        if (variableName != null || value != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeStringField("variableName", this.variableName);
            jsonWriter.writeUntypedField("value", this.value);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AppendVariableActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppendVariableActivity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AppendVariableActivity.
     */
    public static AppendVariableActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppendVariableActivity deserializedAppendVariableActivity = new AppendVariableActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAppendVariableActivity.setName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedAppendVariableActivity.setDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedAppendVariableActivity.setState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedAppendVariableActivity
                        .setOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedAppendVariableActivity.setDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedAppendVariableActivity.setUserProperties(userProperties);
                } else if ("type".equals(fieldName)) {
                    deserializedAppendVariableActivity.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("variableName".equals(fieldName)) {
                            deserializedAppendVariableActivity.variableName = reader.getString();
                        } else if ("value".equals(fieldName)) {
                            deserializedAppendVariableActivity.value = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAppendVariableActivity.setAdditionalProperties(additionalProperties);

            return deserializedAppendVariableActivity;
        });
    }
}
