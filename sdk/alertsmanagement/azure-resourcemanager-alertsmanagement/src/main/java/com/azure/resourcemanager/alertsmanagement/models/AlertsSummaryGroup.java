// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Group the result set. */
@Fluent
public final class AlertsSummaryGroup {
    /*
     * Total count of the result set.
     */
    @JsonProperty(value = "total")
    private Long total;

    /*
     * Total count of the smart groups.
     */
    @JsonProperty(value = "smartGroupsCount")
    private Long smartGroupsCount;

    /*
     * Name of the field aggregated
     */
    @JsonProperty(value = "groupedby")
    private String groupedby;

    /*
     * List of the items
     */
    @JsonProperty(value = "values")
    private List<AlertsSummaryGroupItem> values;

    /**
     * Get the total property: Total count of the result set.
     *
     * @return the total value.
     */
    public Long total() {
        return this.total;
    }

    /**
     * Set the total property: Total count of the result set.
     *
     * @param total the total value to set.
     * @return the AlertsSummaryGroup object itself.
     */
    public AlertsSummaryGroup withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get the smartGroupsCount property: Total count of the smart groups.
     *
     * @return the smartGroupsCount value.
     */
    public Long smartGroupsCount() {
        return this.smartGroupsCount;
    }

    /**
     * Set the smartGroupsCount property: Total count of the smart groups.
     *
     * @param smartGroupsCount the smartGroupsCount value to set.
     * @return the AlertsSummaryGroup object itself.
     */
    public AlertsSummaryGroup withSmartGroupsCount(Long smartGroupsCount) {
        this.smartGroupsCount = smartGroupsCount;
        return this;
    }

    /**
     * Get the groupedby property: Name of the field aggregated.
     *
     * @return the groupedby value.
     */
    public String groupedby() {
        return this.groupedby;
    }

    /**
     * Set the groupedby property: Name of the field aggregated.
     *
     * @param groupedby the groupedby value to set.
     * @return the AlertsSummaryGroup object itself.
     */
    public AlertsSummaryGroup withGroupedby(String groupedby) {
        this.groupedby = groupedby;
        return this;
    }

    /**
     * Get the values property: List of the items.
     *
     * @return the values value.
     */
    public List<AlertsSummaryGroupItem> values() {
        return this.values;
    }

    /**
     * Set the values property: List of the items.
     *
     * @param values the values value to set.
     * @return the AlertsSummaryGroup object itself.
     */
    public AlertsSummaryGroup withValues(List<AlertsSummaryGroupItem> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }
}
