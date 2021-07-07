package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @GetMapping("/salary")
    public Map<String, Integer> salary(@RequestParam(value = "name", defaultValue = "neha") String name) {
        Map<String, Integer> employeeList = salaryService.getSalary(name);
        return employeeList;
    }
}


