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
 * Parquet dataset.
 */
@Fluent
public class ParquetDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "Parquet";

    /*
     * The location of the parquet storage.
     */
    private DatasetLocation location;

    /*
     * A string from ParquetCompressionCodecEnum or an expression
     */
    private Object compressionCodec;

    /**
     * Creates an instance of ParquetDataset class.
     */
    public ParquetDataset() {
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
     * Get the location property: The location of the parquet storage.
     * 
     * @return the location value.
     */
    public DatasetLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location of the parquet storage.
     * 
     * @param location the location value to set.
     * @return the ParquetDataset object itself.
     */
    public ParquetDataset setLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the compressionCodec property: A string from ParquetCompressionCodecEnum or an expression.
     * 
     * @return the compressionCodec value.
     */
    public Object getCompressionCodec() {
        return this.compressionCodec;
    }

    /**
     * Set the compressionCodec property: A string from ParquetCompressionCodecEnum or an expression.
     * 
     * @param compressionCodec the compressionCodec value to set.
     * @return the ParquetDataset object itself.
     */
    public ParquetDataset setCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetDataset setFolder(DatasetFolder folder) {
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
        if (location != null || compressionCodec != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeJsonField("location", this.location);
            jsonWriter.writeUntypedField("compressionCodec", this.compressionCodec);
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
     * Reads an instance of ParquetDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParquetDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ParquetDataset.
     */
    public static ParquetDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParquetDataset deserializedParquetDataset = new ParquetDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedParquetDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedParquetDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedParquetDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedParquetDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedParquetDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedParquetDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedParquetDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedParquetDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("location".equals(fieldName)) {
                            deserializedParquetDataset.location = DatasetLocation.fromJson(reader);
                        } else if ("compressionCodec".equals(fieldName)) {
                            deserializedParquetDataset.compressionCodec = reader.readUntyped();
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
            deserializedParquetDataset.setAdditionalProperties(additionalProperties);

            return deserializedParquetDataset;
        });
    }
}
