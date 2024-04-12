package com.medicalStore;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
//to register in eureka client
@EnableDiscoveryClient
//service to service communication
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "com.medicalStore")
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}

}
