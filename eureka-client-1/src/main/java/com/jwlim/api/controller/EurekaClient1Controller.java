package com.jwlim.api.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping(value="/eureka_client1")
public class EurekaClient1Controller {
	@Autowired
	Environment environment;
	
	@CircuitBreaker(name = "fallbackcustom", fallbackMethod = "fallbackcustomFallback")
	
    @GetMapping
    public String getOrganization() throws Exception {
    	String port = environment.getProperty("local.server.port");
    	
        if(new Random().nextInt(10) <= 7) {
            throw new RuntimeException("failed");
        }
    	
        return "hi i'm a eureka client1 port :::"+port;
    }

	@SuppressWarnings("unused")
	private String fallbackcustomFallback(Throwable t) {
        return "fallback invoked! exception type : " + t.getClass();
    }
}