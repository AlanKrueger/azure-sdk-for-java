// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkfunction.models.IngestionSourcesPropertiesFormat;
import com.azure.resourcemanager.networkfunction.models.SourceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IngestionSourcesPropertiesFormatTests {
    @Test
    public void testDeserialize() {
        IngestionSourcesPropertiesFormat model =
            BinaryData
                .fromString("{\"sourceType\":\"Resource\",\"resourceId\":\"jaoyfhrtx\"}")
                .toObject(IngestionSourcesPropertiesFormat.class);
        Assertions.assertEquals(SourceType.RESOURCE, model.sourceType());
        Assertions.assertEquals("jaoyfhrtx", model.resourceId());
    }

    @Test
    public void testSerialize() {
        IngestionSourcesPropertiesFormat model =
            new IngestionSourcesPropertiesFormat().withSourceType(SourceType.RESOURCE).withResourceId("jaoyfhrtx");
        model = BinaryData.fromObject(model).toObject(IngestionSourcesPropertiesFormat.class);
        Assertions.assertEquals(SourceType.RESOURCE, model.sourceType());
        Assertions.assertEquals("jaoyfhrtx", model.resourceId());
    }
}