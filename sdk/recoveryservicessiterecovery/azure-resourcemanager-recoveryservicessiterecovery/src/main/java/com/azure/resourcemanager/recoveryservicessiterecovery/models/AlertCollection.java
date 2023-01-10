// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.AlertInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of alerts. */
@Fluent
public final class AlertCollection {
    /*
     * The list of alerts.
     */
    @JsonProperty(value = "value")
    private List<AlertInner> value;

    /*
     * The value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AlertCollection class. */
    public AlertCollection() {
    }

    /**
     * Get the value property: The list of alerts.
     *
     * @return the value value.
     */
    public List<AlertInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of alerts.
     *
     * @param value the value value to set.
     * @return the AlertCollection object itself.
     */
    public AlertCollection withValue(List<AlertInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the AlertCollection object itself.
     */
    public AlertCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}