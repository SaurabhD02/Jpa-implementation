package com.spd.jpademo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<?> homeMethod(){
		return new ResponseEntity<>("If you are viewing this , the Application is up and running !", HttpStatus.OK);
	}

}
