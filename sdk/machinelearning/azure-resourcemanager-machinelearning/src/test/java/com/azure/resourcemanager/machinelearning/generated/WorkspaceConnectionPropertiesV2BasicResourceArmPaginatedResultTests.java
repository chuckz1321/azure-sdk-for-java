// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceConnectionPropertiesV2BasicResourceInner;
import com.azure.resourcemanager.machinelearning.models.ConnectionCategory;
import com.azure.resourcemanager.machinelearning.models.ValueFormat;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnectionPropertiesV2;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResultTests {
    @Test
    public void testDeserialize() {
        WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"authType\":\"WorkspaceConnectionPropertiesV2\",\"category\":\"PythonFeed\",\"target\":\"yqsemwa\",\"value\":\"ets\",\"valueFormat\":\"JSON\"},\"id\":\"h\",\"name\":\"d\",\"type\":\"lvwiwubmwmbesl\"}],\"nextLink\":\"k\"}")
                .toObject(WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResult.class);
        Assertions.assertEquals(ConnectionCategory.PYTHON_FEED, model.value().get(0).properties().category());
        Assertions.assertEquals("yqsemwa", model.value().get(0).properties().target());
        Assertions.assertEquals("ets", model.value().get(0).properties().value());
        Assertions.assertEquals(ValueFormat.JSON, model.value().get(0).properties().valueFormat());
    }

    @Test
    public void testSerialize() {
        WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResult model =
            new WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResult()
                .withValue(
                    Arrays
                        .asList(
                            new WorkspaceConnectionPropertiesV2BasicResourceInner()
                                .withProperties(
                                    new WorkspaceConnectionPropertiesV2()
                                        .withCategory(ConnectionCategory.PYTHON_FEED)
                                        .withTarget("yqsemwa")
                                        .withValue("ets")
                                        .withValueFormat(ValueFormat.JSON))));
        model =
            BinaryData.fromObject(model).toObject(WorkspaceConnectionPropertiesV2BasicResourceArmPaginatedResult.class);
        Assertions.assertEquals(ConnectionCategory.PYTHON_FEED, model.value().get(0).properties().category());
        Assertions.assertEquals("yqsemwa", model.value().get(0).properties().target());
        Assertions.assertEquals("ets", model.value().get(0).properties().value());
        Assertions.assertEquals(ValueFormat.JSON, model.value().get(0).properties().valueFormat());
    }
}
