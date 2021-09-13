// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimeStatusOperation Get. */
public final class IntegrationRuntimeStatusOperationGetSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/IntegrationRuntimes_GetStatus.json
     */
    /**
     * Sample code: Get status.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getStatus(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .integrationRuntimeStatusOperations()
            .getWithResponse("exampleResourceGroup", "exampleWorkspace", "exampleIntegrationRuntime", Context.NONE);
    }
}
