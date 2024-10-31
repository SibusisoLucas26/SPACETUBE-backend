package com.tube.spacetube;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * tubespace_service
 */
@Service
public class tubespace_service {

    @Value("${youtube.api.key}")
    public String apiKey;

    @Value("${youtube.api.url}")
    public String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public String searchVideos(String query) {
        String url =
            apiUrl + "/search?part=snippet&q=" + query + "&key=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }
}
