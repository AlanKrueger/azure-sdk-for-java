// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationAppliances List. */
public final class ReplicationAppliancesListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationAppliances_List.json
     */
    /**
     * Sample code: Gets the list of appliances.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfAppliances(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationAppliances().list("vault1", "resourceGroupPS1", null, Context.NONE);
    }
}