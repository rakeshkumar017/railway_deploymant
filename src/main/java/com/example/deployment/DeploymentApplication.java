package com.example.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeploymentApplication {

	public static void main(String[] args) {
		System.out.println("abc");
		SpringApplication.run(DeploymentApplication.class, args);
	}

}
