// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SparkConfigurationsOperation ListByWorkspace. */
public final class SparkConfigurationsOperationListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/SparkConfigurations_ListByWorkspace.json
     */
    /**
     * Sample code: List sparkConfigurations in a workspace.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listSparkConfigurationsInAWorkspace(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sparkConfigurationsOperations()
            .listByWorkspace("exampleResourceGroup", "exampleWorkspace", Context.NONE);
    }
}
