// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.OracleServiceCloudLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Test;

public final class OracleServiceCloudLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        OracleServiceCloudLinkedServiceTypeProperties model =
            BinaryData
                .fromString("{\"password\":{\"type\":\"SecretBase\"}}")
                .toObject(OracleServiceCloudLinkedServiceTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        OracleServiceCloudLinkedServiceTypeProperties model =
            new OracleServiceCloudLinkedServiceTypeProperties().withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(OracleServiceCloudLinkedServiceTypeProperties.class);
    }
}
