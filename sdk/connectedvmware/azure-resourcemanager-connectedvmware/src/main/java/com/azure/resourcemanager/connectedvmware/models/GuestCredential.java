// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Username / Password Credentials to connect to guest. */
@Fluent
public final class GuestCredential {
    /*
     * Gets or sets username to connect with the guest.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Gets or sets the password to connect with the guest.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: Gets or sets username to connect with the guest.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Gets or sets username to connect with the guest.
     *
     * @param username the username value to set.
     * @return the GuestCredential object itself.
     */
    public GuestCredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Gets or sets the password to connect with the guest.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Gets or sets the password to connect with the guest.
     *
     * @param password the password value to set.
     * @return the GuestCredential object itself.
     */
    public GuestCredential withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
