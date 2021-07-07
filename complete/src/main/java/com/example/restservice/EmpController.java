package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping("/emp")
	public List<CGEmployee> createEmployee(@RequestBody CGEmployee employee) {
		List<CGEmployee> employeeList = empService.createEmployeeList(employee);
		return employeeList;
	}
	@GetMapping("/fetchemp")
	public List<CGEmployee> getEmployee() {
		List<CGEmployee> employeeList = empService.getEmployeeList();
		return employeeList;
	}
}


