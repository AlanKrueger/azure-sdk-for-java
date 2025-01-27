// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.DbServerInner;
import com.azure.resourcemanager.oracledatabase.models.DbServerListResult;
import com.azure.resourcemanager.oracledatabase.models.DbServerProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DbServerListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbServerListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"ocid\":\"eburu\",\"displayName\":\"movsmzlxwabmqoe\",\"compartmentId\":\"ifrvtpu\",\"exadataInfrastructureId\":\"jmqlgkfb\",\"cpuCoreCount\":1252448159,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":2034697081,\"patchingStatus\":\"Complete\",\"timePatchingEnded\":\"2021-06-02T01:39:29Z\",\"timePatchingStarted\":\"2021-10-15T06:38:02Z\"},\"maxMemoryInGbs\":905406491,\"dbNodeStorageSizeInGbs\":175195194,\"vmClusterIds\":[\"jed\"],\"dbNodeIds\":[\"waezkojvd\"],\"lifecycleDetails\":\"zfoqouicybxar\",\"lifecycleState\":\"Deleted\",\"maxCpuCount\":1273142830,\"autonomousVmClusterIds\":[\"x\",\"iqopidoamciod\",\"khazxkhnzbonlwn\",\"oegokdwbwh\"],\"autonomousVirtualMachineIds\":[\"zcmrvexztvb\"],\"maxDbNodeStorageInGbs\":991988200,\"memorySizeInGbs\":1033592181,\"shape\":\"aoyzkoow\",\"timeCreated\":\"2021-01-01T04:06:13Z\",\"provisioningState\":\"Canceled\"},\"id\":\"xawqaldsyuuxim\",\"name\":\"rqf\",\"type\":\"bw\"},{\"properties\":{\"ocid\":\"kby\",\"displayName\":\"t\",\"compartmentId\":\"fhpagmhrskdsnf\",\"exadataInfrastructureId\":\"doakgtdlmkkzevdl\",\"cpuCoreCount\":1094584073,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":39972053,\"patchingStatus\":\"Failed\",\"timePatchingEnded\":\"2021-03-21T12:32:13Z\",\"timePatchingStarted\":\"2021-04-23T17:16:39Z\"},\"maxMemoryInGbs\":221713689,\"dbNodeStorageSizeInGbs\":1374887959,\"vmClusterIds\":[\"dcngqqmoakufgmj\",\"rwr\"],\"dbNodeIds\":[\"twaenuuzko\",\"bminrfdwoyuhhzi\",\"iefozbhdmsml\"],\"lifecycleDetails\":\"qhoftrmaequiah\",\"lifecycleState\":\"Deleted\",\"maxCpuCount\":1714280581,\"autonomousVmClusterIds\":[\"oqzpiyylha\",\"nswhcc\",\"ph\",\"aivwitqscywu\"],\"autonomousVirtualMachineIds\":[\"oluhczbwemh\",\"i\",\"sbrgz\",\"wmsweypqwd\"],\"maxDbNodeStorageInGbs\":1064810748,\"memorySizeInGbs\":1600037185,\"shape\":\"cnxqhuexmkttlst\",\"timeCreated\":\"2021-09-29T19:52:13Z\",\"provisioningState\":\"Failed\"},\"id\":\"mhzrn\",\"name\":\"sdtclusiypbs\",\"type\":\"gytguslfead\"}],\"nextLink\":\"gq\"}")
            .toObject(DbServerListResult.class);
        Assertions.assertEquals("gq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbServerListResult model = new DbServerListResult()
            .withValue(Arrays.asList(new DbServerInner().withProperties(new DbServerProperties()),
                new DbServerInner().withProperties(new DbServerProperties())))
            .withNextLink("gq");
        model = BinaryData.fromObject(model).toObject(DbServerListResult.class);
        Assertions.assertEquals("gq", model.nextLink());
    }
}
