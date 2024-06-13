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
 * The Office365 account.
 */
@Fluent
public class Office365Dataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "Office365Table";

    /*
     * Name of the dataset to extract from Office 365. Type: string (or Expression with resultType string).
     */
    private Object tableName;

    /*
     * A predicate expression that can be used to filter the specific rows to extract from Office 365. Type: string (or Expression with resultType string).
     */
    private Object predicate;

    /**
     * Creates an instance of Office365Dataset class.
     */
    public Office365Dataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the tableName property: Name of the dataset to extract from Office 365. Type: string (or Expression with
     * resultType string).
     * 
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: Name of the dataset to extract from Office 365. Type: string (or Expression with
     * resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the Office365Dataset object itself.
     */
    public Office365Dataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the predicate property: A predicate expression that can be used to filter the specific rows to extract from
     * Office 365. Type: string (or Expression with resultType string).
     * 
     * @return the predicate value.
     */
    public Object getPredicate() {
        return this.predicate;
    }

    /**
     * Set the predicate property: A predicate expression that can be used to filter the specific rows to extract from
     * Office 365. Type: string (or Expression with resultType string).
     * 
     * @param predicate the predicate value to set.
     * @return the Office365Dataset object itself.
     */
    public Office365Dataset setPredicate(Object predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Dataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeUntypedField("structure", getStructure());
        jsonWriter.writeUntypedField("schema", getSchema());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", getFolder());
        jsonWriter.writeStringField("type", this.type);
        if (tableName != null || predicate != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("tableName", this.tableName);
            jsonWriter.writeUntypedField("predicate", this.predicate);
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
     * Reads an instance of Office365Dataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Office365Dataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Office365Dataset.
     */
    public static Office365Dataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Office365Dataset deserializedOffice365Dataset = new Office365Dataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedOffice365Dataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedOffice365Dataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedOffice365Dataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedOffice365Dataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedOffice365Dataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedOffice365Dataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedOffice365Dataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedOffice365Dataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("tableName".equals(fieldName)) {
                            deserializedOffice365Dataset.tableName = reader.readUntyped();
                        } else if ("predicate".equals(fieldName)) {
                            deserializedOffice365Dataset.predicate = reader.readUntyped();
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
            deserializedOffice365Dataset.setAdditionalProperties(additionalProperties);

            return deserializedOffice365Dataset;
        });
    }
}
