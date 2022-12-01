// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.elastic.fluent.CreateAndAssociateIpFiltersClient;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CreateAndAssociateIpFiltersClient. */
public final class CreateAndAssociateIpFiltersClientImpl implements CreateAndAssociateIpFiltersClient {
    /** The proxy service used to perform REST calls. */
    private final CreateAndAssociateIpFiltersService service;

    /** The service client containing this operation class. */
    private final MicrosoftElasticImpl client;

    /**
     * Initializes an instance of CreateAndAssociateIpFiltersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CreateAndAssociateIpFiltersClientImpl(MicrosoftElasticImpl client) {
        this.service =
            RestProxy
                .create(
                    CreateAndAssociateIpFiltersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftElasticCreateAndAssociateIpFilters to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftElasticCrea")
    public interface CreateAndAssociateIpFiltersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Elastic/monitors"
                + "/{monitorName}/createAndAssociateIPFilter")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("monitorName") String monitorName,
            @QueryParam("ips") String ips,
            @QueryParam("name") String name,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String monitorName, String ips, String name) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            monitorName,
                            ips,
                            name,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String monitorName, String ips, String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                monitorName,
                ips,
                name,
                accept,
                context);
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateAsync(
        String resourceGroupName, String monitorName, String ips, String name) {
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(resourceGroupName, monitorName, ips, name);
        return this
            .client
            .<Void, Void>getLroResult(
                mono, this.client.getHttpPipeline(), Void.class, Void.class, this.client.getContext());
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateAsync(String resourceGroupName, String monitorName) {
        final String ips = null;
        final String name = null;
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(resourceGroupName, monitorName, ips, name);
        return this
            .client
            .<Void, Void>getLroResult(
                mono, this.client.getHttpPipeline(), Void.class, Void.class, this.client.getContext());
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateAsync(
        String resourceGroupName, String monitorName, String ips, String name, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            createWithResponseAsync(resourceGroupName, monitorName, ips, name, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCreate(String resourceGroupName, String monitorName) {
        final String ips = null;
        final String name = null;
        return beginCreateAsync(resourceGroupName, monitorName, ips, name).getSyncPoller();
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCreate(
        String resourceGroupName, String monitorName, String ips, String name, Context context) {
        return beginCreateAsync(resourceGroupName, monitorName, ips, name, context).getSyncPoller();
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createAsync(String resourceGroupName, String monitorName, String ips, String name) {
        return beginCreateAsync(resourceGroupName, monitorName, ips, name)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createAsync(String resourceGroupName, String monitorName) {
        final String ips = null;
        final String name = null;
        return beginCreateAsync(resourceGroupName, monitorName, ips, name)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createAsync(
        String resourceGroupName, String monitorName, String ips, String name, Context context) {
        return beginCreateAsync(resourceGroupName, monitorName, ips, name, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(String resourceGroupName, String monitorName) {
        final String ips = null;
        final String name = null;
        createAsync(resourceGroupName, monitorName, ips, name).block();
    }

    /**
     * Create and Associate IP traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param ips List of ips.
     * @param name Name of the traffic filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(String resourceGroupName, String monitorName, String ips, String name, Context context) {
        createAsync(resourceGroupName, monitorName, ips, name, context).block();
    }
}