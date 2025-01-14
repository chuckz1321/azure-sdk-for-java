// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.DelimitedTextDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DelimitedTextDatasetTests {
    @Test
    public void testDeserialize() {
        DelimitedTextDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"DelimitedText\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"\":{}}},\"description\":\"ibn\",\"linkedServiceName\":{\"referenceName\":\"suxswqrntvlwijp\",\"parameters\":{}},\"parameters\":{\"qpwcyyufmh\":{\"type\":\"Array\"},\"cuwmqsp\":{\"type\":\"Float\"},\"qzhlctddunq\":{\"type\":\"Object\"},\"fpch\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"jrcg\"},\"\":{}}")
                .toObject(DelimitedTextDataset.class);
        Assertions.assertEquals("ibn", model.description());
        Assertions.assertEquals("suxswqrntvlwijp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("qpwcyyufmh").type());
        Assertions.assertEquals("jrcg", model.folder().name());
    }

    @Test
    public void testSerialize() {
        DelimitedTextDataset model =
            new DelimitedTextDataset()
                .withDescription("ibn")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("suxswqrntvlwijp").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "qpwcyyufmh",
                        new ParameterSpecification().withType(ParameterType.ARRAY),
                        "cuwmqsp",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "qzhlctddunq",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "fpch",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("jrcg"))
                .withLocation(new DatasetLocation().withAdditionalProperties(mapOf("type", "DatasetLocation")));
        model = BinaryData.fromObject(model).toObject(DelimitedTextDataset.class);
        Assertions.assertEquals("ibn", model.description());
        Assertions.assertEquals("suxswqrntvlwijp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("qpwcyyufmh").type());
        Assertions.assertEquals("jrcg", model.folder().name());
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
