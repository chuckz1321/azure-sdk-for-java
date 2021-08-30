// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Notification ListByService. */
public final class NotificationListByServiceSamples {
    /*
     * operationId: Notification_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListNotifications
     */
    /**
     * Sample code: ApiManagementListNotifications.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListNotifications(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.notifications().listByService("rg1", "apimService1", null, null, Context.NONE);
    }
}