// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TarGZipReadSettings;
import org.junit.jupiter.api.Test;

public final class TarGZipReadSettingsTests {
    @Test
    public void testDeserialize() {
        TarGZipReadSettings model =
            BinaryData.fromString("{\"type\":\"TarGZipReadSettings\",\"\":{}}").toObject(TarGZipReadSettings.class);
    }

    @Test
    public void testSerialize() {
        TarGZipReadSettings model = new TarGZipReadSettings();
        model = BinaryData.fromObject(model).toObject(TarGZipReadSettings.class);
    }
}
