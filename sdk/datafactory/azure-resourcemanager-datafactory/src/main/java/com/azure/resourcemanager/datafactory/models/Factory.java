// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Factory. */
public interface Factory {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Managed service identity of the factory.
     *
     * @return the identity value.
     */
    FactoryIdentity identity();

    /**
     * Gets the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the additionalProperties property: Factory resource type.
     *
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * Gets the provisioningState property: Factory provisioning state, example Succeeded.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the createTime property: Time the factory was created in ISO8601 format.
     *
     * @return the createTime value.
     */
    OffsetDateTime createTime();

    /**
     * Gets the version property: Version of the factory.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the repoConfiguration property: Git repo information of the factory.
     *
     * @return the repoConfiguration value.
     */
    FactoryRepoConfiguration repoConfiguration();

    /**
     * Gets the globalParameters property: List of parameters for factory.
     *
     * @return the globalParameters value.
     */
    Map<String, GlobalParameterSpecification> globalParameters();

    /**
     * Gets the encryption property: Properties to enable Customer Managed Key for the factory.
     *
     * @return the encryption value.
     */
    EncryptionConfiguration encryption();

    /**
     * Gets the publicNetworkAccess property: Whether or not public network access is allowed for the data factory.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.FactoryInner object.
     *
     * @return the inner object.
     */
    FactoryInner innerModel();

    /** The entirety of the Factory definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Factory definition stages. */
    interface DefinitionStages {
        /** The first stage of the Factory definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Factory definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Factory definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Factory definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithAdditionalProperties,
                DefinitionStages.WithRepoConfiguration,
                DefinitionStages.WithGlobalParameters,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Factory create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Factory create(Context context);
        }
        /** The stage of the Factory definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Factory definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity of the factory..
             *
             * @param identity Managed service identity of the factory.
             * @return the next definition stage.
             */
            WithCreate withIdentity(FactoryIdentity identity);
        }
        /** The stage of the Factory definition allowing to specify additionalProperties. */
        interface WithAdditionalProperties {
            /**
             * Specifies the additionalProperties property: Factory resource type..
             *
             * @param additionalProperties Factory resource type.
             * @return the next definition stage.
             */
            WithCreate withAdditionalProperties(Map<String, Object> additionalProperties);
        }
        /** The stage of the Factory definition allowing to specify repoConfiguration. */
        interface WithRepoConfiguration {
            /**
             * Specifies the repoConfiguration property: Git repo information of the factory..
             *
             * @param repoConfiguration Git repo information of the factory.
             * @return the next definition stage.
             */
            WithCreate withRepoConfiguration(FactoryRepoConfiguration repoConfiguration);
        }
        /** The stage of the Factory definition allowing to specify globalParameters. */
        interface WithGlobalParameters {
            /**
             * Specifies the globalParameters property: List of parameters for factory..
             *
             * @param globalParameters List of parameters for factory.
             * @return the next definition stage.
             */
            WithCreate withGlobalParameters(Map<String, GlobalParameterSpecification> globalParameters);
        }
        /** The stage of the Factory definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Properties to enable Customer Managed Key for the factory..
             *
             * @param encryption Properties to enable Customer Managed Key for the factory.
             * @return the next definition stage.
             */
            WithCreate withEncryption(EncryptionConfiguration encryption);
        }
        /** The stage of the Factory definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether or not public network access is allowed for the data
             * factory..
             *
             * @param publicNetworkAccess Whether or not public network access is allowed for the data factory.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Factory definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the factory entity. Should only be specified for update, for
             * which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the factory entity. Should only be specified for update, for which it should match
             *     existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the Factory resource.
     *
     * @return the stage of resource update.
     */
    Factory.Update update();

    /** The template for Factory update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithPublicNetworkAccess {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Factory apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Factory apply(Context context);
    }
    /** The Factory update stages. */
    interface UpdateStages {
        /** The stage of the Factory update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The resource tags..
             *
             * @param tags The resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Factory update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity of the factory..
             *
             * @param identity Managed service identity of the factory.
             * @return the next definition stage.
             */
            Update withIdentity(FactoryIdentity identity);
        }
        /** The stage of the Factory update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether or not public network access is allowed for the data
             * factory..
             *
             * @param publicNetworkAccess Whether or not public network access is allowed for the data factory.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Factory refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Factory refresh(Context context);

    /**
     * Get GitHub Access Token.
     *
     * @param gitHubAccessTokenRequest Get GitHub access token request definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Access Token.
     */
    GitHubAccessTokenResponse getGitHubAccessToken(GitHubAccessTokenRequest gitHubAccessTokenRequest);

    /**
     * Get GitHub Access Token.
     *
     * @param gitHubAccessTokenRequest Get GitHub access token request definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Access Token.
     */
    Response<GitHubAccessTokenResponse> getGitHubAccessTokenWithResponse(
        GitHubAccessTokenRequest gitHubAccessTokenRequest, Context context);

    /**
     * Get Data Plane access.
     *
     * @param policy Data Plane user access policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Plane access.
     */
    AccessPolicyResponse getDataPlaneAccess(UserAccessPolicy policy);

    /**
     * Get Data Plane access.
     *
     * @param policy Data Plane user access policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Plane access.
     */
    Response<AccessPolicyResponse> getDataPlaneAccessWithResponse(UserAccessPolicy policy, Context context);
}
