// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Backup;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CreateModeForUpdate;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MaintenanceWindow;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Storage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServerPropertiesForUpdate model. */
@Fluent
public final class ServerPropertiesForUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerPropertiesForUpdate.class);

    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * Storage properties of a server.
     */
    @JsonProperty(value = "storage")
    private Storage storage;

    /*
     * Backup properties of a server.
     */
    @JsonProperty(value = "backup")
    private Backup backup;

    /*
     * High availability properties of a server.
     */
    @JsonProperty(value = "highAvailability")
    private HighAvailability highAvailability;

    /*
     * Maintenance window properties of a server.
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /*
     * The mode to update a new PostgreSQL server.
     */
    @JsonProperty(value = "createMode")
    private CreateModeForUpdate createMode;

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the storage property: Storage properties of a server.
     *
     * @return the storage value.
     */
    public Storage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage properties of a server.
     *
     * @param storage the storage value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the backup property: Backup properties of a server.
     *
     * @return the backup value.
     */
    public Backup backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup properties of a server.
     *
     * @param backup the backup value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get the highAvailability property: High availability properties of a server.
     *
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.highAvailability;
    }

    /**
     * Set the highAvailability property: High availability properties of a server.
     *
     * @param highAvailability the highAvailability value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withHighAvailability(HighAvailability highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the createMode property: The mode to update a new PostgreSQL server.
     *
     * @return the createMode value.
     */
    public CreateModeForUpdate createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to update a new PostgreSQL server.
     *
     * @param createMode the createMode value to set.
     * @return the ServerPropertiesForUpdate object itself.
     */
    public ServerPropertiesForUpdate withCreateMode(CreateModeForUpdate createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() != null) {
            storage().validate();
        }
        if (backup() != null) {
            backup().validate();
        }
        if (highAvailability() != null) {
            highAvailability().validate();
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
    }
}