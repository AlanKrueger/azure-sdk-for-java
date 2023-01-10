// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for OutboundFirewallRules Get. */
public final class OutboundFirewallRulesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/OutboundFirewallRuleGet.json
     */
    /**
     * Sample code: Gets outbound firewall rule.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsOutboundFirewallRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getOutboundFirewallRules()
            .getWithResponse("sqlcrudtest-7398", "sqlcrudtest-4645", "server.database.windows.net", Context.NONE);
    }
}