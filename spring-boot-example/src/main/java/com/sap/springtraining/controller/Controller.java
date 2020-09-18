package com.sap.springtraining.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sap.springtraining.entity.Employee;

@RestController
public class Controller {
	@GetMapping("/{name}")
	public String sayHello(@PathVariable("name") String username) {
		return "Hello" + username;
	}
	
	@GetMapping("/employee")
	@ResponseBody
	public Employee getEmployee() {
		return new Employee("Madhu", "Sahu", "Sudan" , 39);
		
	}
	
	
}
