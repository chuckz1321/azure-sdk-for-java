// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SparkConfiguration Get. */
public final class SparkConfigurationGetSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/SparkConfiguration_Get.json
     */
    /**
     * Sample code: Get SparkConfiguration by name.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getSparkConfigurationByName(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sparkConfigurations()
            .getWithResponse("exampleResourceGroup", "exampleSparkConfigurationName", "exampleWorkspace", Context.NONE);
    }
}