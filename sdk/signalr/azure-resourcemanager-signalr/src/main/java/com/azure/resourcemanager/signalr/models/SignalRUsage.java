// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.resourcemanager.signalr.fluent.models.SignalRUsageInner;

/** An immutable client-side representation of SignalRUsage. */
public interface SignalRUsage {
    /**
     * Gets the id property: Fully qualified ARM resource id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the currentValue property: Current value for the usage quota.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the limit property: The maximum permitted value for the usage quota. If there is no limit, this value will
     * be -1.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the name property: Localizable String object containing the name and a localized value.
     *
     * @return the name value.
     */
    SignalRUsageName name();

    /**
     * Gets the unit property: Representing the units of the usage quota. Possible values are: Count, Bytes, Seconds,
     * Percent, CountPerSecond, BytesPerSecond.
     *
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.SignalRUsageInner object.
     *
     * @return the inner object.
     */
    SignalRUsageInner innerModel();
}
