package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;

	@GetMapping("/greeting")
	public List<CGEmployee> greeting(@RequestParam(value = "name", defaultValue = "neha") String name) {
		List<CGEmployee> employeeList = greetingService.getEmployeeList(name);
		return employeeList;
	}
}


