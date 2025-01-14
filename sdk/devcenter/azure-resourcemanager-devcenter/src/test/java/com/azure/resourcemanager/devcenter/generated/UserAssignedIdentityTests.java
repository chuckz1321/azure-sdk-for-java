// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import org.junit.jupiter.api.Test;

public final class UserAssignedIdentityTests {
    @Test
    public void testDeserialize() {
        UserAssignedIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"33e3e85f-cb75-4a4b-9441-25ee118d0819\",\"clientId\":\"1d0d63d2-746e-4091-8e23-bf1bf3c0e263\"}")
                .toObject(UserAssignedIdentity.class);
    }

    @Test
    public void testSerialize() {
        UserAssignedIdentity model = new UserAssignedIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentity.class);
    }
}
