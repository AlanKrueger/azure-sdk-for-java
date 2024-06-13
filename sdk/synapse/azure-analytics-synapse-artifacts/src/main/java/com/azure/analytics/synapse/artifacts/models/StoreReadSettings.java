// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Connector read setting.
 */
@Fluent
public class StoreReadSettings implements JsonSerializable<StoreReadSettings> {
    /*
     * The read setting type.
     */
    private String type;

    /*
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     */
    private Object maxConcurrentConnections;

    /*
     * Connector read setting.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of StoreReadSettings class.
     */
    public StoreReadSettings() {
        this.type = "StoreReadSettings";
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the maxConcurrentConnections property: The maximum concurrent connection count for the source data store.
     * Type: integer (or Expression with resultType integer).
     * 
     * @return the maxConcurrentConnections value.
     */
    public Object getMaxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maxConcurrentConnections property: The maximum concurrent connection count for the source data store.
     * Type: integer (or Expression with resultType integer).
     * 
     * @param maxConcurrentConnections the maxConcurrentConnections value to set.
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the additionalProperties property: Connector read setting.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Connector read setting.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("maxConcurrentConnections", this.maxConcurrentConnections);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StoreReadSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StoreReadSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StoreReadSettings.
     */
    public static StoreReadSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AzureBlobStorageReadSettings".equals(discriminatorValue)) {
                    return AzureBlobStorageReadSettings.fromJson(readerToUse.reset());
                } else if ("AzureBlobFSReadSettings".equals(discriminatorValue)) {
                    return AzureBlobFSReadSettings.fromJson(readerToUse.reset());
                } else if ("AzureDataLakeStoreReadSettings".equals(discriminatorValue)) {
                    return AzureDataLakeStoreReadSettings.fromJson(readerToUse.reset());
                } else if ("AmazonS3ReadSettings".equals(discriminatorValue)) {
                    return AmazonS3ReadSettings.fromJson(readerToUse.reset());
                } else if ("FileServerReadSettings".equals(discriminatorValue)) {
                    return FileServerReadSettings.fromJson(readerToUse.reset());
                } else if ("AzureFileStorageReadSettings".equals(discriminatorValue)) {
                    return AzureFileStorageReadSettings.fromJson(readerToUse.reset());
                } else if ("GoogleCloudStorageReadSettings".equals(discriminatorValue)) {
                    return GoogleCloudStorageReadSettings.fromJson(readerToUse.reset());
                } else if ("FtpReadSettings".equals(discriminatorValue)) {
                    return FtpReadSettings.fromJson(readerToUse.reset());
                } else if ("SftpReadSettings".equals(discriminatorValue)) {
                    return SftpReadSettings.fromJson(readerToUse.reset());
                } else if ("HttpReadSettings".equals(discriminatorValue)) {
                    return HttpReadSettings.fromJson(readerToUse.reset());
                } else if ("HdfsReadSettings".equals(discriminatorValue)) {
                    return HdfsReadSettings.fromJson(readerToUse.reset());
                } else if ("LakeHouseReadSettings".equals(discriminatorValue)) {
                    return LakeHouseReadSettings.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static StoreReadSettings fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StoreReadSettings deserializedStoreReadSettings = new StoreReadSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedStoreReadSettings.type = reader.getString();
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedStoreReadSettings.maxConcurrentConnections = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedStoreReadSettings.additionalProperties = additionalProperties;

            return deserializedStoreReadSettings;
        });
    }
}
