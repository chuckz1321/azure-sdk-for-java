// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.NameInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NameInfoTests {
    @Test
    public void testDeserialize() {
        NameInfo model =
            BinaryData
                .fromString("{\"value\":\"ukjfkgiawxklr\",\"localizedValue\":\"lwckbasyypnddhs\"}")
                .toObject(NameInfo.class);
        Assertions.assertEquals("ukjfkgiawxklr", model.value());
        Assertions.assertEquals("lwckbasyypnddhs", model.localizedValue());
    }

    @Test
    public void testSerialize() {
        NameInfo model = new NameInfo().withValue("ukjfkgiawxklr").withLocalizedValue("lwckbasyypnddhs");
        model = BinaryData.fromObject(model).toObject(NameInfo.class);
        Assertions.assertEquals("ukjfkgiawxklr", model.value());
        Assertions.assertEquals("lwckbasyypnddhs", model.localizedValue());
    }
}
