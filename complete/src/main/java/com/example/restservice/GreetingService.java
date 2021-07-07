package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {
    public List<CGEmployee> getEmployeeList(String name){

        List<CGEmployee> cgEmployeeList = new ArrayList<>();
        List<CGEmployee> returnDetailList = new ArrayList<>();
        CGEmployee emp1 = new CGEmployee("sam", "a", "1234561", 2000, "pune", "cg", "ODI", false);
        CGEmployee emp2 = new CGEmployee("sia", "b", "1234562", 3000, "bangalore", "ikea", "Java", true);
        CGEmployee emp3 = new CGEmployee("tia", "c", "1234563", 3000, "kolkata", "ikea", "SOA", true);
        CGEmployee emp4 = new CGEmployee("ram", "d", "1234564", 6000, "pune", "cg", "ODI", false);
        CGEmployee emp5 = new CGEmployee("ria", "e", "1234565", 10000, "pune", "cg", "ODI", false);
        cgEmployeeList.add(emp1);
        cgEmployeeList.add(emp2);
        cgEmployeeList.add(emp3);
        cgEmployeeList.add(emp4);
        cgEmployeeList.add(emp5);
        for (CGEmployee cg: cgEmployeeList){
            if(name.equalsIgnoreCase(cg.getFirstName())){
                returnDetailList.add(cg);
            }
        }
        return returnDetailList;
    }
//    public Map<String, Integer> getSalaryDetail1(List<CGEmployee> cgEmployeeList) {
//        Map<String, Integer> salaryDetail = new HashMap<>();
//        try {
//            salaryDetail.put(cgEmployeeList.get(1).getEmpno(), cgEmployeeList.get(1).getSalary() + 100);
//        }
//        catch(Exception e){
//            System.out.println("we should not try to access elements of an empty list");
//        }
//        return salaryDetail;
//    }

}
