// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceBackupRestoreParameters;

/** Samples for ApiManagementService Backup. */
public final class ApiManagementServiceBackupSamples {
    /*
     * operationId: ApiManagementService_Backup
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateBackup
     */
    /**
     * Sample code: ApiManagementCreateBackup.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateBackup(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .backup(
                "rg1",
                "apimService1",
                new ApiManagementServiceBackupRestoreParameters()
                    .withStorageAccount("teststorageaccount")
                    .withAccessKey("**************************************************")
                    .withContainerName("backupContainer")
                    .withBackupName("apimService1backup_2017_03_19"),
                Context.NONE);
    }
}