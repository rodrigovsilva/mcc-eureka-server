package com.rvfs.challenge.mcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MccEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MccEurekaServerApplication.class, args);
	}
}
