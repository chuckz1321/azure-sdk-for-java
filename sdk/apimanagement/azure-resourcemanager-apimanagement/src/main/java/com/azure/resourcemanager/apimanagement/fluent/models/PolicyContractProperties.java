// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.PolicyContentFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Policy contract Properties. */
@Fluent
public final class PolicyContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyContractProperties.class);

    /*
     * Contents of the Policy as defined by the format.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Format of the policyContent.
     */
    @JsonProperty(value = "format")
    private PolicyContentFormat format;

    /**
     * Get the value property: Contents of the Policy as defined by the format.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Contents of the Policy as defined by the format.
     *
     * @param value the value value to set.
     * @return the PolicyContractProperties object itself.
     */
    public PolicyContractProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the format property: Format of the policyContent.
     *
     * @return the format value.
     */
    public PolicyContentFormat format() {
        return this.format;
    }

    /**
     * Set the format property: Format of the policyContent.
     *
     * @param format the format value to set.
     * @return the PolicyContractProperties object itself.
     */
    public PolicyContractProperties withFormat(PolicyContentFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model PolicyContractProperties"));
        }
    }
}