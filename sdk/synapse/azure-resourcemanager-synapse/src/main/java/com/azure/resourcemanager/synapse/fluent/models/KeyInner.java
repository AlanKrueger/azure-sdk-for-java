// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A workspace key. */
@Fluent
public final class KeyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyInner.class);

    /*
     * Keys resource properties
     */
    @JsonProperty(value = "properties")
    private KeyProperties innerProperties;

    /**
     * Get the innerProperties property: Keys resource properties.
     *
     * @return the innerProperties value.
     */
    private KeyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isActiveCmk property: Used to activate the workspace after a customer managed key is provided.
     *
     * @return the isActiveCmk value.
     */
    public Boolean isActiveCmk() {
        return this.innerProperties() == null ? null : this.innerProperties().isActiveCmk();
    }

    /**
     * Set the isActiveCmk property: Used to activate the workspace after a customer managed key is provided.
     *
     * @param isActiveCmk the isActiveCmk value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withIsActiveCmk(Boolean isActiveCmk) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withIsActiveCmk(isActiveCmk);
        return this;
    }

    /**
     * Get the keyVaultUrl property: The Key Vault Url of the workspace key.
     *
     * @return the keyVaultUrl value.
     */
    public String keyVaultUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultUrl();
    }

    /**
     * Set the keyVaultUrl property: The Key Vault Url of the workspace key.
     *
     * @param keyVaultUrl the keyVaultUrl value to set.
     * @return the KeyInner object itself.
     */
    public KeyInner withKeyVaultUrl(String keyVaultUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyProperties();
        }
        this.innerProperties().withKeyVaultUrl(keyVaultUrl);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
