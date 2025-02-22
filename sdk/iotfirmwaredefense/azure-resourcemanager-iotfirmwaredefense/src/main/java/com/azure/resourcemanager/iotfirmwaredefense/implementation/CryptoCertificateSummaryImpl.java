// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.implementation;

import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.CryptoCertificateSummaryInner;
import com.azure.resourcemanager.iotfirmwaredefense.models.CryptoCertificateSummary;

public final class CryptoCertificateSummaryImpl implements CryptoCertificateSummary {
    private CryptoCertificateSummaryInner innerObject;

    private final com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager;

    CryptoCertificateSummaryImpl(
        CryptoCertificateSummaryInner innerObject,
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Long totalCertificates() {
        return this.innerModel().totalCertificates();
    }

    public Long pairedKeys() {
        return this.innerModel().pairedKeys();
    }

    public Long expired() {
        return this.innerModel().expired();
    }

    public Long expiringSoon() {
        return this.innerModel().expiringSoon();
    }

    public Long weakSignature() {
        return this.innerModel().weakSignature();
    }

    public Long selfSigned() {
        return this.innerModel().selfSigned();
    }

    public Long shortKeySize() {
        return this.innerModel().shortKeySize();
    }

    public CryptoCertificateSummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager() {
        return this.serviceManager;
    }
}
