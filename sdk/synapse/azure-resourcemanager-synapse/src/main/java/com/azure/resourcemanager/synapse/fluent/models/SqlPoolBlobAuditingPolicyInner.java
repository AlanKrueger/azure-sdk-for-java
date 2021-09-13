// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.BlobAuditingPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** A Sql pool blob auditing policy. */
@Fluent
public final class SqlPoolBlobAuditingPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolBlobAuditingPolicyInner.class);

    /*
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SqlPoolBlobAuditingPolicyProperties innerProperties;

    /**
     * Get the kind property: Resource kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SqlPoolBlobAuditingPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: Specifies the state of the policy. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     *
     * @return the state value.
     */
    public BlobAuditingPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the policy. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     *
     * @param state the state value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withState(BlobAuditingPolicyState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
     *
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().storageEndpoint();
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
     *
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withStorageEndpoint(String storageEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withStorageEndpoint(storageEndpoint);
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
     *
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountAccessKey();
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in the audit logs in the storage account.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionDays();
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in the audit logs in the storage account.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withRetentionDays(Integer retentionDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withRetentionDays(retentionDays);
        return this;
    }

    /**
     * Get the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
     *
     * <p>The recommended set of action groups to use is the following combination - this will audit all the queries and
     * stored procedures executed against the database, as well as successful and failed logins:
     *
     * <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP, FAILED_DATABASE_AUTHENTICATION_GROUP.
     *
     * <p>This above combination is also the set that is configured by default when enabling auditing from the Azure
     * portal.
     *
     * <p>The supported action groups to audit are (note: choose only specific groups that cover your auditing needs.
     * Using unnecessary groups could lead to very large quantities of audit records):
     *
     * <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP BATCH_COMPLETED_GROUP
     *
     * <p>These are groups that cover all sql statements and stored procedures executed against the database, and should
     * not be used in combination with other groups as this will result in duplicate audit logs.
     *
     * <p>For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     *
     * <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified
     * for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT DELETE EXECUTE RECEIVE
     * REFERENCES
     *
     * <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
     *
     * <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure,
     * or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name}
     * are used, respectively.
     *
     * <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
     * SCHEMA::mySchema by public
     *
     * <p>For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @return the auditActionsAndGroups value.
     */
    public List<String> auditActionsAndGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().auditActionsAndGroups();
    }

    /**
     * Set the auditActionsAndGroups property: Specifies the Actions-Groups and Actions to audit.
     *
     * <p>The recommended set of action groups to use is the following combination - this will audit all the queries and
     * stored procedures executed against the database, as well as successful and failed logins:
     *
     * <p>BATCH_COMPLETED_GROUP, SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP, FAILED_DATABASE_AUTHENTICATION_GROUP.
     *
     * <p>This above combination is also the set that is configured by default when enabling auditing from the Azure
     * portal.
     *
     * <p>The supported action groups to audit are (note: choose only specific groups that cover your auditing needs.
     * Using unnecessary groups could lead to very large quantities of audit records):
     *
     * <p>APPLICATION_ROLE_CHANGE_PASSWORD_GROUP BACKUP_RESTORE_GROUP DATABASE_LOGOUT_GROUP DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP DATABASE_OBJECT_PERMISSION_CHANGE_GROUP DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP DATABASE_PRINCIPAL_CHANGE_GROUP DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP FAILED_DATABASE_AUTHENTICATION_GROUP SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP USER_CHANGE_PASSWORD_GROUP BATCH_STARTED_GROUP BATCH_COMPLETED_GROUP
     *
     * <p>These are groups that cover all sql statements and stored procedures executed against the database, and should
     * not be used in combination with other groups as this will result in duplicate audit logs.
     *
     * <p>For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     *
     * <p>For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified
     * for Server auditing policy). The supported actions to audit are: SELECT UPDATE INSERT DELETE EXECUTE RECEIVE
     * REFERENCES
     *
     * <p>The general form for defining an action to be audited is: {action} ON {object} BY {principal}
     *
     * <p>Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure,
     * or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name}
     * are used, respectively.
     *
     * <p>For example: SELECT on dbo.myTable by public SELECT on DATABASE::myDatabase by public SELECT on
     * SCHEMA::mySchema by public
     *
     * <p>For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @param auditActionsAndGroups the auditActionsAndGroups value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    /**
     * Get the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value.
     */
    public UUID storageAccountSubscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountSubscriptionId();
    }

    /**
     * Set the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    /**
     * Get the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     *
     * @return the isStorageSecondaryKeyInUse value.
     */
    public Boolean isStorageSecondaryKeyInUse() {
        return this.innerProperties() == null ? null : this.innerProperties().isStorageSecondaryKeyInUse();
    }

    /**
     * Set the isStorageSecondaryKeyInUse property: Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     *
     * @param isStorageSecondaryKeyInUse the isStorageSecondaryKeyInUse value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    /**
     * Get the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure Monitor. In order
     * to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
     *
     * <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs
     * category on the database should be also created. Note that for server level audit you should use the 'master'
     * database as {databaseName}.
     *
     * <p>Diagnostic Settings URI format: PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * <p>For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207) or
     * [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @return the isAzureMonitorTargetEnabled value.
     */
    public Boolean isAzureMonitorTargetEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isAzureMonitorTargetEnabled();
    }

    /**
     * Set the isAzureMonitorTargetEnabled property: Specifies whether audit events are sent to Azure Monitor. In order
     * to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
     *
     * <p>When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs
     * category on the database should be also created. Note that for server level audit you should use the 'master'
     * database as {databaseName}.
     *
     * <p>Diagnostic Settings URI format: PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * <p>For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207) or
     * [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @param isAzureMonitorTargetEnabled the isAzureMonitorTargetEnabled value to set.
     * @return the SqlPoolBlobAuditingPolicyInner object itself.
     */
    public SqlPoolBlobAuditingPolicyInner withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolBlobAuditingPolicyProperties();
        }
        this.innerProperties().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
