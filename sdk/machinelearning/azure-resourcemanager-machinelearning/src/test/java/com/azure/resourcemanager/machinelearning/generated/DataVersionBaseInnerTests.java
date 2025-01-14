// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.DataVersionBaseInner;
import com.azure.resourcemanager.machinelearning.models.DataVersionBaseProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataVersionBaseInnerTests {
    @Test
    public void testDeserialize() {
        DataVersionBaseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"dataType\":\"DataVersionBaseProperties\",\"dataUri\":\"vpkjpr\",\"isAnonymous\":true,\"isArchived\":false,\"description\":\"ql\",\"properties\":{\"dshmkxmaehvbbx\":\"gtczheydb\"},\"tags\":{\"kgxywr\":\"pltfnhtba\"}},\"id\":\"pyklyhpluodpvru\",\"name\":\"dlgzibthostgkt\",\"type\":\"tvdxeclzedqb\"}")
                .toObject(DataVersionBaseInner.class);
        Assertions.assertEquals("ql", model.properties().description());
        Assertions.assertEquals("gtczheydb", model.properties().properties().get("dshmkxmaehvbbx"));
        Assertions.assertEquals("pltfnhtba", model.properties().tags().get("kgxywr"));
        Assertions.assertEquals(true, model.properties().isAnonymous());
        Assertions.assertEquals(false, model.properties().isArchived());
        Assertions.assertEquals("vpkjpr", model.properties().dataUri());
    }

    @Test
    public void testSerialize() {
        DataVersionBaseInner model =
            new DataVersionBaseInner()
                .withProperties(
                    new DataVersionBaseProperties()
                        .withDescription("ql")
                        .withProperties(mapOf("dshmkxmaehvbbx", "gtczheydb"))
                        .withTags(mapOf("kgxywr", "pltfnhtba"))
                        .withIsAnonymous(true)
                        .withIsArchived(false)
                        .withDataUri("vpkjpr"));
        model = BinaryData.fromObject(model).toObject(DataVersionBaseInner.class);
        Assertions.assertEquals("ql", model.properties().description());
        Assertions.assertEquals("gtczheydb", model.properties().properties().get("dshmkxmaehvbbx"));
        Assertions.assertEquals("pltfnhtba", model.properties().tags().get("kgxywr"));
        Assertions.assertEquals(true, model.properties().isAnonymous());
        Assertions.assertEquals(false, model.properties().isArchived());
        Assertions.assertEquals("vpkjpr", model.properties().dataUri());
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
