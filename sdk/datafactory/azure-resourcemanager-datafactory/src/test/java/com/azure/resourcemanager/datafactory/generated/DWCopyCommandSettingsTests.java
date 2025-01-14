// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DWCopyCommandDefaultValue;
import com.azure.resourcemanager.datafactory.models.DWCopyCommandSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DWCopyCommandSettingsTests {
    @Test
    public void testDeserialize() {
        DWCopyCommandSettings model =
            BinaryData
                .fromString("{\"defaultValues\":[{},{},{},{}],\"additionalOptions\":{\"zeka\":\"baaq\"}}")
                .toObject(DWCopyCommandSettings.class);
        Assertions.assertEquals("baaq", model.additionalOptions().get("zeka"));
    }

    @Test
    public void testSerialize() {
        DWCopyCommandSettings model =
            new DWCopyCommandSettings()
                .withDefaultValues(
                    Arrays
                        .asList(
                            new DWCopyCommandDefaultValue(),
                            new DWCopyCommandDefaultValue(),
                            new DWCopyCommandDefaultValue(),
                            new DWCopyCommandDefaultValue()))
                .withAdditionalOptions(mapOf("zeka", "baaq"));
        model = BinaryData.fromObject(model).toObject(DWCopyCommandSettings.class);
        Assertions.assertEquals("baaq", model.additionalOptions().get("zeka"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
