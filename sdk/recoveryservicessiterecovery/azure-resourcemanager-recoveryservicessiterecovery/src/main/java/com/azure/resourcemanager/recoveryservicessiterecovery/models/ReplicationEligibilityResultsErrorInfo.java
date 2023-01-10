// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error model that can be exposed to the user. */
@Fluent
public final class ReplicationEligibilityResultsErrorInfo {
    /*
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The possible causes.
     */
    @JsonProperty(value = "possibleCauses")
    private String possibleCauses;

    /*
     * The recommended action.
     */
    @JsonProperty(value = "recommendedAction")
    private String recommendedAction;

    /*
     * The error status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of ReplicationEligibilityResultsErrorInfo class. */
    public ReplicationEligibilityResultsErrorInfo() {
    }

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the ReplicationEligibilityResultsErrorInfo object itself.
     */
    public ReplicationEligibilityResultsErrorInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the ReplicationEligibilityResultsErrorInfo object itself.
     */
    public ReplicationEligibilityResultsErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the possibleCauses property: The possible causes.
     *
     * @return the possibleCauses value.
     */
    public String possibleCauses() {
        return this.possibleCauses;
    }

    /**
     * Set the possibleCauses property: The possible causes.
     *
     * @param possibleCauses the possibleCauses value to set.
     * @return the ReplicationEligibilityResultsErrorInfo object itself.
     */
    public ReplicationEligibilityResultsErrorInfo withPossibleCauses(String possibleCauses) {
        this.possibleCauses = possibleCauses;
        return this;
    }

    /**
     * Get the recommendedAction property: The recommended action.
     *
     * @return the recommendedAction value.
     */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Set the recommendedAction property: The recommended action.
     *
     * @param recommendedAction the recommendedAction value to set.
     * @return the ReplicationEligibilityResultsErrorInfo object itself.
     */
    public ReplicationEligibilityResultsErrorInfo withRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Get the status property: The error status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}