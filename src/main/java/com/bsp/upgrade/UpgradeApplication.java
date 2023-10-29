package com.bsp.upgrade;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class UpgradeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UpgradeApplication.class, args);
	}

	@Bean
	public ObjectMapper getObjectMapper() {

		return new ObjectMapper();

	}


}
