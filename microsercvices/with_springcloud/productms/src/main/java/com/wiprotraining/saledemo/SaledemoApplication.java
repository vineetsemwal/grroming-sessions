package com.wiprotraining.saledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SaledemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaledemoApplication.class, args);
	}

}
