package com.example.micro2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controlador {

@GetMapping(path="/helloMicro")
	
	public String helloMicro() {
		
		return "Hello Micro 2";
	}
}
