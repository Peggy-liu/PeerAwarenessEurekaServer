package com.eureka.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PeerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeerServerApplication.class, args);
	}

}
