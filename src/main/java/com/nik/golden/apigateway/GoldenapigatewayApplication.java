package com.nik.golden.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableDiscoveryClient
@CrossOrigin("http://localhost:3000/")
public class GoldenapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldenapigatewayApplication.class, args);
	}

}
