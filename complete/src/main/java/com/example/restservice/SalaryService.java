package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalaryService {
    public Map<String, Integer> getSalary(String name){

        List<CGEmployee> cgEmployeeList1 = new ArrayList<>();
        Map<String,Integer> mapSalary = new HashMap<>();
        CGEmployee emp1 = new CGEmployee("sam", "a", "1234561", 2000, "pune", "cg", "ODI", false);
        CGEmployee emp2 = new CGEmployee("sia", "b", "1234562", 3000, "bangalore", "ikea", "Java", true);
        CGEmployee emp3 = new CGEmployee("tia", "c", "1234563", 3000, "kolkata", "ikea", "SOA", true);
        CGEmployee emp4 = new CGEmployee("ram", "d", "1234564", 6000, "pune", "cg", "ODI", false);
        CGEmployee emp5 = new CGEmployee("ria", "e", "1234565", 10000, "pune", "cg", "ODI", false);
        cgEmployeeList1.add(emp1);
        cgEmployeeList1.add(emp2);
        cgEmployeeList1.add(emp3);
        cgEmployeeList1.add(emp4);
        cgEmployeeList1.add(emp5);
        for (CGEmployee cg: cgEmployeeList1){
            if(name.equalsIgnoreCase(cg.getFirstName())){
                mapSalary.put(name,cg.getSalary());
            }
        }
        return mapSalary;
    }
}
