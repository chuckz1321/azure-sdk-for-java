// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.models.DataConnectionCheckNameRequest;

/** Samples for KustoPoolDataConnections CheckNameAvailability. */
public final class KustoPoolDataConnectionsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolDataConnectionsCheckNameAvailability.json
     */
    /**
     * Sample code: KustoPoolDataConnectionsCheckNameAvailability.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolDataConnectionsCheckNameAvailability(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolDataConnections()
            .checkNameAvailabilityWithResponse(
                "kustorptest",
                "synapseWorkspaceName",
                "kustoclusterrptest4",
                "Kustodatabase8",
                new DataConnectionCheckNameRequest().withName("DataConnections8"),
                Context.NONE);
    }
}