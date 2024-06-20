// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.fluent.models.StorageAccountPropertiesCreateParameters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The parameters used when creating a storage account.
 */
@Fluent
public final class StorageAccountCreateParameters {
    /*
     * Required. Gets or sets the SKU name.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Required. Indicates the type of storage account.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /*
     * Required. Gets or sets the location of the resource. This will be one of the supported and registered Azure Geo
     * Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource cannot be changed once it is
     * created, but if an identical geo region is specified on update, the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Optional. Set the extended location of the resource. If not set, the storage account will be created in Azure
     * main region. Otherwise it will be created in the specified extended location
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used for viewing and
     * grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key with a length no greater than 128 characters and a value with a length no greater than 256
     * characters.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The parameters used to create the storage account.
     */
    @JsonProperty(value = "properties")
    private StorageAccountPropertiesCreateParameters innerProperties;

    /**
     * Creates an instance of StorageAccountCreateParameters class.
     */
    public StorageAccountCreateParameters() {
    }

    /**
     * Get the sku property: Required. Gets or sets the SKU name.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Required. Gets or sets the SKU name.
     * 
     * @param sku the sku value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Required. Indicates the type of storage account.
     * 
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Required. Indicates the type of storage account.
     * 
     * @param kind the kind value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     * 
     * @param location the location value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the extendedLocation property: Optional. Set the extended location of the resource. If not set, the storage
     * account will be created in Azure main region. Otherwise it will be created in the specified extended location.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Optional. Set the extended location of the resource. If not set, the storage
     * account will be created in Azure main region. Otherwise it will be created in the specified extended location.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     * 
     * @param tags the tags value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     * 
     * @param identity the identity value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The parameters used to create the storage account.
     * 
     * @return the innerProperties value.
     */
    private StorageAccountPropertiesCreateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the allowedCopyScope property: Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     * 
     * @return the allowedCopyScope value.
     */
    public AllowedCopyScope allowedCopyScope() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedCopyScope();
    }

    /**
     * Set the allowedCopyScope property: Restrict copy to and from Storage Accounts within an AAD tenant or with
     * Private Links to the same VNet.
     * 
     * @param allowedCopyScope the allowedCopyScope value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowedCopyScope(AllowedCopyScope allowedCopyScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAllowedCopyScope(allowedCopyScope);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Allow, disallow, or let Network Security Perimeter configuration to
     * evaluate public network access to Storage Account. Value is optional but if passed in, must be 'Enabled',
     * 'Disabled' or 'SecuredByPerimeter'.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Allow, disallow, or let Network Security Perimeter configuration to
     * evaluate public network access to Storage Account. Value is optional but if passed in, must be 'Enabled',
     * 'Disabled' or 'SecuredByPerimeter'.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the sasPolicy property: SasPolicy assigned to the storage account.
     * 
     * @return the sasPolicy value.
     */
    public SasPolicy sasPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().sasPolicy();
    }

    /**
     * Set the sasPolicy property: SasPolicy assigned to the storage account.
     * 
     * @param sasPolicy the sasPolicy value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withSasPolicy(SasPolicy sasPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withSasPolicy(sasPolicy);
        return this;
    }

    /**
     * Get the keyPolicy property: KeyPolicy assigned to the storage account.
     * 
     * @return the keyPolicy value.
     */
    public KeyPolicy keyPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().keyPolicy();
    }

    /**
     * Set the keyPolicy property: KeyPolicy assigned to the storage account.
     * 
     * @param keyPolicy the keyPolicy value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withKeyPolicy(KeyPolicy keyPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withKeyPolicy(keyPolicy);
        return this;
    }

    /**
     * Get the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     * 
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomain();
    }

    /**
     * Set the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     * 
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withCustomDomain(CustomDomain customDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withCustomDomain(customDomain);
        return this;
    }

    /**
     * Get the encryption property: Encryption settings to be used for server-side encryption for the storage account.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption settings to be used for server-side encryption for the storage account.
     * 
     * @param encryption the encryption value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     * 
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleSet();
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     * 
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withNetworkRuleSet(networkRuleSet);
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier is used for
     * billing. The 'Premium' access tier is the default value for premium block blobs storage account type and it
     * cannot be changed for the premium block blobs storage account type.
     * 
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTier();
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier is used for
     * billing. The 'Premium' access tier is the default value for premium block blobs storage account type and it
     * cannot be changed for the premium block blobs storage account type.
     * 
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAccessTier(AccessTier accessTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAccessTier(accessTier);
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     * 
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().azureFilesIdentityBasedAuthentication();
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     * 
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     * 
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().enableHttpsTrafficOnly();
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     * 
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        return this;
    }

    /**
     * Get the isSftpEnabled property: Enables Secure File Transfer Protocol, if set to true.
     * 
     * @return the isSftpEnabled value.
     */
    public Boolean isSftpEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isSftpEnabled();
    }

    /**
     * Set the isSftpEnabled property: Enables Secure File Transfer Protocol, if set to true.
     * 
     * @param isSftpEnabled the isSftpEnabled value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIsSftpEnabled(Boolean isSftpEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withIsSftpEnabled(isSftpEnabled);
        return this;
    }

    /**
     * Get the isLocalUserEnabled property: Enables local users feature, if set to true.
     * 
     * @return the isLocalUserEnabled value.
     */
    public Boolean isLocalUserEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isLocalUserEnabled();
    }

    /**
     * Set the isLocalUserEnabled property: Enables local users feature, if set to true.
     * 
     * @param isLocalUserEnabled the isLocalUserEnabled value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIsLocalUserEnabled(Boolean isLocalUserEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withIsLocalUserEnabled(isLocalUserEnabled);
        return this;
    }

    /**
     * Get the enableExtendedGroups property: Enables extended group support with local users feature, if set to true.
     * 
     * @return the enableExtendedGroups value.
     */
    public Boolean enableExtendedGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().enableExtendedGroups();
    }

    /**
     * Set the enableExtendedGroups property: Enables extended group support with local users feature, if set to true.
     * 
     * @param enableExtendedGroups the enableExtendedGroups value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableExtendedGroups(Boolean enableExtendedGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withEnableExtendedGroups(enableExtendedGroups);
        return this;
    }

    /**
     * Get the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     * 
     * @return the isHnsEnabled value.
     */
    public Boolean isHnsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isHnsEnabled();
    }

    /**
     * Set the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     * 
     * @param isHnsEnabled the isHnsEnabled value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIsHnsEnabled(Boolean isHnsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withIsHnsEnabled(isHnsEnabled);
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     * 
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.innerProperties() == null ? null : this.innerProperties().largeFileSharesState();
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     * 
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withLargeFileSharesState(largeFileSharesState);
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     * 
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.innerProperties() == null ? null : this.innerProperties().routingPreference();
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     * 
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withRoutingPreference(RoutingPreference routingPreference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withRoutingPreference(routingPreference);
        return this;
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is false for this property.
     * 
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowBlobPublicAccess();
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is false for this property.
     * 
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAllowBlobPublicAccess(allowBlobPublicAccess);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     * 
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     * 
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     * @return the allowSharedKeyAccess value.
     */
    public Boolean allowSharedKeyAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowSharedKeyAccess();
    }

    /**
     * Set the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     * @param allowSharedKeyAccess the allowSharedKeyAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAllowSharedKeyAccess(allowSharedKeyAccess);
        return this;
    }

    /**
     * Get the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     * 
     * @return the enableNfsV3 value.
     */
    public Boolean enableNfsV3() {
        return this.innerProperties() == null ? null : this.innerProperties().enableNfsV3();
    }

    /**
     * Set the enableNfsV3 property: NFS 3.0 protocol support enabled if set to true.
     * 
     * @param enableNfsV3 the enableNfsV3 value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableNfsV3(Boolean enableNfsV3) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withEnableNfsV3(enableNfsV3);
        return this;
    }

    /**
     * Get the allowCrossTenantReplication property: Allow or disallow cross AAD tenant object replication. Set this
     * property to true for new or existing accounts only if object replication policies will involve storage accounts
     * in different AAD tenants. The default interpretation is false for new accounts to follow best security practices
     * by default.
     * 
     * @return the allowCrossTenantReplication value.
     */
    public Boolean allowCrossTenantReplication() {
        return this.innerProperties() == null ? null : this.innerProperties().allowCrossTenantReplication();
    }

    /**
     * Set the allowCrossTenantReplication property: Allow or disallow cross AAD tenant object replication. Set this
     * property to true for new or existing accounts only if object replication policies will involve storage accounts
     * in different AAD tenants. The default interpretation is false for new accounts to follow best security practices
     * by default.
     * 
     * @param allowCrossTenantReplication the allowCrossTenantReplication value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowCrossTenantReplication(Boolean allowCrossTenantReplication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAllowCrossTenantReplication(allowCrossTenantReplication);
        return this;
    }

    /**
     * Get the defaultToOAuthAuthentication property: A boolean flag which indicates whether the default authentication
     * is OAuth or not. The default interpretation is false for this property.
     * 
     * @return the defaultToOAuthAuthentication value.
     */
    public Boolean defaultToOAuthAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultToOAuthAuthentication();
    }

    /**
     * Set the defaultToOAuthAuthentication property: A boolean flag which indicates whether the default authentication
     * is OAuth or not. The default interpretation is false for this property.
     * 
     * @param defaultToOAuthAuthentication the defaultToOAuthAuthentication value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withDefaultToOAuthAuthentication(Boolean defaultToOAuthAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withDefaultToOAuthAuthentication(defaultToOAuthAuthentication);
        return this;
    }

    /**
     * Get the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the new containers in the
     * account by default.
     * 
     * @return the immutableStorageWithVersioning value.
     */
    public ImmutableStorageAccount immutableStorageWithVersioning() {
        return this.innerProperties() == null ? null : this.innerProperties().immutableStorageWithVersioning();
    }

    /**
     * Set the immutableStorageWithVersioning property: The property is immutable and can only be set to true at the
     * account creation time. When set to true, it enables object level immutability for all the new containers in the
     * account by default.
     * 
     * @param immutableStorageWithVersioning the immutableStorageWithVersioning value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters
        withImmutableStorageWithVersioning(ImmutableStorageAccount immutableStorageWithVersioning) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withImmutableStorageWithVersioning(immutableStorageWithVersioning);
        return this;
    }

    /**
     * Get the dnsEndpointType property: Allows you to specify the type of endpoint. Set this to AzureDNSZone to create
     * a large number of accounts in a single subscription, which creates accounts in an Azure DNS Zone and the endpoint
     * URL will have an alphanumeric DNS Zone identifier.
     * 
     * @return the dnsEndpointType value.
     */
    public DnsEndpointType dnsEndpointType() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsEndpointType();
    }

    /**
     * Set the dnsEndpointType property: Allows you to specify the type of endpoint. Set this to AzureDNSZone to create
     * a large number of accounts in a single subscription, which creates accounts in an Azure DNS Zone and the endpoint
     * URL will have an alphanumeric DNS Zone identifier.
     * 
     * @param dnsEndpointType the dnsEndpointType value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withDnsEndpointType(DnsEndpointType dnsEndpointType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withDnsEndpointType(dnsEndpointType);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sku in model StorageAccountCreateParameters"));
        } else {
            sku().validate();
        }
        if (kind() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property kind in model StorageAccountCreateParameters"));
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model StorageAccountCreateParameters"));
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccountCreateParameters.class);
}
