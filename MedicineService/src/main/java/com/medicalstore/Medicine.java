package com.medicalstore;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
//to register in Eureka client
@EnableDiscoveryClient
//service to service communication
@EnableFeignClients
public class Medicine {

	public static void main(String[] args) {
		SpringApplication.run(Medicine.class, args);
		
	}

}
