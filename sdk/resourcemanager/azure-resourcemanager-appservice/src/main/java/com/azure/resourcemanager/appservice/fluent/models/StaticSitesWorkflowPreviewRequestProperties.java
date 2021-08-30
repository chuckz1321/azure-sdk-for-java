// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.StaticSiteBuildProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StaticSitesWorkflowPreviewRequest resource specific properties. */
@Fluent
public final class StaticSitesWorkflowPreviewRequestProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSitesWorkflowPreviewRequestProperties.class);

    /*
     * URL for the repository of the static site.
     */
    @JsonProperty(value = "repositoryUrl")
    private String repositoryUrl;

    /*
     * The target branch in the repository.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /*
     * Build properties to configure on the repository.
     */
    @JsonProperty(value = "buildProperties")
    private StaticSiteBuildProperties buildProperties;

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     *
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     *
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSitesWorkflowPreviewRequestProperties object itself.
     */
    public StaticSitesWorkflowPreviewRequestProperties withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The target branch in the repository.
     *
     * @param branch the branch value to set.
     * @return the StaticSitesWorkflowPreviewRequestProperties object itself.
     */
    public StaticSitesWorkflowPreviewRequestProperties withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     *
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.buildProperties;
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     *
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSitesWorkflowPreviewRequestProperties object itself.
     */
    public StaticSitesWorkflowPreviewRequestProperties withBuildProperties(StaticSiteBuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (buildProperties() != null) {
            buildProperties().validate();
        }
    }
}