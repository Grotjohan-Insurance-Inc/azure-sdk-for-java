// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIdentityCredentialResourceInner;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredential;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredentialResource;

public final class ManagedIdentityCredentialResourceImpl
    implements ManagedIdentityCredentialResource,
        ManagedIdentityCredentialResource.Definition,
        ManagedIdentityCredentialResource.Update {
    private ManagedIdentityCredentialResourceInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public ManagedIdentityCredential properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ManagedIdentityCredentialResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String credentialName;

    private String createIfMatch;

    private String updateIfMatch;

    public ManagedIdentityCredentialResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    public ManagedIdentityCredentialResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentialOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, factoryName, credentialName, this.innerModel(), createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedIdentityCredentialResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentialOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, factoryName, credentialName, this.innerModel(), createIfMatch, context)
                .getValue();
        return this;
    }

    ManagedIdentityCredentialResourceImpl(
        String name, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new ManagedIdentityCredentialResourceInner();
        this.serviceManager = serviceManager;
        this.credentialName = name;
        this.createIfMatch = null;
    }

    public ManagedIdentityCredentialResourceImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public ManagedIdentityCredentialResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentialOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, factoryName, credentialName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedIdentityCredentialResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentialOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, factoryName, credentialName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    ManagedIdentityCredentialResourceImpl(
        ManagedIdentityCredentialResourceInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = Utils.getValueFromIdByName(innerObject.id(), "factories");
        this.credentialName = Utils.getValueFromIdByName(innerObject.id(), "credentials");
    }

    public ManagedIdentityCredentialResource refresh() {
        String localIfNoneMatch = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentialOperations()
                .getWithResponse(resourceGroupName, factoryName, credentialName, localIfNoneMatch, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedIdentityCredentialResource refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCredentialOperations()
                .getWithResponse(resourceGroupName, factoryName, credentialName, localIfNoneMatch, context)
                .getValue();
        return this;
    }

    public ManagedIdentityCredentialResourceImpl withProperties(ManagedIdentityCredential properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ManagedIdentityCredentialResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
