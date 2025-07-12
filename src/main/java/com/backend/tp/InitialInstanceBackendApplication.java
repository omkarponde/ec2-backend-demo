package com.backend.tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class InitialInstanceBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(InitialInstanceBackendApplication.class, args);
	}
}