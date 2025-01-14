// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisPackage;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SsisPackageTests {
    @Test
    public void testDeserialize() {
        SsisPackage model =
            BinaryData
                .fromString(
                    "{\"type\":\"Package\",\"folderId\":3601952296163309140,\"projectVersion\":8470986356169230574,\"projectId\":6735926581234061180,\"parameters\":[{\"id\":4385041582120856952,\"name\":\"clf\",\"description\":\"annnoytzposewx\",\"dataType\":\"pxvkqma\",\"required\":false,\"sensitive\":true,\"designDefaultValue\":\"fdfa\",\"defaultValue\":\"yzyzeyuu\",\"sensitiveDefaultValue\":\"idszl\",\"valueType\":\"toi\",\"valueSet\":true,\"variable\":\"gvfltgvdihoynkr\"},{\"id\":4677354217948404592,\"name\":\"kdrcyrucp\",\"description\":\"nn\",\"dataType\":\"dqumoenodnai\",\"required\":false,\"sensitive\":false,\"designDefaultValue\":\"knd\",\"defaultValue\":\"lqkaadlknwf\",\"sensitiveDefaultValue\":\"nniyopetxi\",\"valueType\":\"nrlyxnuc\",\"valueSet\":false,\"variable\":\"blkwqpatvbqs\"}],\"id\":8282514178106229781,\"name\":\"ctvivuzqymtuo\",\"description\":\"gtgitsqhzvbrzcdb\"}")
                .toObject(SsisPackage.class);
        Assertions.assertEquals(8282514178106229781L, model.id());
        Assertions.assertEquals("ctvivuzqymtuo", model.name());
        Assertions.assertEquals("gtgitsqhzvbrzcdb", model.description());
        Assertions.assertEquals(3601952296163309140L, model.folderId());
        Assertions.assertEquals(8470986356169230574L, model.projectVersion());
        Assertions.assertEquals(6735926581234061180L, model.projectId());
        Assertions.assertEquals(4385041582120856952L, model.parameters().get(0).id());
        Assertions.assertEquals("clf", model.parameters().get(0).name());
        Assertions.assertEquals("annnoytzposewx", model.parameters().get(0).description());
        Assertions.assertEquals("pxvkqma", model.parameters().get(0).dataType());
        Assertions.assertEquals(false, model.parameters().get(0).required());
        Assertions.assertEquals(true, model.parameters().get(0).sensitive());
        Assertions.assertEquals("fdfa", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("yzyzeyuu", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("idszl", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("toi", model.parameters().get(0).valueType());
        Assertions.assertEquals(true, model.parameters().get(0).valueSet());
        Assertions.assertEquals("gvfltgvdihoynkr", model.parameters().get(0).variable());
    }

    @Test
    public void testSerialize() {
        SsisPackage model =
            new SsisPackage()
                .withId(8282514178106229781L)
                .withName("ctvivuzqymtuo")
                .withDescription("gtgitsqhzvbrzcdb")
                .withFolderId(3601952296163309140L)
                .withProjectVersion(8470986356169230574L)
                .withProjectId(6735926581234061180L)
                .withParameters(
                    Arrays
                        .asList(
                            new SsisParameter()
                                .withId(4385041582120856952L)
                                .withName("clf")
                                .withDescription("annnoytzposewx")
                                .withDataType("pxvkqma")
                                .withRequired(false)
                                .withSensitive(true)
                                .withDesignDefaultValue("fdfa")
                                .withDefaultValue("yzyzeyuu")
                                .withSensitiveDefaultValue("idszl")
                                .withValueType("toi")
                                .withValueSet(true)
                                .withVariable("gvfltgvdihoynkr"),
                            new SsisParameter()
                                .withId(4677354217948404592L)
                                .withName("kdrcyrucp")
                                .withDescription("nn")
                                .withDataType("dqumoenodnai")
                                .withRequired(false)
                                .withSensitive(false)
                                .withDesignDefaultValue("knd")
                                .withDefaultValue("lqkaadlknwf")
                                .withSensitiveDefaultValue("nniyopetxi")
                                .withValueType("nrlyxnuc")
                                .withValueSet(false)
                                .withVariable("blkwqpatvbqs")));
        model = BinaryData.fromObject(model).toObject(SsisPackage.class);
        Assertions.assertEquals(8282514178106229781L, model.id());
        Assertions.assertEquals("ctvivuzqymtuo", model.name());
        Assertions.assertEquals("gtgitsqhzvbrzcdb", model.description());
        Assertions.assertEquals(3601952296163309140L, model.folderId());
        Assertions.assertEquals(8470986356169230574L, model.projectVersion());
        Assertions.assertEquals(6735926581234061180L, model.projectId());
        Assertions.assertEquals(4385041582120856952L, model.parameters().get(0).id());
        Assertions.assertEquals("clf", model.parameters().get(0).name());
        Assertions.assertEquals("annnoytzposewx", model.parameters().get(0).description());
        Assertions.assertEquals("pxvkqma", model.parameters().get(0).dataType());
        Assertions.assertEquals(false, model.parameters().get(0).required());
        Assertions.assertEquals(true, model.parameters().get(0).sensitive());
        Assertions.assertEquals("fdfa", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("yzyzeyuu", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("idszl", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("toi", model.parameters().get(0).valueType());
        Assertions.assertEquals(true, model.parameters().get(0).valueSet());
        Assertions.assertEquals("gvfltgvdihoynkr", model.parameters().get(0).variable());
    }
}
