package com.astar.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RentWiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentWiseApplication.class, args);
	}

}
