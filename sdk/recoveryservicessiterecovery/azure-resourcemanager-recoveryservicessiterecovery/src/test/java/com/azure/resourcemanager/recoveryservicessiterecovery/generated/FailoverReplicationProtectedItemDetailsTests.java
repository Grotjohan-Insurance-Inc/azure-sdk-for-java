// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverReplicationProtectedItemDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class FailoverReplicationProtectedItemDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FailoverReplicationProtectedItemDetails model =
            BinaryData
                .fromString(
                    "{\"name\":\"xpzruzythqkk\",\"friendlyName\":\"bg\",\"testVmName\":\"ellv\",\"testVmFriendlyName\":\"nxdmnitmujdtv\",\"networkConnectionStatus\":\"lyymffhmjpddny\",\"networkFriendlyName\":\"zuvrzmzqmz\",\"subnet\":\"rb\",\"recoveryPointId\":\"vnmdyfoeboj\",\"recoveryPointTime\":\"2021-06-09T22:38:27Z\"}")
                .toObject(FailoverReplicationProtectedItemDetails.class);
        Assertions.assertEquals("xpzruzythqkk", model.name());
        Assertions.assertEquals("bg", model.friendlyName());
        Assertions.assertEquals("ellv", model.testVmName());
        Assertions.assertEquals("nxdmnitmujdtv", model.testVmFriendlyName());
        Assertions.assertEquals("lyymffhmjpddny", model.networkConnectionStatus());
        Assertions.assertEquals("zuvrzmzqmz", model.networkFriendlyName());
        Assertions.assertEquals("rb", model.subnet());
        Assertions.assertEquals("vnmdyfoeboj", model.recoveryPointId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-09T22:38:27Z"), model.recoveryPointTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FailoverReplicationProtectedItemDetails model =
            new FailoverReplicationProtectedItemDetails()
                .withName("xpzruzythqkk")
                .withFriendlyName("bg")
                .withTestVmName("ellv")
                .withTestVmFriendlyName("nxdmnitmujdtv")
                .withNetworkConnectionStatus("lyymffhmjpddny")
                .withNetworkFriendlyName("zuvrzmzqmz")
                .withSubnet("rb")
                .withRecoveryPointId("vnmdyfoeboj")
                .withRecoveryPointTime(OffsetDateTime.parse("2021-06-09T22:38:27Z"));
        model = BinaryData.fromObject(model).toObject(FailoverReplicationProtectedItemDetails.class);
        Assertions.assertEquals("xpzruzythqkk", model.name());
        Assertions.assertEquals("bg", model.friendlyName());
        Assertions.assertEquals("ellv", model.testVmName());
        Assertions.assertEquals("nxdmnitmujdtv", model.testVmFriendlyName());
        Assertions.assertEquals("lyymffhmjpddny", model.networkConnectionStatus());
        Assertions.assertEquals("zuvrzmzqmz", model.networkFriendlyName());
        Assertions.assertEquals("rb", model.subnet());
        Assertions.assertEquals("vnmdyfoeboj", model.recoveryPointId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-09T22:38:27Z"), model.recoveryPointTime());
    }
}
