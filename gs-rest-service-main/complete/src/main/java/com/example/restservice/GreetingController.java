package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public CGEmployee greeting(@RequestParam(value = "name", defaultValue = "Neha") String name) {
		CGEmployee emp1 = new CGEmployee("tom", "b", "1234567", 2000, "pune", "cg", "ODI", true);
		return emp1;
	}


}
