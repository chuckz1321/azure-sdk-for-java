// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotFhirDestinationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of IoT Connector FHIR destinations. */
@Fluent
public final class IotFhirDestinationCollection {
    /*
     * The link used to get the next page of IoT FHIR destinations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of IoT Connector FHIR destinations.
     */
    @JsonProperty(value = "value")
    private List<IotFhirDestinationInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of IoT FHIR destinations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of IoT FHIR destinations.
     *
     * @param nextLink the nextLink value to set.
     * @return the IotFhirDestinationCollection object itself.
     */
    public IotFhirDestinationCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of IoT Connector FHIR destinations.
     *
     * @return the value value.
     */
    public List<IotFhirDestinationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of IoT Connector FHIR destinations.
     *
     * @param value the value value to set.
     * @return the IotFhirDestinationCollection object itself.
     */
    public IotFhirDestinationCollection withValue(List<IotFhirDestinationInner> value) {
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
