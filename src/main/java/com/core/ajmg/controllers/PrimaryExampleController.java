package com.core.ajmg.controllers;

import com.core.ajmg.services.PrimaryExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/primaryExample")
public class PrimaryExampleController {

    @Autowired
    private PrimaryExampleService primaryExampleService;

    @GetMapping(value = "/primary")
    public void primaryExample(){
        primaryExampleService.navega();
    }
}
