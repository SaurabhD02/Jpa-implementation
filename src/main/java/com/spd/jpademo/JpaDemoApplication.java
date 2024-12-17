package com.spd.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JpaDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		
		log.info("Spring boot JPADemoApplication started");
	}

}
