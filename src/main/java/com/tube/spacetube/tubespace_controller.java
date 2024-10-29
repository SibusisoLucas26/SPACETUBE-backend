package com.tube.spacetube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * tubespace_controller
 */
@RestController
public class tubespace_controller {

    private tubespace_service tube_service;

    public tubespace_controller(tubespace_service tube_service) {
        this.tube_service = tube_service;
    }

    @GetMapping("/videos")
    public String search(@RequestParam String query) {
        return tube_service.searchVideos(query);
    }

}
