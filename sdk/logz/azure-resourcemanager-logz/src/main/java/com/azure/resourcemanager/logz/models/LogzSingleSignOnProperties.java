// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LogzSingleSignOnProperties model. */
@Fluent
public final class LogzSingleSignOnProperties {
    /*
     * Various states of the SSO resource
     */
    @JsonProperty(value = "singleSignOnState")
    private SingleSignOnStates singleSignOnState;

    /*
     * The Id of the Enterprise App used for Single sign-on.
     */
    @JsonProperty(value = "enterpriseAppId")
    private String enterpriseAppId;

    /*
     * The login URL specific to this Logz Organization.
     */
    @JsonProperty(value = "singleSignOnUrl")
    private String singleSignOnUrl;

    /*
     * Flag specifying if the resource provisioning state as tracked by ARM.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of LogzSingleSignOnProperties class. */
    public LogzSingleSignOnProperties() {
    }

    /**
     * Get the singleSignOnState property: Various states of the SSO resource.
     *
     * @return the singleSignOnState value.
     */
    public SingleSignOnStates singleSignOnState() {
        return this.singleSignOnState;
    }

    /**
     * Set the singleSignOnState property: Various states of the SSO resource.
     *
     * @param singleSignOnState the singleSignOnState value to set.
     * @return the LogzSingleSignOnProperties object itself.
     */
    public LogzSingleSignOnProperties withSingleSignOnState(SingleSignOnStates singleSignOnState) {
        this.singleSignOnState = singleSignOnState;
        return this;
    }

    /**
     * Get the enterpriseAppId property: The Id of the Enterprise App used for Single sign-on.
     *
     * @return the enterpriseAppId value.
     */
    public String enterpriseAppId() {
        return this.enterpriseAppId;
    }

    /**
     * Set the enterpriseAppId property: The Id of the Enterprise App used for Single sign-on.
     *
     * @param enterpriseAppId the enterpriseAppId value to set.
     * @return the LogzSingleSignOnProperties object itself.
     */
    public LogzSingleSignOnProperties withEnterpriseAppId(String enterpriseAppId) {
        this.enterpriseAppId = enterpriseAppId;
        return this;
    }

    /**
     * Get the singleSignOnUrl property: The login URL specific to this Logz Organization.
     *
     * @return the singleSignOnUrl value.
     */
    public String singleSignOnUrl() {
        return this.singleSignOnUrl;
    }

    /**
     * Set the singleSignOnUrl property: The login URL specific to this Logz Organization.
     *
     * @param singleSignOnUrl the singleSignOnUrl value to set.
     * @return the LogzSingleSignOnProperties object itself.
     */
    public LogzSingleSignOnProperties withSingleSignOnUrl(String singleSignOnUrl) {
        this.singleSignOnUrl = singleSignOnUrl;
        return this;
    }

    /**
     * Get the provisioningState property: Flag specifying if the resource provisioning state as tracked by ARM.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
