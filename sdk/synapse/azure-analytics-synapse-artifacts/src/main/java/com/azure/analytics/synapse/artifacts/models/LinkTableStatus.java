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
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The LinkTableStatus model.
 */
@Fluent
public final class LinkTableStatus implements JsonSerializable<LinkTableStatus> {
    /*
     * ID provided by the client
     */
    private String id;

    /*
     * Link table status, please refer to this [articles](https://learn.microsoft.com/azure/synapse-analytics/synapse-link/sql-database-synapse-link#monitoring) for details.
     */
    private String status;

    /*
     * Link table error message
     */
    private String errorMessage;

    /*
     * Link table start time
     */
    private Object startTime;

    /*
     * Link table stop time
     */
    private Object stopTime;

    /*
     * Link table ID
     */
    private String linkTableId;

    /*
     * Link table error code
     */
    private String errorCode;

    /*
     * Link table last processed data time
     */
    private OffsetDateTime lastProcessedData;

    /*
     * Link table last transaction commit time
     */
    private OffsetDateTime lastTransactionCommitTime;

    /**
     * Creates an instance of LinkTableStatus class.
     */
    public LinkTableStatus() {
    }

    /**
     * Get the id property: ID provided by the client.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: ID provided by the client.
     * 
     * @param id the id value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: Link table status, please refer to this
     * [articles](https://learn.microsoft.com/azure/synapse-analytics/synapse-link/sql-database-synapse-link#monitoring)
     * for details.
     * 
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Link table status, please refer to this
     * [articles](https://learn.microsoft.com/azure/synapse-analytics/synapse-link/sql-database-synapse-link#monitoring)
     * for details.
     * 
     * @param status the status value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorMessage property: Link table error message.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Link table error message.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the startTime property: Link table start time.
     * 
     * @return the startTime value.
     */
    public Object getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Link table start time.
     * 
     * @param startTime the startTime value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setStartTime(Object startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the stopTime property: Link table stop time.
     * 
     * @return the stopTime value.
     */
    public Object getStopTime() {
        return this.stopTime;
    }

    /**
     * Set the stopTime property: Link table stop time.
     * 
     * @param stopTime the stopTime value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setStopTime(Object stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * Get the linkTableId property: Link table ID.
     * 
     * @return the linkTableId value.
     */
    public String getLinkTableId() {
        return this.linkTableId;
    }

    /**
     * Set the linkTableId property: Link table ID.
     * 
     * @param linkTableId the linkTableId value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setLinkTableId(String linkTableId) {
        this.linkTableId = linkTableId;
        return this;
    }

    /**
     * Get the errorCode property: Link table error code.
     * 
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Link table error code.
     * 
     * @param errorCode the errorCode value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the lastProcessedData property: Link table last processed data time.
     * 
     * @return the lastProcessedData value.
     */
    public OffsetDateTime getLastProcessedData() {
        return this.lastProcessedData;
    }

    /**
     * Set the lastProcessedData property: Link table last processed data time.
     * 
     * @param lastProcessedData the lastProcessedData value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setLastProcessedData(OffsetDateTime lastProcessedData) {
        this.lastProcessedData = lastProcessedData;
        return this;
    }

    /**
     * Get the lastTransactionCommitTime property: Link table last transaction commit time.
     * 
     * @return the lastTransactionCommitTime value.
     */
    public OffsetDateTime getLastTransactionCommitTime() {
        return this.lastTransactionCommitTime;
    }

    /**
     * Set the lastTransactionCommitTime property: Link table last transaction commit time.
     * 
     * @param lastTransactionCommitTime the lastTransactionCommitTime value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setLastTransactionCommitTime(OffsetDateTime lastTransactionCommitTime) {
        this.lastTransactionCommitTime = lastTransactionCommitTime;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        jsonWriter.writeUntypedField("startTime", this.startTime);
        jsonWriter.writeUntypedField("stopTime", this.stopTime);
        jsonWriter.writeStringField("linkTableId", this.linkTableId);
        jsonWriter.writeStringField("errorCode", this.errorCode);
        jsonWriter.writeStringField("lastProcessedData",
            this.lastProcessedData == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastProcessedData));
        jsonWriter.writeStringField("lastTransactionCommitTime",
            this.lastTransactionCommitTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastTransactionCommitTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkTableStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkTableStatus if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinkTableStatus.
     */
    public static LinkTableStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkTableStatus deserializedLinkTableStatus = new LinkTableStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLinkTableStatus.id = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedLinkTableStatus.status = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedLinkTableStatus.errorMessage = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedLinkTableStatus.startTime = reader.readUntyped();
                } else if ("stopTime".equals(fieldName)) {
                    deserializedLinkTableStatus.stopTime = reader.readUntyped();
                } else if ("linkTableId".equals(fieldName)) {
                    deserializedLinkTableStatus.linkTableId = reader.getString();
                } else if ("errorCode".equals(fieldName)) {
                    deserializedLinkTableStatus.errorCode = reader.getString();
                } else if ("lastProcessedData".equals(fieldName)) {
                    deserializedLinkTableStatus.lastProcessedData
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("lastTransactionCommitTime".equals(fieldName)) {
                    deserializedLinkTableStatus.lastTransactionCommitTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkTableStatus;
        });
    }
}
