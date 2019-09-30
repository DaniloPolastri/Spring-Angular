package com.algaworks.comercial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.algaworks.comercial.controller"})
public class ComercialApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApiApplication.class, args);
	}

}
