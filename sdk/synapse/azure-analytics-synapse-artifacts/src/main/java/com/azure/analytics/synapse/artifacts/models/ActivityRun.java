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
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Information about an activity run in a pipeline.
 */
@Fluent
public final class ActivityRun implements JsonSerializable<ActivityRun> {
    /*
     * The name of the pipeline.
     */
    private String pipelineName;

    /*
     * The id of the pipeline run.
     */
    private String pipelineRunId;

    /*
     * The name of the activity.
     */
    private String activityName;

    /*
     * The type of the activity.
     */
    private String activityType;

    /*
     * The id of the activity run.
     */
    private String activityRunId;

    /*
     * The name of the compute linked service.
     */
    private String linkedServiceName;

    /*
     * The status of the activity run.
     */
    private String status;

    /*
     * The start time of the activity run in 'ISO 8601' format.
     */
    private OffsetDateTime activityRunStart;

    /*
     * The end time of the activity run in 'ISO 8601' format.
     */
    private OffsetDateTime activityRunEnd;

    /*
     * The duration of the activity run.
     */
    private Integer durationInMs;

    /*
     * The input for the activity.
     */
    private Object input;

    /*
     * The output for the activity.
     */
    private Object output;

    /*
     * The error if any from the activity run.
     */
    private Object error;

    /*
     * Information about an activity run in a pipeline.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of ActivityRun class.
     */
    public ActivityRun() {
    }

    /**
     * Get the pipelineName property: The name of the pipeline.
     * 
     * @return the pipelineName value.
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * Get the pipelineRunId property: The id of the pipeline run.
     * 
     * @return the pipelineRunId value.
     */
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * Get the activityName property: The name of the activity.
     * 
     * @return the activityName value.
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * Get the activityType property: The type of the activity.
     * 
     * @return the activityType value.
     */
    public String getActivityType() {
        return this.activityType;
    }

    /**
     * Get the activityRunId property: The id of the activity run.
     * 
     * @return the activityRunId value.
     */
    public String getActivityRunId() {
        return this.activityRunId;
    }

    /**
     * Get the linkedServiceName property: The name of the compute linked service.
     * 
     * @return the linkedServiceName value.
     */
    public String getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Get the status property: The status of the activity run.
     * 
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Get the activityRunStart property: The start time of the activity run in 'ISO 8601' format.
     * 
     * @return the activityRunStart value.
     */
    public OffsetDateTime getActivityRunStart() {
        return this.activityRunStart;
    }

    /**
     * Get the activityRunEnd property: The end time of the activity run in 'ISO 8601' format.
     * 
     * @return the activityRunEnd value.
     */
    public OffsetDateTime getActivityRunEnd() {
        return this.activityRunEnd;
    }

    /**
     * Get the durationInMs property: The duration of the activity run.
     * 
     * @return the durationInMs value.
     */
    public Integer getDurationInMs() {
        return this.durationInMs;
    }

    /**
     * Get the input property: The input for the activity.
     * 
     * @return the input value.
     */
    public Object getInput() {
        return this.input;
    }

    /**
     * Get the output property: The output for the activity.
     * 
     * @return the output value.
     */
    public Object getOutput() {
        return this.output;
    }

    /**
     * Get the error property: The error if any from the activity run.
     * 
     * @return the error value.
     */
    public Object getError() {
        return this.error;
    }

    /**
     * Get the additionalProperties property: Information about an activity run in a pipeline.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Information about an activity run in a pipeline.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ActivityRun object itself.
     */
    public ActivityRun setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActivityRun from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActivityRun if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ActivityRun.
     */
    public static ActivityRun fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActivityRun deserializedActivityRun = new ActivityRun();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pipelineName".equals(fieldName)) {
                    deserializedActivityRun.pipelineName = reader.getString();
                } else if ("pipelineRunId".equals(fieldName)) {
                    deserializedActivityRun.pipelineRunId = reader.getString();
                } else if ("activityName".equals(fieldName)) {
                    deserializedActivityRun.activityName = reader.getString();
                } else if ("activityType".equals(fieldName)) {
                    deserializedActivityRun.activityType = reader.getString();
                } else if ("activityRunId".equals(fieldName)) {
                    deserializedActivityRun.activityRunId = reader.getString();
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedActivityRun.linkedServiceName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedActivityRun.status = reader.getString();
                } else if ("activityRunStart".equals(fieldName)) {
                    deserializedActivityRun.activityRunStart
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("activityRunEnd".equals(fieldName)) {
                    deserializedActivityRun.activityRunEnd
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("durationInMs".equals(fieldName)) {
                    deserializedActivityRun.durationInMs = reader.getNullable(JsonReader::getInt);
                } else if ("input".equals(fieldName)) {
                    deserializedActivityRun.input = reader.readUntyped();
                } else if ("output".equals(fieldName)) {
                    deserializedActivityRun.output = reader.readUntyped();
                } else if ("error".equals(fieldName)) {
                    deserializedActivityRun.error = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedActivityRun.additionalProperties = additionalProperties;

            return deserializedActivityRun;
        });
    }
}
