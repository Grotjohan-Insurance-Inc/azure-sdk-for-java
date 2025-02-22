// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMapping;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReplicationNetworkMappingsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"state\":\"ciagvkdlhu\",\"primaryNetworkFriendlyName\":\"klbjoafmjfe\",\"primaryNetworkId\":\"lvoepknarse\",\"primaryFabricFriendlyName\":\"ncsqoacbuqd\",\"recoveryNetworkFriendlyName\":\"apleq\",\"recoveryNetworkId\":\"kxen\",\"recoveryFabricArmId\":\"z\",\"recoveryFabricFriendlyName\":\"vya\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}},\"location\":\"z\",\"id\":\"uuvu\",\"name\":\"aqcwggchxvlqgf\",\"type\":\"rvecica\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SiteRecoveryManager manager =
            SiteRecoveryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkMapping response =
            manager
                .replicationNetworkMappings()
                .getWithResponse(
                    "jbvyezjwjkqo",
                    "bwh",
                    "ieyozvrcwfpucwnb",
                    "gqefgzjvbxqcb",
                    "oarx",
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("ciagvkdlhu", response.properties().state());
        Assertions.assertEquals("klbjoafmjfe", response.properties().primaryNetworkFriendlyName());
        Assertions.assertEquals("lvoepknarse", response.properties().primaryNetworkId());
        Assertions.assertEquals("ncsqoacbuqd", response.properties().primaryFabricFriendlyName());
        Assertions.assertEquals("apleq", response.properties().recoveryNetworkFriendlyName());
        Assertions.assertEquals("kxen", response.properties().recoveryNetworkId());
        Assertions.assertEquals("z", response.properties().recoveryFabricArmId());
        Assertions.assertEquals("vya", response.properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("z", response.location());
    }
}
