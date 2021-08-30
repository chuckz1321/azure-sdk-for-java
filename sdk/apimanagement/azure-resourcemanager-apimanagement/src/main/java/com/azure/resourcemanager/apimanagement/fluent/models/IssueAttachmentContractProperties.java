// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Issue Attachment contract Properties. */
@Fluent
public final class IssueAttachmentContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IssueAttachmentContractProperties.class);

    /*
     * Filename by which the binary data will be saved.
     */
    @JsonProperty(value = "title", required = true)
    private String title;

    /*
     * Either 'link' if content is provided via an HTTP link or the MIME type
     * of the Base64-encoded binary data provided in the 'content' property.
     */
    @JsonProperty(value = "contentFormat", required = true)
    private String contentFormat;

    /*
     * An HTTP link or Base64-encoded binary data.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /**
     * Get the title property: Filename by which the binary data will be saved.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Filename by which the binary data will be saved.
     *
     * @param title the title value to set.
     * @return the IssueAttachmentContractProperties object itself.
     */
    public IssueAttachmentContractProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the contentFormat property: Either 'link' if content is provided via an HTTP link or the MIME type of the
     * Base64-encoded binary data provided in the 'content' property.
     *
     * @return the contentFormat value.
     */
    public String contentFormat() {
        return this.contentFormat;
    }

    /**
     * Set the contentFormat property: Either 'link' if content is provided via an HTTP link or the MIME type of the
     * Base64-encoded binary data provided in the 'content' property.
     *
     * @param contentFormat the contentFormat value to set.
     * @return the IssueAttachmentContractProperties object itself.
     */
    public IssueAttachmentContractProperties withContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }

    /**
     * Get the content property: An HTTP link or Base64-encoded binary data.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: An HTTP link or Base64-encoded binary data.
     *
     * @param content the content value to set.
     * @return the IssueAttachmentContractProperties object itself.
     */
    public IssueAttachmentContractProperties withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (title() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property title in model IssueAttachmentContractProperties"));
        }
        if (contentFormat() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contentFormat in model IssueAttachmentContractProperties"));
        }
        if (content() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property content in model IssueAttachmentContractProperties"));
        }
    }
}