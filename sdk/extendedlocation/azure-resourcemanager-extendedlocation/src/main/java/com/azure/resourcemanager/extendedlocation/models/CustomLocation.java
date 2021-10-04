// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of CustomLocation. */
public interface CustomLocation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the authentication property: This is optional input that contains the authentication that should be used to
     * generate the namespace.
     *
     * @return the authentication value.
     */
    CustomLocationPropertiesAuthentication authentication();

    /**
     * Gets the clusterExtensionIds property: Contains the reference to the add-on that contains charts to deploy CRDs
     * and operators.
     *
     * @return the clusterExtensionIds value.
     */
    List<String> clusterExtensionIds();

    /**
     * Gets the displayName property: Display name for the Custom Locations location.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the hostResourceId property: Connected Cluster or AKS Cluster. The Custom Locations RP will perform a
     * checkAccess API for listAdminCredentials permissions.
     *
     * @return the hostResourceId value.
     */
    String hostResourceId();

    /**
     * Gets the hostType property: Type of host the Custom Locations is referencing (Kubernetes, etc...).
     *
     * @return the hostType value.
     */
    HostType hostType();

    /**
     * Gets the namespace property: Kubernetes namespace that will be created on the specified cluster.
     *
     * @return the namespace value.
     */
    String namespace();

    /**
     * Gets the provisioningState property: Provisioning State for the Custom Location.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationInner object.
     *
     * @return the inner object.
     */
    CustomLocationInner innerModel();

    /** The entirety of the CustomLocation definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The CustomLocation definition stages. */
    interface DefinitionStages {
        /** The first stage of the CustomLocation definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the CustomLocation definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the CustomLocation definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the CustomLocation definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithAuthentication,
                DefinitionStages.WithClusterExtensionIds,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithHostResourceId,
                DefinitionStages.WithHostType,
                DefinitionStages.WithNamespace,
                DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CustomLocation create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomLocation create(Context context);
        }
        /** The stage of the CustomLocation definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the CustomLocation definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the CustomLocation definition allowing to specify authentication. */
        interface WithAuthentication {
            /**
             * Specifies the authentication property: This is optional input that contains the authentication that
             * should be used to generate the namespace..
             *
             * @param authentication This is optional input that contains the authentication that should be used to
             *     generate the namespace.
             * @return the next definition stage.
             */
            WithCreate withAuthentication(CustomLocationPropertiesAuthentication authentication);
        }
        /** The stage of the CustomLocation definition allowing to specify clusterExtensionIds. */
        interface WithClusterExtensionIds {
            /**
             * Specifies the clusterExtensionIds property: Contains the reference to the add-on that contains charts to
             * deploy CRDs and operators..
             *
             * @param clusterExtensionIds Contains the reference to the add-on that contains charts to deploy CRDs and
             *     operators.
             * @return the next definition stage.
             */
            WithCreate withClusterExtensionIds(List<String> clusterExtensionIds);
        }
        /** The stage of the CustomLocation definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Display name for the Custom Locations location..
             *
             * @param displayName Display name for the Custom Locations location.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the CustomLocation definition allowing to specify hostResourceId. */
        interface WithHostResourceId {
            /**
             * Specifies the hostResourceId property: Connected Cluster or AKS Cluster. The Custom Locations RP will
             * perform a checkAccess API for listAdminCredentials permissions..
             *
             * @param hostResourceId Connected Cluster or AKS Cluster. The Custom Locations RP will perform a
             *     checkAccess API for listAdminCredentials permissions.
             * @return the next definition stage.
             */
            WithCreate withHostResourceId(String hostResourceId);
        }
        /** The stage of the CustomLocation definition allowing to specify hostType. */
        interface WithHostType {
            /**
             * Specifies the hostType property: Type of host the Custom Locations is referencing (Kubernetes, etc...)..
             *
             * @param hostType Type of host the Custom Locations is referencing (Kubernetes, etc...).
             * @return the next definition stage.
             */
            WithCreate withHostType(HostType hostType);
        }
        /** The stage of the CustomLocation definition allowing to specify namespace. */
        interface WithNamespace {
            /**
             * Specifies the namespace property: Kubernetes namespace that will be created on the specified cluster..
             *
             * @param namespace Kubernetes namespace that will be created on the specified cluster.
             * @return the next definition stage.
             */
            WithCreate withNamespace(String namespace);
        }
        /** The stage of the CustomLocation definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning State for the Custom Location..
             *
             * @param provisioningState Provisioning State for the Custom Location.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
    }
    /**
     * Begins update for the CustomLocation resource.
     *
     * @return the stage of resource update.
     */
    CustomLocation.Update update();

    /** The template for CustomLocation update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithAuthentication,
            UpdateStages.WithClusterExtensionIds,
            UpdateStages.WithDisplayName,
            UpdateStages.WithHostResourceId,
            UpdateStages.WithHostType,
            UpdateStages.WithNamespace,
            UpdateStages.WithProvisioningState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CustomLocation apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomLocation apply(Context context);
    }
    /** The CustomLocation update stages. */
    interface UpdateStages {
        /** The stage of the CustomLocation update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the CustomLocation update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the CustomLocation update allowing to specify authentication. */
        interface WithAuthentication {
            /**
             * Specifies the authentication property: This is optional input that contains the authentication that
             * should be used to generate the namespace..
             *
             * @param authentication This is optional input that contains the authentication that should be used to
             *     generate the namespace.
             * @return the next definition stage.
             */
            Update withAuthentication(CustomLocationPropertiesAuthentication authentication);
        }
        /** The stage of the CustomLocation update allowing to specify clusterExtensionIds. */
        interface WithClusterExtensionIds {
            /**
             * Specifies the clusterExtensionIds property: Contains the reference to the add-on that contains charts to
             * deploy CRDs and operators..
             *
             * @param clusterExtensionIds Contains the reference to the add-on that contains charts to deploy CRDs and
             *     operators.
             * @return the next definition stage.
             */
            Update withClusterExtensionIds(List<String> clusterExtensionIds);
        }
        /** The stage of the CustomLocation update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Display name for the Custom Locations location..
             *
             * @param displayName Display name for the Custom Locations location.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the CustomLocation update allowing to specify hostResourceId. */
        interface WithHostResourceId {
            /**
             * Specifies the hostResourceId property: Connected Cluster or AKS Cluster. The Custom Locations RP will
             * perform a checkAccess API for listAdminCredentials permissions..
             *
             * @param hostResourceId Connected Cluster or AKS Cluster. The Custom Locations RP will perform a
             *     checkAccess API for listAdminCredentials permissions.
             * @return the next definition stage.
             */
            Update withHostResourceId(String hostResourceId);
        }
        /** The stage of the CustomLocation update allowing to specify hostType. */
        interface WithHostType {
            /**
             * Specifies the hostType property: Type of host the Custom Locations is referencing (Kubernetes, etc...)..
             *
             * @param hostType Type of host the Custom Locations is referencing (Kubernetes, etc...).
             * @return the next definition stage.
             */
            Update withHostType(HostType hostType);
        }
        /** The stage of the CustomLocation update allowing to specify namespace. */
        interface WithNamespace {
            /**
             * Specifies the namespace property: Kubernetes namespace that will be created on the specified cluster..
             *
             * @param namespace Kubernetes namespace that will be created on the specified cluster.
             * @return the next definition stage.
             */
            Update withNamespace(String namespace);
        }
        /** The stage of the CustomLocation update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning State for the Custom Location..
             *
             * @param provisioningState Provisioning State for the Custom Location.
             * @return the next definition stage.
             */
            Update withProvisioningState(String provisioningState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CustomLocation refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomLocation refresh(Context context);
}