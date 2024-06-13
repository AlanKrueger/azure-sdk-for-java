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
 * The content of the SQL script.
 */
@Fluent
public final class SqlScriptContent implements JsonSerializable<SqlScriptContent> {
    /*
     * SQL query to execute.
     */
    private String query;

    /*
     * The connection used to execute the SQL script.
     */
    private SqlConnection currentConnection;

    /*
     * Limit of results, '-1' for no limit.
     */
    private Integer resultLimit;

    /*
     * The metadata of the SQL script.
     */
    private SqlScriptMetadata metadata;

    /*
     * The content of the SQL script.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of SqlScriptContent class.
     */
    public SqlScriptContent() {
    }

    /**
     * Get the query property: SQL query to execute.
     * 
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: SQL query to execute.
     * 
     * @param query the query value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the currentConnection property: The connection used to execute the SQL script.
     * 
     * @return the currentConnection value.
     */
    public SqlConnection getCurrentConnection() {
        return this.currentConnection;
    }

    /**
     * Set the currentConnection property: The connection used to execute the SQL script.
     * 
     * @param currentConnection the currentConnection value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setCurrentConnection(SqlConnection currentConnection) {
        this.currentConnection = currentConnection;
        return this;
    }

    /**
     * Get the resultLimit property: Limit of results, '-1' for no limit.
     * 
     * @return the resultLimit value.
     */
    public Integer getResultLimit() {
        return this.resultLimit;
    }

    /**
     * Set the resultLimit property: Limit of results, '-1' for no limit.
     * 
     * @param resultLimit the resultLimit value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
        return this;
    }

    /**
     * Get the metadata property: The metadata of the SQL script.
     * 
     * @return the metadata value.
     */
    public SqlScriptMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata of the SQL script.
     * 
     * @param metadata the metadata value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setMetadata(SqlScriptMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the additionalProperties property: The content of the SQL script.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The content of the SQL script.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the SqlScriptContent object itself.
     */
    public SqlScriptContent setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("query", this.query);
        jsonWriter.writeJsonField("currentConnection", this.currentConnection);
        jsonWriter.writeNumberField("resultLimit", this.resultLimit);
        jsonWriter.writeJsonField("metadata", this.metadata);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlScriptContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlScriptContent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SqlScriptContent.
     */
    public static SqlScriptContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlScriptContent deserializedSqlScriptContent = new SqlScriptContent();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("query".equals(fieldName)) {
                    deserializedSqlScriptContent.query = reader.getString();
                } else if ("currentConnection".equals(fieldName)) {
                    deserializedSqlScriptContent.currentConnection = SqlConnection.fromJson(reader);
                } else if ("resultLimit".equals(fieldName)) {
                    deserializedSqlScriptContent.resultLimit = reader.getNullable(JsonReader::getInt);
                } else if ("metadata".equals(fieldName)) {
                    deserializedSqlScriptContent.metadata = SqlScriptMetadata.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSqlScriptContent.additionalProperties = additionalProperties;

            return deserializedSqlScriptContent;
        });
    }
}
