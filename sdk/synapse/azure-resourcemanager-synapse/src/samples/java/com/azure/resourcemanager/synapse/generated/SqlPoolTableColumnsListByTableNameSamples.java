// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SqlPoolTableColumns ListByTableName. */
public final class SqlPoolTableColumnsListByTableNameSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListSqlPoolColumns.json
     */
    /**
     * Sample code: List the columns in a table of a given schema in a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listTheColumnsInATableOfAGivenSchemaInASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolTableColumns()
            .listByTableName("myRG", "serverName", "myDatabase", "dbo", "table1", null, Context.NONE);
    }
}
