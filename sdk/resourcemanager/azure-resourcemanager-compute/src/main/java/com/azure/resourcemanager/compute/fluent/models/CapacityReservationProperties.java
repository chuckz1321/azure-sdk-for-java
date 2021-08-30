// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.CapacityReservationInstanceView;
import com.azure.resourcemanager.compute.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of the Capacity reservation. */
@Immutable
public final class CapacityReservationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationProperties.class);

    /*
     * A unique id generated and assigned to the capacity reservation by the
     * platform which does not change throughout the lifetime of the resource.
     */
    @JsonProperty(value = "reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /*
     * A list of all virtual machine resource ids that are associated with the
     * capacity reservation.
     */
    @JsonProperty(value = "virtualMachinesAssociated", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachinesAssociated;

    /*
     * The date time when the capacity reservation was last updated.
     */
    @JsonProperty(value = "provisioningTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningTime;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The Capacity reservation instance view.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private CapacityReservationInstanceView instanceView;

    /**
     * Get the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     *
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }

    /**
     * Get the provisioningTime property: The date time when the capacity reservation was last updated.
     *
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.provisioningTime;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The Capacity reservation instance view.
     *
     * @return the instanceView value.
     */
    public CapacityReservationInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualMachinesAssociated() != null) {
            virtualMachinesAssociated().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}