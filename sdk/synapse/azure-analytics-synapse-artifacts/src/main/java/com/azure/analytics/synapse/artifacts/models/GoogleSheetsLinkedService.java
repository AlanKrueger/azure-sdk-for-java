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
 * Linked service for GoogleSheets.
 */
@Fluent
public class GoogleSheetsLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "GoogleSheets";

    /*
     * The api token for the GoogleSheets source.
     */
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /**
     * Creates an instance of GoogleSheetsLinkedService class.
     */
    public GoogleSheetsLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the apiToken property: The api token for the GoogleSheets source.
     * 
     * @return the apiToken value.
     */
    public SecretBase getApiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the GoogleSheets source.
     * 
     * @param apiToken the apiToken value to set.
     * @return the GoogleSheetsLinkedService object itself.
     */
    public GoogleSheetsLinkedService setApiToken(SecretBase apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the GoogleSheetsLinkedService object itself.
     */
    public GoogleSheetsLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoogleSheetsLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoogleSheetsLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoogleSheetsLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoogleSheetsLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("connectVia", getConnectVia());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("type", this.type);
        if (apiToken != null || encryptedCredential != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeJsonField("apiToken", this.apiToken);
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
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
     * Reads an instance of GoogleSheetsLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GoogleSheetsLinkedService if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GoogleSheetsLinkedService.
     */
    public static GoogleSheetsLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GoogleSheetsLinkedService deserializedGoogleSheetsLinkedService = new GoogleSheetsLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectVia".equals(fieldName)) {
                    deserializedGoogleSheetsLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedGoogleSheetsLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedGoogleSheetsLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedGoogleSheetsLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedGoogleSheetsLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("apiToken".equals(fieldName)) {
                            deserializedGoogleSheetsLinkedService.apiToken = SecretBase.fromJson(reader);
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedGoogleSheetsLinkedService.encryptedCredential = reader.readUntyped();
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
            deserializedGoogleSheetsLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedGoogleSheetsLinkedService;
        });
    }
}
