// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.AlertsState;
import com.azure.resourcemanager.recoveryservices.models.ClassicAlertSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClassicAlertSettingsTests {
    @Test
    public void testDeserialize() {
        ClassicAlertSettings model =
            BinaryData
                .fromString("{\"alertsForCriticalOperations\":\"Disabled\"}")
                .toObject(ClassicAlertSettings.class);
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForCriticalOperations());
    }

    @Test
    public void testSerialize() {
        ClassicAlertSettings model = new ClassicAlertSettings().withAlertsForCriticalOperations(AlertsState.DISABLED);
        model = BinaryData.fromObject(model).toObject(ClassicAlertSettings.class);
        Assertions.assertEquals(AlertsState.DISABLED, model.alertsForCriticalOperations());
    }
}