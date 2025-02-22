// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.ElasticSan;
import com.azure.resourcemanager.elasticsan.models.Sku;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ElasticSansCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"sku\":{\"name\":\"Premium_LRS\",\"tier\":\"Premium\"},\"availabilityZones\":[\"skfc\",\"tq\",\"miekkezzikhlyfjh\",\"gqggebdunygae\"],\"provisioningState\":\"Succeeded\",\"baseSizeTiB\":8623333094540637378,\"extendedCapacitySizeTiB\":7064706580171927315,\"totalVolumeSizeGiB\":6620237582798297782,\"volumeGroupCount\":2223326609364776386,\"totalIops\":6269428665110751573,\"totalMBps\":3059787385770886832,\"totalSizeTiB\":8763898175289325999,\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Invalid\",\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"groupIds\":[\"dmjsjqb\",\"hhyxxrw\",\"yc\",\"duhpk\"]},\"id\":\"gymare\",\"name\":\"n\",\"type\":\"jxqugjhky\"},{\"properties\":{\"provisioningState\":\"Pending\",\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"groupIds\":[\"gssofwq\",\"zqalkrmnjijpx\",\"cqqudf\",\"byxbaaabjy\"]},\"id\":\"yffimrzrtuzqogs\",\"name\":\"xnevfdnwn\",\"type\":\"mewzsyyc\"},{\"properties\":{\"provisioningState\":\"Updating\",\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"groupIds\":[\"bjudpfrxtrthzv\"]},\"id\":\"tdwkqbrq\",\"name\":\"bpaxhexiilivpdt\",\"type\":\"irqtdqoa\"}]},\"location\":\"r\",\"tags\":{\"amxjezwlw\":\"gsquyfxrxxlept\",\"ojknio\":\"wxuqlcvydypatdoo\"},\"id\":\"kooebwnu\",\"name\":\"hemms\",\"type\":\"vdkcrodtj\"}";

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

        ElasticSanManager manager =
            ElasticSanManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ElasticSan response =
            manager
                .elasticSans()
                .define("uipiccjzk")
                .withRegion("mszkkfo")
                .withExistingResourceGroup("kallatmel")
                .withSku(new Sku().withName(SkuName.PREMIUM_LRS).withTier(SkuTier.PREMIUM))
                .withBaseSizeTiB(4211102701501758858L)
                .withExtendedCapacitySizeTiB(3182031582693006981L)
                .withTags(mapOf("jawneaiv", "yfkzik", "elsfeaen", "wczelpci", "dxbjhwuaanozj", "abfatkl"))
                .withAvailabilityZones(Arrays.asList("c"))
                .create();

        Assertions.assertEquals("r", response.location());
        Assertions.assertEquals("gsquyfxrxxlept", response.tags().get("amxjezwlw"));
        Assertions.assertEquals(SkuName.PREMIUM_LRS, response.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.sku().tier());
        Assertions.assertEquals("skfc", response.availabilityZones().get(0));
        Assertions.assertEquals(8623333094540637378L, response.baseSizeTiB());
        Assertions.assertEquals(7064706580171927315L, response.extendedCapacitySizeTiB());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
