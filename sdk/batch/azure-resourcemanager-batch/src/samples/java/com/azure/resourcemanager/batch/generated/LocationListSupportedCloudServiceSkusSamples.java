// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/** Samples for Location ListSupportedCloudServiceSkus. */
public final class LocationListSupportedCloudServiceSkusSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/LocationListCloudServiceSkus.json
     */
    /**
     * Sample code: LocationListCloudServiceSkus.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void locationListCloudServiceSkus(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.locations().listSupportedCloudServiceSkus("japaneast", null, null, com.azure.core.util.Context.NONE);
    }
}
