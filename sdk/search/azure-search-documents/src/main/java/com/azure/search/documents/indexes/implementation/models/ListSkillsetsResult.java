// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.search.documents.indexes.models.SearchIndexerSkillset;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response from a list skillset request. If successful, it includes the full definitions of all skillsets. */
@Immutable
public final class ListSkillsetsResult {
    /*
     * The skillsets defined in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchIndexerSkillset> skillsets;

    /**
     * Creates an instance of ListSkillsetsResult class.
     *
     * @param skillsets the skillsets value to set.
     */
    @JsonCreator
    public ListSkillsetsResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchIndexerSkillset> skillsets) {
        this.skillsets = skillsets;
    }

    /**
     * Get the skillsets property: The skillsets defined in the Search service.
     *
     * @return the skillsets value.
     */
    public List<SearchIndexerSkillset> getSkillsets() {
        return this.skillsets;
    }
}
