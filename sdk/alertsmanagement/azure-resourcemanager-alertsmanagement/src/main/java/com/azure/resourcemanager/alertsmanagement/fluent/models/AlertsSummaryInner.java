// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.alertsmanagement.models.AlertsSummaryGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary of alerts based on the input filters and 'groupby' parameters. */
@Fluent
public final class AlertsSummaryInner extends ProxyResource {
    /*
     * Group the result set.
     */
    @JsonProperty(value = "properties")
    private AlertsSummaryGroup properties;

    /**
     * Get the properties property: Group the result set.
     *
     * @return the properties value.
     */
    public AlertsSummaryGroup properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Group the result set.
     *
     * @param properties the properties value to set.
     * @return the AlertsSummaryInner object itself.
     */
    public AlertsSummaryInner withProperties(AlertsSummaryGroup properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
