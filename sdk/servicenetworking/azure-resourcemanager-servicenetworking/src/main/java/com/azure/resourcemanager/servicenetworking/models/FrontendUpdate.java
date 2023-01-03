// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The type used for update operations of the Frontend. */
@Fluent
public final class FrontendUpdate {
    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The updatable properties of the Frontend.
     */
    @JsonProperty(value = "properties")
    private FrontendUpdateProperties properties;

    /** Creates an instance of FrontendUpdate class. */
    public FrontendUpdate() {
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the FrontendUpdate object itself.
     */
    public FrontendUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The updatable properties of the Frontend.
     *
     * @return the properties value.
     */
    public FrontendUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The updatable properties of the Frontend.
     *
     * @param properties the properties value to set.
     * @return the FrontendUpdate object itself.
     */
    public FrontendUpdate withProperties(FrontendUpdateProperties properties) {
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