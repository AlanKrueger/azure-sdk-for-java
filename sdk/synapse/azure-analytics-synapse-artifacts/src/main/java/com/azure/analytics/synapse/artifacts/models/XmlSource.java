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
 * A copy activity Xml source.
 */
@Fluent
public final class XmlSource extends CopySource {
    /*
     * Copy source type.
     */
    private String type = "XmlSource";

    /*
     * Xml store settings.
     */
    private StoreReadSettings storeSettings;

    /*
     * Xml format settings.
     */
    private XmlReadSettings formatSettings;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     */
    private Object additionalColumns;

    /**
     * Creates an instance of XmlSource class.
     */
    public XmlSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the storeSettings property: Xml store settings.
     * 
     * @return the storeSettings value.
     */
    public StoreReadSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Xml store settings.
     * 
     * @param storeSettings the storeSettings value to set.
     * @return the XmlSource object itself.
     */
    public XmlSource setStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Xml format settings.
     * 
     * @return the formatSettings value.
     */
    public XmlReadSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Xml format settings.
     * 
     * @param formatSettings the formatSettings value to set.
     * @return the XmlSource object itself.
     */
    public XmlSource setFormatSettings(XmlReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the XmlSource object itself.
     */
    public XmlSource setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("storeSettings", this.storeSettings);
        jsonWriter.writeJsonField("formatSettings", this.formatSettings);
        jsonWriter.writeUntypedField("additionalColumns", this.additionalColumns);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of XmlSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of XmlSource if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the XmlSource.
     */
    public static XmlSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            XmlSource deserializedXmlSource = new XmlSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedXmlSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedXmlSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedXmlSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedXmlSource.type = reader.getString();
                } else if ("storeSettings".equals(fieldName)) {
                    deserializedXmlSource.storeSettings = StoreReadSettings.fromJson(reader);
                } else if ("formatSettings".equals(fieldName)) {
                    deserializedXmlSource.formatSettings = XmlReadSettings.fromJson(reader);
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedXmlSource.additionalColumns = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedXmlSource.setAdditionalProperties(additionalProperties);

            return deserializedXmlSource;
        });
    }
}
