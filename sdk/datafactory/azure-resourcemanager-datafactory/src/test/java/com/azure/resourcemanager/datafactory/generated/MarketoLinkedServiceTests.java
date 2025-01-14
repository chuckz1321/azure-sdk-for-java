// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MarketoLinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MarketoLinkedServiceTests {
    @Test
    public void testDeserialize() {
        MarketoLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Marketo\",\"typeProperties\":{\"clientSecret\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"qjcemqbmf\",\"parameters\":{}},\"description\":\"rwzxuqrebluimm\",\"parameters\":{\"gtdmbvx\":{\"type\":\"Float\"},\"aokqk\":{\"type\":\"Int\"},\"btwa\":{\"type\":\"String\"},\"avlyttaaknwf\":{\"type\":\"Bool\"}},\"annotations\":[],\"\":{}}")
                .toObject(MarketoLinkedService.class);
        Assertions.assertEquals("qjcemqbmf", model.connectVia().referenceName());
        Assertions.assertEquals("rwzxuqrebluimm", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("gtdmbvx").type());
    }

    @Test
    public void testSerialize() {
        MarketoLinkedService model =
            new MarketoLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("qjcemqbmf").withParameters(mapOf()))
                .withDescription("rwzxuqrebluimm")
                .withParameters(
                    mapOf(
                        "gtdmbvx",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "aokqk",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "btwa",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "avlyttaaknwf",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withClientSecret(new SecretBase());
        model = BinaryData.fromObject(model).toObject(MarketoLinkedService.class);
        Assertions.assertEquals("qjcemqbmf", model.connectVia().referenceName());
        Assertions.assertEquals("rwzxuqrebluimm", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("gtdmbvx").type());
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
