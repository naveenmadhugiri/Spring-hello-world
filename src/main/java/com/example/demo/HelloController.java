package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() throws UnknownHostException {
		return "Greetings from Spring Boot! Jump into Action...!! Server IP -> " + InetAddress.getLocalHost().getHostAddress();
	}

}