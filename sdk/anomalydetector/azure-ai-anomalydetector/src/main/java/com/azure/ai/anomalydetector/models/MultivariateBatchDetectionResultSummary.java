// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Multivariate anomaly detection status. */
@Immutable
public final class MultivariateBatchDetectionResultSummary {
    /*
     * Status of detection results. One of CREATED, RUNNING, READY, and FAILED.
     */
    @JsonProperty(value = "status", required = true)
    private MultivariateBatchDetectionStatus status;

    /*
     * Error message when detection is failed.
     */
    @JsonProperty(value = "errors")
    private List<ErrorResponse> errors;

    /*
     * Variable Status.
     */
    @JsonProperty(value = "variableStates")
    private List<VariableState> variableStates;

    /*
     * Detection request for batch inference. This is an asynchronous inference which
     * will need another API to get detection results.
     */
    @JsonProperty(value = "setupInfo", required = true)
    private MultivariateBatchDetectionOptions setupInfo;

    /**
     * Creates an instance of MultivariateBatchDetectionResultSummary class.
     *
     * @param status the status value to set.
     * @param setupInfo the setupInfo value to set.
     */
    @JsonCreator
    private MultivariateBatchDetectionResultSummary(
            @JsonProperty(value = "status", required = true) MultivariateBatchDetectionStatus status,
            @JsonProperty(value = "setupInfo", required = true) MultivariateBatchDetectionOptions setupInfo) {
        this.status = status;
        this.setupInfo = setupInfo;
    }

    /**
     * Get the status property: Status of detection results. One of CREATED, RUNNING, READY, and FAILED.
     *
     * @return the status value.
     */
    public MultivariateBatchDetectionStatus getStatus() {
        return this.status;
    }

    /**
     * Get the errors property: Error message when detection is failed.
     *
     * @return the errors value.
     */
    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Get the variableStates property: Variable Status.
     *
     * @return the variableStates value.
     */
    public List<VariableState> getVariableStates() {
        return this.variableStates;
    }

    /**
     * Get the setupInfo property: Detection request for batch inference. This is an asynchronous inference which will
     * need another API to get detection results.
     *
     * @return the setupInfo value.
     */
    public MultivariateBatchDetectionOptions getSetupInfo() {
        return this.setupInfo;
    }
}