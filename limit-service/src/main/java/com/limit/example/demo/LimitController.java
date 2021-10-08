package com.limit.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@GetMapping("/limits")
	public LimitConfiguration getLimitConfig() {
		
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
	@Autowired
	private Configuration configuration; 
}
