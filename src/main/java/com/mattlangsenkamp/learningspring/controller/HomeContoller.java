package com.mattlangsenkamp.learningspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mattlangsenkamp.config.ContentCalendarProperties;

@RestController
public class HomeContoller {

    private final ContentCalendarProperties properties;

    public HomeContoller(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties hello() {
        return properties;
    }

}
