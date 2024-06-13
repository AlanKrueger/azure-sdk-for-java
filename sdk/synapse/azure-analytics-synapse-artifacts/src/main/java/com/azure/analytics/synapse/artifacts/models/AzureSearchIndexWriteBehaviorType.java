// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specify the write behavior when upserting documents into Azure Search Index.
 */
public final class AzureSearchIndexWriteBehaviorType extends ExpandableStringEnum<AzureSearchIndexWriteBehaviorType> {
    /**
     * Static value Merge for AzureSearchIndexWriteBehaviorType.
     */
    public static final AzureSearchIndexWriteBehaviorType MERGE = fromString("Merge");

    /**
     * Static value Upload for AzureSearchIndexWriteBehaviorType.
     */
    public static final AzureSearchIndexWriteBehaviorType UPLOAD = fromString("Upload");

    /**
     * Creates a new instance of AzureSearchIndexWriteBehaviorType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureSearchIndexWriteBehaviorType() {
    }

    /**
     * Creates or finds a AzureSearchIndexWriteBehaviorType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureSearchIndexWriteBehaviorType.
     */
    public static AzureSearchIndexWriteBehaviorType fromString(String name) {
        return fromString(name, AzureSearchIndexWriteBehaviorType.class);
    }

    /**
     * Gets known AzureSearchIndexWriteBehaviorType values.
     * 
     * @return known AzureSearchIndexWriteBehaviorType values.
     */
    public static Collection<AzureSearchIndexWriteBehaviorType> values() {
        return values(AzureSearchIndexWriteBehaviorType.class);
    }
}
