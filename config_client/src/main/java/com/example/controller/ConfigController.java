package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${some.property:Default Value}")
    private String someProperty;

    @GetMapping("/property")
    public String getProperty() {
        return "Configured Value: " + someProperty;
    }
}

