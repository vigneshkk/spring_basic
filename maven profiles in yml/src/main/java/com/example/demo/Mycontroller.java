package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@Value("${mystr}")
	private String mystr;
	@GetMapping("/ello")
	public String hello() {
		return mystr;
	}

}
