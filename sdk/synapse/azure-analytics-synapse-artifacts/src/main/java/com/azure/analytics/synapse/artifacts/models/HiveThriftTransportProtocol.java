// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The transport protocol to use in the Thrift layer.
 */
public final class HiveThriftTransportProtocol extends ExpandableStringEnum<HiveThriftTransportProtocol> {
    /**
     * Static value Binary for HiveThriftTransportProtocol.
     */
    public static final HiveThriftTransportProtocol BINARY = fromString("Binary");

    /**
     * Static value SASL for HiveThriftTransportProtocol.
     */
    public static final HiveThriftTransportProtocol SASL = fromString("SASL");

    /**
     * Static value HTTP for HiveThriftTransportProtocol.
     */
    public static final HiveThriftTransportProtocol HTTP = fromString("HTTP ");

    /**
     * Creates a new instance of HiveThriftTransportProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HiveThriftTransportProtocol() {
    }

    /**
     * Creates or finds a HiveThriftTransportProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HiveThriftTransportProtocol.
     */
    public static HiveThriftTransportProtocol fromString(String name) {
        return fromString(name, HiveThriftTransportProtocol.class);
    }

    /**
     * Gets known HiveThriftTransportProtocol values.
     * 
     * @return known HiveThriftTransportProtocol values.
     */
    public static Collection<HiveThriftTransportProtocol> values() {
        return values(HiveThriftTransportProtocol.class);
    }
}
