// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AdvSecurityObjectTypeEnum;

/** Samples for GlobalRulestack ListAdvancedSecurityObjects. */
public final class GlobalRulestackListAdvancedSecurityObjectsSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2022-08-29/examples/GlobalRulestack_listAdvancedSecurityObjects_MaximumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listAdvancedSecurityObjects_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListAdvancedSecurityObjectsMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .globalRulestacks()
            .listAdvancedSecurityObjectsWithResponse(
                "praval",
                AdvSecurityObjectTypeEnum.fromString("globalRulestacks"),
                "a6a321",
                20,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2022-08-29/examples/GlobalRulestack_listAdvancedSecurityObjects_MinimumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listAdvancedSecurityObjects_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListAdvancedSecurityObjectsMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .globalRulestacks()
            .listAdvancedSecurityObjectsWithResponse(
                "praval",
                AdvSecurityObjectTypeEnum.fromString("globalRulestacks"),
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
