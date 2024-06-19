package com.learn.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initialzr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author falvojr
 */
@EnableFeignClients
@SpringBootApplication
public class LabDesignPatternSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDesignPatternSpringApplication.class, args);
	}

}
