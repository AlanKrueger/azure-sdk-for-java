// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input definition for switch provider. */
@Fluent
public final class SwitchProviderInput {
    /*
     * Switch provider input properties.
     */
    @JsonProperty(value = "properties")
    private SwitchProviderInputProperties properties;

    /** Creates an instance of SwitchProviderInput class. */
    public SwitchProviderInput() {
    }

    /**
     * Get the properties property: Switch provider input properties.
     *
     * @return the properties value.
     */
    public SwitchProviderInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Switch provider input properties.
     *
     * @param properties the properties value to set.
     * @return the SwitchProviderInput object itself.
     */
    public SwitchProviderInput withProperties(SwitchProviderInputProperties properties) {
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