// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthcareapis.fluent.WorkspacesClient;
import com.azure.resourcemanager.healthcareapis.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.healthcareapis.models.Workspace;
import com.azure.resourcemanager.healthcareapis.models.Workspaces;

public final class WorkspacesImpl implements Workspaces {
    private static final ClientLogger LOGGER = new ClientLogger(WorkspacesImpl.class);

    private final WorkspacesClient innerClient;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    public WorkspacesImpl(
        WorkspacesClient innerClient, com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Workspace> list() {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Workspace> list(Context context) {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Workspace> listByResourceGroup(String resourceGroupName) {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Workspace> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<WorkspaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new WorkspaceImpl(inner1, this.manager()));
    }

    public Workspace getByResourceGroup(String resourceGroupName, String workspaceName) {
        WorkspaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, workspaceName);
        if (inner != null) {
            return new WorkspaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Workspace> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<WorkspaceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkspaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String workspaceName) {
        this.serviceClient().delete(resourceGroupName, workspaceName);
    }

    public void delete(String resourceGroupName, String workspaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, context);
    }

    public Workspace getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    public Response<Workspace> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, workspaceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, context);
    }

    private WorkspacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }

    public WorkspaceImpl define(String name) {
        return new WorkspaceImpl(name, this.manager());
    }
}
