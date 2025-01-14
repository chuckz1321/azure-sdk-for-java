// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryMapping;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlDataDirectoryMappingTests {
    @Test
    public void testDeserialize() {
        SqlDataDirectoryMapping model =
            BinaryData
                .fromString(
                    "{\"mappingType\":\"Log\",\"sourceLogicalName\":\"yprotwyp\",\"sourcePath\":\"d\",\"targetPath\":\"xhugcm\"}")
                .toObject(SqlDataDirectoryMapping.class);
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.mappingType());
        Assertions.assertEquals("yprotwyp", model.sourceLogicalName());
        Assertions.assertEquals("d", model.sourcePath());
        Assertions.assertEquals("xhugcm", model.targetPath());
    }

    @Test
    public void testSerialize() {
        SqlDataDirectoryMapping model =
            new SqlDataDirectoryMapping()
                .withMappingType(SqlDataDirectoryType.LOG)
                .withSourceLogicalName("yprotwyp")
                .withSourcePath("d")
                .withTargetPath("xhugcm");
        model = BinaryData.fromObject(model).toObject(SqlDataDirectoryMapping.class);
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.mappingType());
        Assertions.assertEquals("yprotwyp", model.sourceLogicalName());
        Assertions.assertEquals("d", model.sourcePath());
        Assertions.assertEquals("xhugcm", model.targetPath());
    }
}
