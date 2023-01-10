// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the information necessary to perform import operation for new database. */
@Fluent
public final class ImportNewDatabaseDefinition {
    /*
     * Name of the import database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * Edition of the import database.
     */
    @JsonProperty(value = "edition")
    private String edition;

    /*
     * Service level objective name of the import database.
     */
    @JsonProperty(value = "serviceObjectiveName")
    private String serviceObjectiveName;

    /*
     * Max size in bytes for the import database.
     */
    @JsonProperty(value = "maxSizeBytes")
    private String maxSizeBytes;

    /*
     * Storage key type.
     */
    @JsonProperty(value = "storageKeyType", required = true)
    private StorageKeyType storageKeyType;

    /*
     * Storage key.
     */
    @JsonProperty(value = "storageKey", required = true)
    private String storageKey;

    /*
     * Storage Uri.
     */
    @JsonProperty(value = "storageUri", required = true)
    private String storageUri;

    /*
     * Administrator login name.
     */
    @JsonProperty(value = "administratorLogin", required = true)
    private String administratorLogin;

    /*
     * Administrator login password.
     */
    @JsonProperty(value = "administratorLoginPassword", required = true)
    private String administratorLoginPassword;

    /*
     * Authentication type.
     */
    @JsonProperty(value = "authenticationType")
    private String authenticationType;

    /*
     * Optional resource information to enable network isolation for request.
     */
    @JsonProperty(value = "networkIsolation")
    private NetworkIsolationSettings networkIsolation;

    /** Creates an instance of ImportNewDatabaseDefinition class. */
    public ImportNewDatabaseDefinition() {
    }

    /**
     * Get the databaseName property: Name of the import database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: Name of the import database.
     *
     * @param databaseName the databaseName value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the edition property: Edition of the import database.
     *
     * @return the edition value.
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Set the edition property: Edition of the import database.
     *
     * @param edition the edition value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the serviceObjectiveName property: Service level objective name of the import database.
     *
     * @return the serviceObjectiveName value.
     */
    public String serviceObjectiveName() {
        return this.serviceObjectiveName;
    }

    /**
     * Set the serviceObjectiveName property: Service level objective name of the import database.
     *
     * @param serviceObjectiveName the serviceObjectiveName value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withServiceObjectiveName(String serviceObjectiveName) {
        this.serviceObjectiveName = serviceObjectiveName;
        return this;
    }

    /**
     * Get the maxSizeBytes property: Max size in bytes for the import database.
     *
     * @return the maxSizeBytes value.
     */
    public String maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: Max size in bytes for the import database.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withMaxSizeBytes(String maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the storageKeyType property: Storage key type.
     *
     * @return the storageKeyType value.
     */
    public StorageKeyType storageKeyType() {
        return this.storageKeyType;
    }

    /**
     * Set the storageKeyType property: Storage key type.
     *
     * @param storageKeyType the storageKeyType value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withStorageKeyType(StorageKeyType storageKeyType) {
        this.storageKeyType = storageKeyType;
        return this;
    }

    /**
     * Get the storageKey property: Storage key.
     *
     * @return the storageKey value.
     */
    public String storageKey() {
        return this.storageKey;
    }

    /**
     * Set the storageKey property: Storage key.
     *
     * @param storageKey the storageKey value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withStorageKey(String storageKey) {
        this.storageKey = storageKey;
        return this;
    }

    /**
     * Get the storageUri property: Storage Uri.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: Storage Uri.
     *
     * @param storageUri the storageUri value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }

    /**
     * Get the administratorLogin property: Administrator login name.
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: Administrator login name.
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: Administrator login password.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: Administrator login password.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the authenticationType property: Authentication type.
     *
     * @return the authenticationType value.
     */
    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Authentication type.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the networkIsolation property: Optional resource information to enable network isolation for request.
     *
     * @return the networkIsolation value.
     */
    public NetworkIsolationSettings networkIsolation() {
        return this.networkIsolation;
    }

    /**
     * Set the networkIsolation property: Optional resource information to enable network isolation for request.
     *
     * @param networkIsolation the networkIsolation value to set.
     * @return the ImportNewDatabaseDefinition object itself.
     */
    public ImportNewDatabaseDefinition withNetworkIsolation(NetworkIsolationSettings networkIsolation) {
        this.networkIsolation = networkIsolation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageKeyType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageKeyType in model ImportNewDatabaseDefinition"));
        }
        if (storageKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageKey in model ImportNewDatabaseDefinition"));
        }
        if (storageUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageUri in model ImportNewDatabaseDefinition"));
        }
        if (administratorLogin() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorLogin in model ImportNewDatabaseDefinition"));
        }
        if (administratorLoginPassword() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorLoginPassword in model ImportNewDatabaseDefinition"));
        }
        if (networkIsolation() != null) {
            networkIsolation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImportNewDatabaseDefinition.class);
}