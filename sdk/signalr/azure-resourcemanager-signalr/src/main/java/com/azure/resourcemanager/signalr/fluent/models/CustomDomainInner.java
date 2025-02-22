// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.models.ProvisioningState;
import com.azure.resourcemanager.signalr.models.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A custom domain. */
@Fluent
public final class CustomDomainInner extends ProxyResource {
    /*
     * Properties of a custom domain.
     */
    @JsonProperty(value = "properties", required = true)
    private CustomDomainProperties innerProperties = new CustomDomainProperties();

    /** Creates an instance of CustomDomainInner class. */
    public CustomDomainInner() {
    }

    /**
     * Get the innerProperties property: Properties of a custom domain.
     *
     * @return the innerProperties value.
     */
    private CustomDomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the domainName property: The custom domain name.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.innerProperties() == null ? null : this.innerProperties().domainName();
    }

    /**
     * Set the domainName property: The custom domain name.
     *
     * @param domainName the domainName value to set.
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withDomainName(String domainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDomainProperties();
        }
        this.innerProperties().withDomainName(domainName);
        return this;
    }

    /**
     * Get the customCertificate property: Reference to a resource.
     *
     * @return the customCertificate value.
     */
    public ResourceReference customCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().customCertificate();
    }

    /**
     * Set the customCertificate property: Reference to a resource.
     *
     * @param customCertificate the customCertificate value to set.
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withCustomCertificate(ResourceReference customCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDomainProperties();
        }
        this.innerProperties().withCustomCertificate(customCertificate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model CustomDomainInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainInner.class);
}
