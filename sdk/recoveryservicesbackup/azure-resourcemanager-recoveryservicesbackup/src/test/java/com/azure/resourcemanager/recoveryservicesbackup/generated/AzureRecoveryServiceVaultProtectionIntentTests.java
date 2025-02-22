// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureRecoveryServiceVaultProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureRecoveryServiceVaultProtectionIntentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureRecoveryServiceVaultProtectionIntent model =
            BinaryData
                .fromString(
                    "{\"protectionIntentItemType\":\"RecoveryServiceVaultItem\",\"backupManagementType\":\"DPM\",\"sourceResourceId\":\"rebwggahtt\",\"itemId\":\"swvajqfu\",\"policyId\":\"x\",\"protectionState\":\"Protected\"}")
                .toObject(AzureRecoveryServiceVaultProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DPM, model.backupManagementType());
        Assertions.assertEquals("rebwggahtt", model.sourceResourceId());
        Assertions.assertEquals("swvajqfu", model.itemId());
        Assertions.assertEquals("x", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureRecoveryServiceVaultProtectionIntent model =
            new AzureRecoveryServiceVaultProtectionIntent()
                .withBackupManagementType(BackupManagementType.DPM)
                .withSourceResourceId("rebwggahtt")
                .withItemId("swvajqfu")
                .withPolicyId("x")
                .withProtectionState(ProtectionStatus.PROTECTED);
        model = BinaryData.fromObject(model).toObject(AzureRecoveryServiceVaultProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DPM, model.backupManagementType());
        Assertions.assertEquals("rebwggahtt", model.sourceResourceId());
        Assertions.assertEquals("swvajqfu", model.itemId());
        Assertions.assertEquals("x", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
    }
}
