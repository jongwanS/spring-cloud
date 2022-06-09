package com.jwlim.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/eureka_client2")
public class EurekaClient2Controller {

	
    @GetMapping
    public String getOrganization() {
        return "hi i'm a eureka client2";
    }

}