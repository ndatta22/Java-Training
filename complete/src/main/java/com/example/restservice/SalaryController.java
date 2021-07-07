package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    GreetingService salaryService;

    @GetMapping("/salary")
    public List<CGEmployee> salary(@RequestParam(value = "name", defaultValue = "neha") String name) {
        List<CGEmployee> employeeList = salaryService.getSalary(name);
        return employeeList;
    }
}


