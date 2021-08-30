// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for TenantSettings ListByService. */
public final class TenantSettingsListByServiceSamples {
    /*
     * operationId: TenantSettings_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListTenantSettings
     */
    /**
     * Sample code: ApiManagementListTenantSettings.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListTenantSettings(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.tenantSettings().listByService("rg1", "apimService1", null, Context.NONE);
    }
}