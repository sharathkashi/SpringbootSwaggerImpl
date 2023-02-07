package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.Servers;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API's", version = "1.0", description = "Swagger Implimentation project"))
public class SpringbootSwaggerImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerImplApplication.class, args);
	}
	
	/**
	 * Swagger Url - http://localhost:8888/swagger-ui/index.html
	 */

}
