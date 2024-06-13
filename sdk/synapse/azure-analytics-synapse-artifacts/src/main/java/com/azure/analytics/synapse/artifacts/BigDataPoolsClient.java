// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.BigDataPoolsImpl;
import com.azure.analytics.synapse.artifacts.models.BigDataPoolResourceInfo;
import com.azure.analytics.synapse.artifacts.models.BigDataPoolResourceInfoListResult;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Initializes a new instance of the synchronous ArtifactsClient type.
 */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class BigDataPoolsClient {
    @Generated
    private final BigDataPoolsImpl serviceClient;

    /**
     * Initializes an instance of BigDataPoolsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    BigDataPoolsClient(BigDataPoolsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List Big Data Pools.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BigDataPoolResourceInfoListResult> listWithResponse(Context context) {
        return this.serviceClient.listWithResponse(context);
    }

    /**
     * List Big Data Pools.
     * 
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BigDataPoolResourceInfoListResult list() {
        return this.serviceClient.list();
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BigDataPoolResourceInfo> getWithResponse(String bigDataPoolName, Context context) {
        return this.serviceClient.getWithResponse(bigDataPoolName, context);
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BigDataPoolResourceInfo get(String bigDataPoolName) {
        return this.serviceClient.get(bigDataPoolName);
    }
}
