package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;



@SpringBootApplication
@Configuration
public class HotelManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementServiceApplication.class, args);
	}
	
	@Bean
	public OpenAPI openApi() {
		Info info=new Info().description("Full stack").title("abcd").version("V1");
		return new OpenAPI().info(info);
	}

}
