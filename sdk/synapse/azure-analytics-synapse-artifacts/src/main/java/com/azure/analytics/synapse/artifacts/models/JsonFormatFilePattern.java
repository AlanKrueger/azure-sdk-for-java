// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * JSON format file pattern. A property of JsonFormat.
 */
public final class JsonFormatFilePattern extends ExpandableStringEnum<JsonFormatFilePattern> {
    /**
     * Static value setOfObjects for JsonFormatFilePattern.
     */
    public static final JsonFormatFilePattern SET_OF_OBJECTS = fromString("setOfObjects");

    /**
     * Static value arrayOfObjects for JsonFormatFilePattern.
     */
    public static final JsonFormatFilePattern ARRAY_OF_OBJECTS = fromString("arrayOfObjects");

    /**
     * Creates a new instance of JsonFormatFilePattern value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JsonFormatFilePattern() {
    }

    /**
     * Creates or finds a JsonFormatFilePattern from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JsonFormatFilePattern.
     */
    public static JsonFormatFilePattern fromString(String name) {
        return fromString(name, JsonFormatFilePattern.class);
    }

    /**
     * Gets known JsonFormatFilePattern values.
     * 
     * @return known JsonFormatFilePattern values.
     */
    public static Collection<JsonFormatFilePattern> values() {
        return values(JsonFormatFilePattern.class);
    }
}
