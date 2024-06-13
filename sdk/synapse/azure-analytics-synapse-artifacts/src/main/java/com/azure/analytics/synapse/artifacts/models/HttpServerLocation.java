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
 * The location of http server.
 */
@Fluent
public final class HttpServerLocation extends DatasetLocation {
    /*
     * Type of dataset storage location.
     */
    private String type = "HttpServerLocation";

    /*
     * Specify the relativeUrl of http server. Type: string (or Expression with resultType string)
     */
    private Object relativeUrl;

    /**
     * Creates an instance of HttpServerLocation class.
     */
    public HttpServerLocation() {
    }

    /**
     * Get the type property: Type of dataset storage location.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the relativeUrl property: Specify the relativeUrl of http server. Type: string (or Expression with resultType
     * string).
     * 
     * @return the relativeUrl value.
     */
    public Object getRelativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: Specify the relativeUrl of http server. Type: string (or Expression with resultType
     * string).
     * 
     * @param relativeUrl the relativeUrl value to set.
     * @return the HttpServerLocation object itself.
     */
    public HttpServerLocation setRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpServerLocation setFolderPath(Object folderPath) {
        super.setFolderPath(folderPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpServerLocation setFileName(Object fileName) {
        super.setFileName(fileName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("folderPath", getFolderPath());
        jsonWriter.writeUntypedField("fileName", getFileName());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("relativeUrl", this.relativeUrl);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HttpServerLocation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HttpServerLocation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HttpServerLocation.
     */
    public static HttpServerLocation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HttpServerLocation deserializedHttpServerLocation = new HttpServerLocation();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("folderPath".equals(fieldName)) {
                    deserializedHttpServerLocation.setFolderPath(reader.readUntyped());
                } else if ("fileName".equals(fieldName)) {
                    deserializedHttpServerLocation.setFileName(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedHttpServerLocation.type = reader.getString();
                } else if ("relativeUrl".equals(fieldName)) {
                    deserializedHttpServerLocation.relativeUrl = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedHttpServerLocation.setAdditionalProperties(additionalProperties);

            return deserializedHttpServerLocation;
        });
    }
}
