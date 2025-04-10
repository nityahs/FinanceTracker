package com.example.config_client.config_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

