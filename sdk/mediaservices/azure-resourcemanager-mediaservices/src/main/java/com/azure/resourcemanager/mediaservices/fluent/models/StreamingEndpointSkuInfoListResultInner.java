// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.models.ArmStreamingEndpointSkuInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The StreamingEndpointSkuInfoListResult model. */
@Fluent
public final class StreamingEndpointSkuInfoListResultInner {
    /*
     * The result of the List StreamingEndpoint skus.
     */
    @JsonProperty(value = "value")
    private List<ArmStreamingEndpointSkuInfo> value;

    /**
     * Get the value property: The result of the List StreamingEndpoint skus.
     *
     * @return the value value.
     */
    public List<ArmStreamingEndpointSkuInfo> value() {
        return this.value;
    }

    /**
     * Set the value property: The result of the List StreamingEndpoint skus.
     *
     * @param value the value value to set.
     * @return the StreamingEndpointSkuInfoListResultInner object itself.
     */
    public StreamingEndpointSkuInfoListResultInner withValue(List<ArmStreamingEndpointSkuInfo> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
