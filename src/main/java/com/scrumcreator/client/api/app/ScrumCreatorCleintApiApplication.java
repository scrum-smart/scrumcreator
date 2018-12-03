package com.scrumcreator.client.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.scrumcreator.client.api.controller"})
public class ScrumCreatorCleintApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumCreatorCleintApiApplication.class, args);
	}
	
}
