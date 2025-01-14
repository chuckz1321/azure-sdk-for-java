// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.LogSchedulePolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LogSchedulePolicyTests {
    @Test
    public void testDeserialize() {
        LogSchedulePolicy model =
            BinaryData
                .fromString("{\"schedulePolicyType\":\"LogSchedulePolicy\",\"scheduleFrequencyInMins\":1075405640}")
                .toObject(LogSchedulePolicy.class);
        Assertions.assertEquals(1075405640, model.scheduleFrequencyInMins());
    }

    @Test
    public void testSerialize() {
        LogSchedulePolicy model = new LogSchedulePolicy().withScheduleFrequencyInMins(1075405640);
        model = BinaryData.fromObject(model).toObject(LogSchedulePolicy.class);
        Assertions.assertEquals(1075405640, model.scheduleFrequencyInMins());
    }
}
