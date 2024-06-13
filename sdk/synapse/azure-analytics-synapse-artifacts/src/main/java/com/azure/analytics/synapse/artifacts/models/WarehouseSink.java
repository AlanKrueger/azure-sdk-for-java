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
 * A copy activity Microsoft Fabric Warehouse sink.
 */
@Fluent
public final class WarehouseSink extends CopySink {
    /*
     * Copy sink type.
     */
    private String type = "WarehouseSink";

    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    private Object preCopyScript;

    /*
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     */
    private Object allowCopyCommand;

    /*
     * Specifies Copy Command related settings when allowCopyCommand is true.
     */
    private DWCopyCommandSettings copyCommandSettings;

    /*
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     */
    private Object tableOption;

    /*
     * Write behavior when copying data into azure Microsoft Fabric Data Warehouse. Type: DWWriteBehaviorEnum (or Expression with resultType DWWriteBehaviorEnum)
     */
    private Object writeBehavior;

    /**
     * Creates an instance of WarehouseSink class.
     */
    public WarehouseSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the allowCopyCommand property: Indicates to use Copy Command to copy data into SQL Data Warehouse. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the allowCopyCommand value.
     */
    public Object getAllowCopyCommand() {
        return this.allowCopyCommand;
    }

    /**
     * Set the allowCopyCommand property: Indicates to use Copy Command to copy data into SQL Data Warehouse. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param allowCopyCommand the allowCopyCommand value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink setAllowCopyCommand(Object allowCopyCommand) {
        this.allowCopyCommand = allowCopyCommand;
        return this;
    }

    /**
     * Get the copyCommandSettings property: Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     * @return the copyCommandSettings value.
     */
    public DWCopyCommandSettings getCopyCommandSettings() {
        return this.copyCommandSettings;
    }

    /**
     * Set the copyCommandSettings property: Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     * @param copyCommandSettings the copyCommandSettings value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink setCopyCommandSettings(DWCopyCommandSettings copyCommandSettings) {
        this.copyCommandSettings = copyCommandSettings;
        return this;
    }

    /**
     * Get the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @return the tableOption value.
     */
    public Object getTableOption() {
        return this.tableOption;
    }

    /**
     * Set the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @param tableOption the tableOption value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink setTableOption(Object tableOption) {
        this.tableOption = tableOption;
        return this;
    }

    /**
     * Get the writeBehavior property: Write behavior when copying data into azure Microsoft Fabric Data Warehouse.
     * Type: DWWriteBehaviorEnum (or Expression with resultType DWWriteBehaviorEnum).
     * 
     * @return the writeBehavior value.
     */
    public Object getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Write behavior when copying data into azure Microsoft Fabric Data Warehouse.
     * Type: DWWriteBehaviorEnum (or Expression with resultType DWWriteBehaviorEnum).
     * 
     * @param writeBehavior the writeBehavior value to set.
     * @return the WarehouseSink object itself.
     */
    public WarehouseSink setWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WarehouseSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("writeBatchSize", getWriteBatchSize());
        jsonWriter.writeUntypedField("writeBatchTimeout", getWriteBatchTimeout());
        jsonWriter.writeUntypedField("sinkRetryCount", getSinkRetryCount());
        jsonWriter.writeUntypedField("sinkRetryWait", getSinkRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("preCopyScript", this.preCopyScript);
        jsonWriter.writeUntypedField("allowCopyCommand", this.allowCopyCommand);
        jsonWriter.writeJsonField("copyCommandSettings", this.copyCommandSettings);
        jsonWriter.writeUntypedField("tableOption", this.tableOption);
        jsonWriter.writeUntypedField("writeBehavior", this.writeBehavior);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WarehouseSink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WarehouseSink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WarehouseSink.
     */
    public static WarehouseSink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WarehouseSink deserializedWarehouseSink = new WarehouseSink();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("writeBatchSize".equals(fieldName)) {
                    deserializedWarehouseSink.setWriteBatchSize(reader.readUntyped());
                } else if ("writeBatchTimeout".equals(fieldName)) {
                    deserializedWarehouseSink.setWriteBatchTimeout(reader.readUntyped());
                } else if ("sinkRetryCount".equals(fieldName)) {
                    deserializedWarehouseSink.setSinkRetryCount(reader.readUntyped());
                } else if ("sinkRetryWait".equals(fieldName)) {
                    deserializedWarehouseSink.setSinkRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedWarehouseSink.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedWarehouseSink.type = reader.getString();
                } else if ("preCopyScript".equals(fieldName)) {
                    deserializedWarehouseSink.preCopyScript = reader.readUntyped();
                } else if ("allowCopyCommand".equals(fieldName)) {
                    deserializedWarehouseSink.allowCopyCommand = reader.readUntyped();
                } else if ("copyCommandSettings".equals(fieldName)) {
                    deserializedWarehouseSink.copyCommandSettings = DWCopyCommandSettings.fromJson(reader);
                } else if ("tableOption".equals(fieldName)) {
                    deserializedWarehouseSink.tableOption = reader.readUntyped();
                } else if ("writeBehavior".equals(fieldName)) {
                    deserializedWarehouseSink.writeBehavior = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedWarehouseSink.setAdditionalProperties(additionalProperties);

            return deserializedWarehouseSink;
        });
    }
}
