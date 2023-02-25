package com.service.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class AkashApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkashApplication.class, args);
	}

}
