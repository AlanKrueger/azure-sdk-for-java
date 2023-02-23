// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CommunicationCloudEnvironmentModel. */
public final class CommunicationCloudEnvironmentModel extends ExpandableStringEnum<CommunicationCloudEnvironmentModel> {
    /** Static value public for CommunicationCloudEnvironmentModel. */
    public static final CommunicationCloudEnvironmentModel PUBLIC = fromString("public");

    /** Static value dod for CommunicationCloudEnvironmentModel. */
    public static final CommunicationCloudEnvironmentModel DOD = fromString("dod");

    /** Static value gcch for CommunicationCloudEnvironmentModel. */
    public static final CommunicationCloudEnvironmentModel GCCH = fromString("gcch");

    /**
     * Creates or finds a CommunicationCloudEnvironmentModel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CommunicationCloudEnvironmentModel.
     */
    @JsonCreator
    public static CommunicationCloudEnvironmentModel fromString(String name) {
        return fromString(name, CommunicationCloudEnvironmentModel.class);
    }

    /**
     * Gets known CommunicationCloudEnvironmentModel values.
     *
     * @return known CommunicationCloudEnvironmentModel values.
     */
    public static Collection<CommunicationCloudEnvironmentModel> values() {
        return values(CommunicationCloudEnvironmentModel.class);
    }
}
