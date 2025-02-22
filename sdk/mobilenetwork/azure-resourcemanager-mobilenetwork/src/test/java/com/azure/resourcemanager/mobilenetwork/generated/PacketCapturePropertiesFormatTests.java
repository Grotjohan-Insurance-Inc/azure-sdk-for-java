// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCapturePropertiesFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCapturePropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCapturePropertiesFormat model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Failed\",\"status\":\"Stopped\",\"reason\":\"sqpjhvmdajvn\",\"captureStartTime\":\"2021-10-10T23:28:16Z\",\"networkInterfaces\":[\"q\",\"canoaeupf\",\"yhltrpmopjmcm\"],\"bytesToCapturePerPacket\":265760237696237793,\"totalBytesPerSession\":8426383833555811142,\"timeLimitInSeconds\":2088786530}")
                .toObject(PacketCapturePropertiesFormat.class);
        Assertions.assertEquals("q", model.networkInterfaces().get(0));
        Assertions.assertEquals(265760237696237793L, model.bytesToCapturePerPacket());
        Assertions.assertEquals(8426383833555811142L, model.totalBytesPerSession());
        Assertions.assertEquals(2088786530, model.timeLimitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCapturePropertiesFormat model =
            new PacketCapturePropertiesFormat()
                .withNetworkInterfaces(Arrays.asList("q", "canoaeupf", "yhltrpmopjmcm"))
                .withBytesToCapturePerPacket(265760237696237793L)
                .withTotalBytesPerSession(8426383833555811142L)
                .withTimeLimitInSeconds(2088786530);
        model = BinaryData.fromObject(model).toObject(PacketCapturePropertiesFormat.class);
        Assertions.assertEquals("q", model.networkInterfaces().get(0));
        Assertions.assertEquals(265760237696237793L, model.bytesToCapturePerPacket());
        Assertions.assertEquals(8426383833555811142L, model.totalBytesPerSession());
        Assertions.assertEquals(2088786530, model.timeLimitInSeconds());
    }
}
