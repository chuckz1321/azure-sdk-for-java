// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ProductApi CheckEntityExists. */
public final class ProductApiCheckEntityExistsSamples {
    /*
     * operationId: ProductApi_CheckEntityExists
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadProductApi
     */
    /**
     * Sample code: ApiManagementHeadProductApi.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadProductApi(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .productApis()
            .checkEntityExistsWithResponse(
                "rg1", "apimService1", "5931a75ae4bbd512a88c680b", "59306a29e4bbd510dc24e5f9", Context.NONE);
    }
}