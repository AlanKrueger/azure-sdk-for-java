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
 * A copy activity source for sharePoint online list source.
 */
@Fluent
public final class SharePointOnlineListSource extends CopySource {
    /*
     * Copy source type.
     */
    private String type = "SharePointOnlineListSource";

    /*
     * The OData query to filter the data in SharePoint Online list. For example, "$top=1". Type: string (or Expression with resultType string).
     */
    private Object query;

    /*
     * The wait time to get a response from SharePoint Online. Default value is 5 minutes (00:05:00). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    private Object httpRequestTimeout;

    /**
     * Creates an instance of SharePointOnlineListSource class.
     */
    public SharePointOnlineListSource() {
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
     * Get the query property: The OData query to filter the data in SharePoint Online list. For example, "$top=1".
     * Type: string (or Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The OData query to filter the data in SharePoint Online list. For example, "$top=1".
     * Type: string (or Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the SharePointOnlineListSource object itself.
     */
    public SharePointOnlineListSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the httpRequestTimeout property: The wait time to get a response from SharePoint Online. Default value is 5
     * minutes (00:05:00). Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the httpRequestTimeout value.
     */
    public Object getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the httpRequestTimeout property: The wait time to get a response from SharePoint Online. Default value is 5
     * minutes (00:05:00). Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param httpRequestTimeout the httpRequestTimeout value to set.
     * @return the SharePointOnlineListSource object itself.
     */
    public SharePointOnlineListSource setHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
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
        jsonWriter.writeUntypedField("query", this.query);
        jsonWriter.writeUntypedField("httpRequestTimeout", this.httpRequestTimeout);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharePointOnlineListSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharePointOnlineListSource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharePointOnlineListSource.
     */
    public static SharePointOnlineListSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharePointOnlineListSource deserializedSharePointOnlineListSource = new SharePointOnlineListSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedSharePointOnlineListSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedSharePointOnlineListSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSharePointOnlineListSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedSharePointOnlineListSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedSharePointOnlineListSource.query = reader.readUntyped();
                } else if ("httpRequestTimeout".equals(fieldName)) {
                    deserializedSharePointOnlineListSource.httpRequestTimeout = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSharePointOnlineListSource.setAdditionalProperties(additionalProperties);

            return deserializedSharePointOnlineListSource;
        });
    }
}
