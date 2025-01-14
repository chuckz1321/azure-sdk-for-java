// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.ExecuteWranglingDataflowActivity;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import com.azure.resourcemanager.datafactory.models.PowerQuerySinkMapping;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExecuteWranglingDataflowActivityTests {
    @Test
    public void testDeserialize() {
        ExecuteWranglingDataflowActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"ExecuteWranglingDataflow\",\"typeProperties\":{\"sinks\":{\"yuoh\":{\"script\":\"mmkfq\",\"name\":\"qulw\",\"description\":\"rjmeqkvyhz\"},\"zw\":{\"script\":\"nsnaajphmp\",\"name\":\"nglpwsada\",\"description\":\"sumxpezcoioyj\"},\"qpqifdbmptrwtxz\":{\"script\":\"nxkeed\",\"name\":\"m\",\"description\":\"xfqzkvemyzd\"}},\"queries\":[{\"queryName\":\"monatnizexroq\",\"dataflowSinks\":[]},{\"queryName\":\"ghrmthsplw\",\"dataflowSinks\":[]}],\"dataFlow\":{\"type\":\"DataFlowReference\",\"referenceName\":\"xsrgxfqpan\",\"parameters\":{},\"\":{}},\"staging\":{},\"integrationRuntime\":{\"referenceName\":\"sxyr\",\"parameters\":{}},\"compute\":{}},\"policy\":{\"retryIntervalInSeconds\":699381711,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"nkvycqqqdseipnqu\",\"description\":\"xhrptyodlh\",\"dependsOn\":[{\"activity\":\"tltddsob\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Failed\"],\"\":{}},{\"activity\":\"bqezkqxsal\",\"dependencyConditions\":[\"Skipped\",\"Completed\"],\"\":{}},{\"activity\":\"cvcewb\",\"dependencyConditions\":[\"Skipped\",\"Failed\",\"Succeeded\"],\"\":{}},{\"activity\":\"satmr\",\"dependencyConditions\":[\"Skipped\"],\"\":{}}],\"userProperties\":[{\"name\":\"s\"}],\"\":{}}")
                .toObject(ExecuteWranglingDataflowActivity.class);
        Assertions.assertEquals("nkvycqqqdseipnqu", model.name());
        Assertions.assertEquals("xhrptyodlh", model.description());
        Assertions.assertEquals("tltddsob", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("s", model.userProperties().get(0).name());
        Assertions.assertEquals(699381711, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("qulw", model.sinks().get("yuoh").name());
        Assertions.assertEquals("rjmeqkvyhz", model.sinks().get("yuoh").description());
        Assertions.assertEquals("mmkfq", model.sinks().get("yuoh").script());
        Assertions.assertEquals("monatnizexroq", model.queries().get(0).queryName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("xsrgxfqpan", model.dataFlow().referenceName());
        Assertions.assertEquals("sxyr", model.integrationRuntime().referenceName());
    }

    @Test
    public void testSerialize() {
        ExecuteWranglingDataflowActivity model =
            new ExecuteWranglingDataflowActivity()
                .withName("nkvycqqqdseipnqu")
                .withDescription("xhrptyodlh")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("tltddsob")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("bqezkqxsal")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("cvcewb")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("satmr")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("s")))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(699381711)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withSinks(
                    mapOf(
                        "yuoh",
                        new PowerQuerySink().withName("qulw").withDescription("rjmeqkvyhz").withScript("mmkfq"),
                        "zw",
                        new PowerQuerySink()
                            .withName("nglpwsada")
                            .withDescription("sumxpezcoioyj")
                            .withScript("nsnaajphmp"),
                        "qpqifdbmptrwtxz",
                        new PowerQuerySink().withName("m").withDescription("xfqzkvemyzd").withScript("nxkeed")))
                .withQueries(
                    Arrays
                        .asList(
                            new PowerQuerySinkMapping()
                                .withQueryName("monatnizexroq")
                                .withDataflowSinks(Arrays.asList()),
                            new PowerQuerySinkMapping().withQueryName("ghrmthsplw").withDataflowSinks(Arrays.asList())))
                .withDataFlow(
                    new DataFlowReference()
                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("xsrgxfqpan")
                        .withParameters(mapOf())
                        .withAdditionalProperties(mapOf()))
                .withStaging(new DataFlowStagingInfo())
                .withIntegrationRuntime(
                    new IntegrationRuntimeReference().withReferenceName("sxyr").withParameters(mapOf()))
                .withCompute(new ExecuteDataFlowActivityTypePropertiesCompute());
        model = BinaryData.fromObject(model).toObject(ExecuteWranglingDataflowActivity.class);
        Assertions.assertEquals("nkvycqqqdseipnqu", model.name());
        Assertions.assertEquals("xhrptyodlh", model.description());
        Assertions.assertEquals("tltddsob", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("s", model.userProperties().get(0).name());
        Assertions.assertEquals(699381711, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("qulw", model.sinks().get("yuoh").name());
        Assertions.assertEquals("rjmeqkvyhz", model.sinks().get("yuoh").description());
        Assertions.assertEquals("mmkfq", model.sinks().get("yuoh").script());
        Assertions.assertEquals("monatnizexroq", model.queries().get(0).queryName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("xsrgxfqpan", model.dataFlow().referenceName());
        Assertions.assertEquals("sxyr", model.integrationRuntime().referenceName());
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
