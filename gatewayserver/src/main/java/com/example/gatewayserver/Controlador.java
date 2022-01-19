package com.example.gatewayserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controlador {

@GetMapping(path="/helloMicro")
	
	public String helloMicro() {
		
		return "Hello Micro";
	}
}
