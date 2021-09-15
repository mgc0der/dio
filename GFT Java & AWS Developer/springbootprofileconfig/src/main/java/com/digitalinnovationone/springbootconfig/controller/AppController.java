package com.digitalinnovationone.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA")
    private String dbEnviromentVariable;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/env")
    public String getDbEnviromentVariable() {
        return "The fallowing variable was passed: " + dbEnviromentVariable;
    }
}
