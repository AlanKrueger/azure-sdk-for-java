// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RuntimeVersion. */
public final class RuntimeVersion extends ExpandableStringEnum<RuntimeVersion> {
    /** Static value Java_8 for RuntimeVersion. */
    public static final RuntimeVersion JAVA_8 = fromString("Java_8");

    /** Static value Java_11 for RuntimeVersion. */
    public static final RuntimeVersion JAVA_11 = fromString("Java_11");

    /** Static value NetCore_31 for RuntimeVersion. */
    public static final RuntimeVersion NET_CORE_31 = fromString("NetCore_31");

    /**
     * Creates or finds a RuntimeVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RuntimeVersion.
     */
    @JsonCreator
    public static RuntimeVersion fromString(String name) {
        return fromString(name, RuntimeVersion.class);
    }

    /** @return known RuntimeVersion values. */
    public static Collection<RuntimeVersion> values() {
        return values(RuntimeVersion.class);
    }
}
