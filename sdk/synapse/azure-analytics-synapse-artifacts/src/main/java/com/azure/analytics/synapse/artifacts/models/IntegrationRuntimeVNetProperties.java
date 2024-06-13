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
import java.util.List;
import java.util.Map;

/**
 * VNet properties for managed integration runtime.
 */
@Fluent
public final class IntegrationRuntimeVNetProperties implements JsonSerializable<IntegrationRuntimeVNetProperties> {
    /*
     * The ID of the VNet that this integration runtime will join.
     */
    private String vNetId;

    /*
     * The name of the subnet this integration runtime will join.
     */
    private String subnet;

    /*
     * Resource IDs of the public IP addresses that this integration runtime will use.
     */
    private List<String> publicIPs;

    /*
     * VNet properties for managed integration runtime.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of IntegrationRuntimeVNetProperties class.
     */
    public IntegrationRuntimeVNetProperties() {
    }

    /**
     * Get the vNetId property: The ID of the VNet that this integration runtime will join.
     * 
     * @return the vNetId value.
     */
    public String getVNetId() {
        return this.vNetId;
    }

    /**
     * Set the vNetId property: The ID of the VNet that this integration runtime will join.
     * 
     * @param vNetId the vNetId value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setVNetId(String vNetId) {
        this.vNetId = vNetId;
        return this;
    }

    /**
     * Get the subnet property: The name of the subnet this integration runtime will join.
     * 
     * @return the subnet value.
     */
    public String getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The name of the subnet this integration runtime will join.
     * 
     * @param subnet the subnet value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIPs property: Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     * @return the publicIPs value.
     */
    public List<String> getPublicIPs() {
        return this.publicIPs;
    }

    /**
     * Set the publicIPs property: Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     * @param publicIPs the publicIPs value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setPublicIPs(List<String> publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

    /**
     * Get the additionalProperties property: VNet properties for managed integration runtime.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: VNet properties for managed integration runtime.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vNetId", this.vNetId);
        jsonWriter.writeStringField("subnet", this.subnet);
        jsonWriter.writeArrayField("publicIPs", this.publicIPs, (writer, element) -> writer.writeString(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeVNetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeVNetProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntegrationRuntimeVNetProperties.
     */
    public static IntegrationRuntimeVNetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeVNetProperties deserializedIntegrationRuntimeVNetProperties
                = new IntegrationRuntimeVNetProperties();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vNetId".equals(fieldName)) {
                    deserializedIntegrationRuntimeVNetProperties.vNetId = reader.getString();
                } else if ("subnet".equals(fieldName)) {
                    deserializedIntegrationRuntimeVNetProperties.subnet = reader.getString();
                } else if ("publicIPs".equals(fieldName)) {
                    List<String> publicIPs = reader.readArray(reader1 -> reader1.getString());
                    deserializedIntegrationRuntimeVNetProperties.publicIPs = publicIPs;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedIntegrationRuntimeVNetProperties.additionalProperties = additionalProperties;

            return deserializedIntegrationRuntimeVNetProperties;
        });
    }
}
