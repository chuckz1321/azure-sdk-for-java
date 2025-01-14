// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeStatus;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class SelfHostedIntegrationRuntimeStatusTests {
    @Test
    public void testDeserialize() {
        SelfHostedIntegrationRuntimeStatus model =
            BinaryData
                .fromString(
                    "{\"type\":\"SelfHosted\",\"typeProperties\":{\"createTime\":\"2021-01-11T18:05:39Z\",\"taskQueueId\":\"vtwknvgmmbugt\",\"internalChannelEncryption\":\"NotEncrypted\",\"version\":\"mqaqkueatgroes\",\"nodes\":[{\"nodeName\":\"zcbyfq\",\"machineName\":\"faoytehqpuv\",\"hostServiceUri\":\"vqmtdwckygroejn\",\"status\":\"Initializing\",\"capabilities\":{},\"versionStatus\":\"juskbrreqyn\",\"version\":\"eysfaqegplw\",\"registerTime\":\"2021-11-04T02:30:34Z\",\"lastConnectTime\":\"2020-12-21T02:35:09Z\",\"expiryTime\":\"2021-09-25T21:50:21Z\",\"lastStartTime\":\"2021-10-08T22:13:16Z\",\"lastStopTime\":\"2021-10-26T06:09:59Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-11-09T08:51:20Z\",\"lastEndUpdateTime\":\"2021-03-24T18:46Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":593412878,\"maxConcurrentJobs\":1893356146,\"\":{}}],\"scheduledUpdateDate\":\"2021-01-01T06:11:38Z\",\"updateDelayOffset\":\"vlf\",\"localTimeZoneOffset\":\"ymtpo\",\"capabilities\":{\"r\":\"naz\",\"qalsxkd\":\"hzr\",\"vessm\":\"wqapfgsdp\",\"dqq\":\"hhkuuip\"},\"serviceUrls\":[\"kva\",\"blhtjq\",\"qyv\"],\"autoUpdate\":\"On\",\"versionStatus\":\"a\",\"links\":[{\"name\":\"zzy\",\"subscriptionId\":\"vusxiv\",\"dataFactoryName\":\"rryveimipskdy\",\"dataFactoryLocation\":\"tv\",\"createTime\":\"2021-09-22T17:23:18Z\"},{\"name\":\"aftjvvruxwigsy\",\"subscriptionId\":\"pq\",\"dataFactoryName\":\"mjtgrqg\",\"dataFactoryLocation\":\"kkileplkc\",\"createTime\":\"2021-08-28T00:38:42Z\"}],\"pushedVersion\":\"hwtbbaedorvvm\",\"latestVersion\":\"loyg\",\"autoUpdateETA\":\"2021-09-06T23:54:43Z\"},\"dataFactoryName\":\"umgxdgdhpab\",\"state\":\"Starting\",\"\":{}}")
                .toObject(SelfHostedIntegrationRuntimeStatus.class);
    }

    @Test
    public void testSerialize() throws IOException {
        SelfHostedIntegrationRuntimeStatus model =
            new SelfHostedIntegrationRuntimeStatus()
                .withNodes(
                    Arrays
                        .asList(
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "zcbyfq",
                                        "lastStartUpdateTime",
                                        "2021-11-09T08:51:20Z",
                                        "lastConnectTime",
                                        "2020-12-21T02:35:09Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize("{}", Object.class, SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "vqmtdwckygroejn",
                                        "registerTime",
                                        "2021-11-04T02:30:34Z",
                                        "maxConcurrentJobs",
                                        1893356146,
                                        "lastStopTime",
                                        "2021-10-26T06:09:59Z",
                                        "version",
                                        "eysfaqegplw",
                                        "machineName",
                                        "faoytehqpuv",
                                        "versionStatus",
                                        "juskbrreqyn",
                                        "concurrentJobsLimit",
                                        593412878,
                                        "lastEndUpdateTime",
                                        "2021-03-24T18:46Z",
                                        "expiryTime",
                                        "2021-09-25T21:50:21Z",
                                        "lastStartTime",
                                        "2021-10-08T22:13:16Z",
                                        "lastUpdateResult",
                                        "Succeed",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "Initializing"))))
                .withLinks(Arrays.asList(new LinkedIntegrationRuntime(), new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatus.class);
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
