package com.jwlim.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayStudyApplication.class, args);
	}

}
