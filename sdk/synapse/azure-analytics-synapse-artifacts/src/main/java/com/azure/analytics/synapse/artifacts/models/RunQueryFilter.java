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
import java.util.List;

/**
 * Query filter option for listing runs.
 */
@Fluent
public final class RunQueryFilter implements JsonSerializable<RunQueryFilter> {
    /*
     * Parameter name to be used for filter. The allowed operands to query pipeline runs are PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart, ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and Status.
     */
    private RunQueryFilterOperand operand;

    /*
     * Operator to be used for filter.
     */
    private RunQueryFilterOperator operator;

    /*
     * List of filter values.
     */
    private List<String> values;

    /**
     * Creates an instance of RunQueryFilter class.
     */
    public RunQueryFilter() {
    }

    /**
     * Get the operand property: Parameter name to be used for filter. The allowed operands to query pipeline runs are
     * PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and
     * Status.
     * 
     * @return the operand value.
     */
    public RunQueryFilterOperand getOperand() {
        return this.operand;
    }

    /**
     * Set the operand property: Parameter name to be used for filter. The allowed operands to query pipeline runs are
     * PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and
     * Status.
     * 
     * @param operand the operand value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter setOperand(RunQueryFilterOperand operand) {
        this.operand = operand;
        return this;
    }

    /**
     * Get the operator property: Operator to be used for filter.
     * 
     * @return the operator value.
     */
    public RunQueryFilterOperator getOperator() {
        return this.operator;
    }

    /**
     * Set the operator property: Operator to be used for filter.
     * 
     * @param operator the operator value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter setOperator(RunQueryFilterOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: List of filter values.
     * 
     * @return the values value.
     */
    public List<String> getValues() {
        return this.values;
    }

    /**
     * Set the values property: List of filter values.
     * 
     * @param values the values value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter setValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operand", this.operand == null ? null : this.operand.toString());
        jsonWriter.writeStringField("operator", this.operator == null ? null : this.operator.toString());
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunQueryFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunQueryFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunQueryFilter.
     */
    public static RunQueryFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunQueryFilter deserializedRunQueryFilter = new RunQueryFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operand".equals(fieldName)) {
                    deserializedRunQueryFilter.operand = RunQueryFilterOperand.fromString(reader.getString());
                } else if ("operator".equals(fieldName)) {
                    deserializedRunQueryFilter.operator = RunQueryFilterOperator.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedRunQueryFilter.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunQueryFilter;
        });
    }
}
