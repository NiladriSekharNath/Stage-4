package com.cognizant.springemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cognizant.springemployee.controller","com.cognizant.springemployee.service","com.cognizant.springemployee.dao","com.cognizant.springemployee.model"})
public class SpringEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeApplication.class, args);
	}

}
