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
import java.util.Map;

/**
 * The data stored in JSON format.
 */
@Fluent
public final class JsonFormat extends DatasetStorageFormat {
    /*
     * Type of dataset storage format.
     */
    private String type = "JsonFormat";

    /*
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     */
    private Object filePattern;

    /*
     * The character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with resultType string).
     */
    private Object nestingSeparator;

    /*
     * The code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name' column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     */
    private Object encodingName;

    /*
     * The JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with resultType string).
     */
    private Object jsonNodeReference;

    /*
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     */
    private Object jsonPathDefinition;

    /**
     * Creates an instance of JsonFormat class.
     */
    public JsonFormat() {
    }

    /**
     * Get the type property: Type of dataset storage format.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the filePattern property: File pattern of JSON. To be more specific, the way of separating a collection of
     * JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     * 
     * @return the filePattern value.
     */
    public Object getFilePattern() {
        return this.filePattern;
    }

    /**
     * Set the filePattern property: File pattern of JSON. To be more specific, the way of separating a collection of
     * JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     * 
     * @param filePattern the filePattern value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat setFilePattern(Object filePattern) {
        this.filePattern = filePattern;
        return this;
    }

    /**
     * Get the nestingSeparator property: The character used to separate nesting levels. Default value is '.' (dot).
     * Type: string (or Expression with resultType string).
     * 
     * @return the nestingSeparator value.
     */
    public Object getNestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set the nestingSeparator property: The character used to separate nesting levels. Default value is '.' (dot).
     * Type: string (or Expression with resultType string).
     * 
     * @param nestingSeparator the nestingSeparator value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat setNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

    /**
     * Get the encodingName property: The code page name of the preferred encoding. If not provided, the default value
     * is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values
     * can be found in the 'Name' column of the table of encodings in the following reference:
     * https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     * @return the encodingName value.
     */
    public Object getEncodingName() {
        return this.encodingName;
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If not provided, the default value
     * is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values
     * can be found in the 'Name' column of the table of encodings in the following reference:
     * https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     * @param encodingName the encodingName value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat setEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the jsonNodeReference property: The JSONPath of the JSON array element to be flattened. Example:
     * "$.ArrayPath". Type: string (or Expression with resultType string).
     * 
     * @return the jsonNodeReference value.
     */
    public Object getJsonNodeReference() {
        return this.jsonNodeReference;
    }

    /**
     * Set the jsonNodeReference property: The JSONPath of the JSON array element to be flattened. Example:
     * "$.ArrayPath". Type: string (or Expression with resultType string).
     * 
     * @param jsonNodeReference the jsonNodeReference value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat setJsonNodeReference(Object jsonNodeReference) {
        this.jsonNodeReference = jsonNodeReference;
        return this;
    }

    /**
     * Get the jsonPathDefinition property: The JSONPath definition for each column mapping with a customized column
     * name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array
     * chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path",
     * "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     * 
     * @return the jsonPathDefinition value.
     */
    public Object getJsonPathDefinition() {
        return this.jsonPathDefinition;
    }

    /**
     * Set the jsonPathDefinition property: The JSONPath definition for each column mapping with a customized column
     * name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array
     * chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path",
     * "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     * 
     * @param jsonPathDefinition the jsonPathDefinition value to set.
     * @return the JsonFormat object itself.
     */
    public JsonFormat setJsonPathDefinition(Object jsonPathDefinition) {
        this.jsonPathDefinition = jsonPathDefinition;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonFormat setSerializer(Object serializer) {
        super.setSerializer(serializer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonFormat setDeserializer(Object deserializer) {
        super.setDeserializer(deserializer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("serializer", getSerializer());
        jsonWriter.writeUntypedField("deserializer", getDeserializer());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("filePattern", this.filePattern);
        jsonWriter.writeUntypedField("nestingSeparator", this.nestingSeparator);
        jsonWriter.writeUntypedField("encodingName", this.encodingName);
        jsonWriter.writeUntypedField("jsonNodeReference", this.jsonNodeReference);
        jsonWriter.writeUntypedField("jsonPathDefinition", this.jsonPathDefinition);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JsonFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JsonFormat if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the JsonFormat.
     */
    public static JsonFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JsonFormat deserializedJsonFormat = new JsonFormat();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serializer".equals(fieldName)) {
                    deserializedJsonFormat.setSerializer(reader.readUntyped());
                } else if ("deserializer".equals(fieldName)) {
                    deserializedJsonFormat.setDeserializer(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedJsonFormat.type = reader.getString();
                } else if ("filePattern".equals(fieldName)) {
                    deserializedJsonFormat.filePattern = reader.readUntyped();
                } else if ("nestingSeparator".equals(fieldName)) {
                    deserializedJsonFormat.nestingSeparator = reader.readUntyped();
                } else if ("encodingName".equals(fieldName)) {
                    deserializedJsonFormat.encodingName = reader.readUntyped();
                } else if ("jsonNodeReference".equals(fieldName)) {
                    deserializedJsonFormat.jsonNodeReference = reader.readUntyped();
                } else if ("jsonPathDefinition".equals(fieldName)) {
                    deserializedJsonFormat.jsonPathDefinition = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedJsonFormat.setAdditionalProperties(additionalProperties);

            return deserializedJsonFormat;
        });
    }
}
