// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ChainingTrigger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ChainingTriggerTests {
    @Test
    public void testDeserialize() {
        ChainingTrigger model =
            BinaryData
                .fromString(
                    "{\"type\":\"ChainingTrigger\",\"pipeline\":{\"pipelineReference\":{\"referenceName\":\"ynfaooeactedcgls\",\"name\":\"k\"},\"parameters\":{}},\"typeProperties\":{\"dependsOn\":[{\"referenceName\":\"ahzllrqmtlpb\",\"name\":\"roid\"},{\"referenceName\":\"y\",\"name\":\"pffmnoii\"},{\"referenceName\":\"sudyh\",\"name\":\"jjtalxrdsj\"}],\"runDimension\":\"h\"},\"description\":\"uqwg\",\"runtimeState\":\"Disabled\",\"annotations\":[],\"\":{}}")
                .toObject(ChainingTrigger.class);
        Assertions.assertEquals("uqwg", model.description());
        Assertions.assertEquals("ynfaooeactedcgls", model.pipeline().pipelineReference().referenceName());
        Assertions.assertEquals("k", model.pipeline().pipelineReference().name());
        Assertions.assertEquals("ahzllrqmtlpb", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("roid", model.dependsOn().get(0).name());
        Assertions.assertEquals("h", model.runDimension());
    }

    @Test
    public void testSerialize() {
        ChainingTrigger model =
            new ChainingTrigger()
                .withDescription("uqwg")
                .withAnnotations(Arrays.asList())
                .withPipeline(
                    new TriggerPipelineReference()
                        .withPipelineReference(
                            new PipelineReference().withReferenceName("ynfaooeactedcgls").withName("k"))
                        .withParameters(mapOf()))
                .withDependsOn(
                    Arrays
                        .asList(
                            new PipelineReference().withReferenceName("ahzllrqmtlpb").withName("roid"),
                            new PipelineReference().withReferenceName("y").withName("pffmnoii"),
                            new PipelineReference().withReferenceName("sudyh").withName("jjtalxrdsj")))
                .withRunDimension("h");
        model = BinaryData.fromObject(model).toObject(ChainingTrigger.class);
        Assertions.assertEquals("uqwg", model.description());
        Assertions.assertEquals("ynfaooeactedcgls", model.pipeline().pipelineReference().referenceName());
        Assertions.assertEquals("k", model.pipeline().pipelineReference().name());
        Assertions.assertEquals("ahzllrqmtlpb", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("roid", model.dependsOn().get(0).name());
        Assertions.assertEquals("h", model.runDimension());
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
