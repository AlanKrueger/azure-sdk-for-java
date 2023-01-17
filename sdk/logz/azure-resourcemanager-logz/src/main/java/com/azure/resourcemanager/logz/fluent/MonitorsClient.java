// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.logz.fluent.models.LogzMonitorResourceInner;
import com.azure.resourcemanager.logz.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.logz.fluent.models.UserRoleResponseInner;
import com.azure.resourcemanager.logz.models.LogzMonitorResourceUpdateParameters;
import com.azure.resourcemanager.logz.models.UserRoleRequest;

/** An instance of this class provides access to all the operations defined in MonitorsClient. */
public interface MonitorsClient {
    /**
     * List the resources currently being monitored by the Logz monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MonitoredResourceInner> listMonitoredResources(String resourceGroupName, String monitorName);

    /**
     * List the resources currently being monitored by the Logz monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MonitoredResourceInner> listMonitoredResources(
        String resourceGroupName, String monitorName, Context context);

    /**
     * List all monitors under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogzMonitorResourceInner> list();

    /**
     * List all monitors under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogzMonitorResourceInner> list(Context context);

    /**
     * List all monitors under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogzMonitorResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all monitors under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogzMonitorResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a specific monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a specific monitor resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogzMonitorResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Get the properties of a specific monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a specific monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzMonitorResourceInner getByResourceGroup(String resourceGroupName, String monitorName);

    /**
     * Create a monitor resource. This create operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LogzMonitorResourceInner>, LogzMonitorResourceInner> beginCreate(
        String resourceGroupName, String monitorName);

    /**
     * Create a monitor resource. This create operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LogzMonitorResourceInner>, LogzMonitorResourceInner> beginCreate(
        String resourceGroupName, String monitorName, LogzMonitorResourceInner body, Context context);

    /**
     * Create a monitor resource. This create operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzMonitorResourceInner create(String resourceGroupName, String monitorName);

    /**
     * Create a monitor resource. This create operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzMonitorResourceInner create(
        String resourceGroupName, String monitorName, LogzMonitorResourceInner body, Context context);

    /**
     * Update a monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param body The parameters for a PATCH request to a monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogzMonitorResourceInner> updateWithResponse(
        String resourceGroupName, String monitorName, LogzMonitorResourceUpdateParameters body, Context context);

    /**
     * Update a monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzMonitorResourceInner update(String resourceGroupName, String monitorName);

    /**
     * Delete a monitor resource. This delete operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String monitorName);

    /**
     * Delete a monitor resource. This delete operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String monitorName, Context context);

    /**
     * Delete a monitor resource. This delete operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String monitorName);

    /**
     * Delete a monitor resource. This delete operation can take upto 10 minutes to complete.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String monitorName, Context context);

    /**
     * List the user's roles configured on Logz.io side for the account corresponding to the monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list of user's role for Logz.io account as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserRoleResponseInner> listUserRoles(String resourceGroupName, String monitorName);

    /**
     * List the user's roles configured on Logz.io side for the account corresponding to the monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param body Request for checking user's role for Logz.io account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list of user's role for Logz.io account as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserRoleResponseInner> listUserRoles(
        String resourceGroupName, String monitorName, UserRoleRequest body, Context context);
}
