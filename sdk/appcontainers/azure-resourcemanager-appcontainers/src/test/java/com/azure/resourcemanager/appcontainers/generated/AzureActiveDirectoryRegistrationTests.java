// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AzureActiveDirectoryRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureActiveDirectoryRegistrationTests {
    @Test
    public void testDeserialize() {
        AzureActiveDirectoryRegistration model =
            BinaryData
                .fromString(
                    "{\"openIdIssuer\":\"ddgmb\",\"clientId\":\"ex\",\"clientSecretSettingName\":\"bhtqqrolfpfpsa\",\"clientSecretCertificateThumbprint\":\"bquxigjy\",\"clientSecretCertificateSubjectAlternativeName\":\"zjaoyfhrtxil\",\"clientSecretCertificateIssuer\":\"rkujy\"}")
                .toObject(AzureActiveDirectoryRegistration.class);
        Assertions.assertEquals("ddgmb", model.openIdIssuer());
        Assertions.assertEquals("ex", model.clientId());
        Assertions.assertEquals("bhtqqrolfpfpsa", model.clientSecretSettingName());
        Assertions.assertEquals("bquxigjy", model.clientSecretCertificateThumbprint());
        Assertions.assertEquals("zjaoyfhrtxil", model.clientSecretCertificateSubjectAlternativeName());
        Assertions.assertEquals("rkujy", model.clientSecretCertificateIssuer());
    }

    @Test
    public void testSerialize() {
        AzureActiveDirectoryRegistration model =
            new AzureActiveDirectoryRegistration()
                .withOpenIdIssuer("ddgmb")
                .withClientId("ex")
                .withClientSecretSettingName("bhtqqrolfpfpsa")
                .withClientSecretCertificateThumbprint("bquxigjy")
                .withClientSecretCertificateSubjectAlternativeName("zjaoyfhrtxil")
                .withClientSecretCertificateIssuer("rkujy");
        model = BinaryData.fromObject(model).toObject(AzureActiveDirectoryRegistration.class);
        Assertions.assertEquals("ddgmb", model.openIdIssuer());
        Assertions.assertEquals("ex", model.clientId());
        Assertions.assertEquals("bhtqqrolfpfpsa", model.clientSecretSettingName());
        Assertions.assertEquals("bquxigjy", model.clientSecretCertificateThumbprint());
        Assertions.assertEquals("zjaoyfhrtxil", model.clientSecretCertificateSubjectAlternativeName());
        Assertions.assertEquals("rkujy", model.clientSecretCertificateIssuer());
    }
}
