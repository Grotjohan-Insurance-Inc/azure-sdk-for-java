// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.CacheRuleUpdateParameters;

/** Samples for CacheRules Update. */
public final class CacheRulesUpdateSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/CacheRuleUpdate.json
     */
    /**
     * Sample code: CacheRuleUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cacheRuleUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getCacheRules()
            .update(
                "myResourceGroup",
                "myRegistry",
                "myCacheRule",
                new CacheRuleUpdateParameters().withCredentialSetResourceId("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
