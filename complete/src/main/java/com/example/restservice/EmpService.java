package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {
    List<CGEmployee> cgEmployeeList = new ArrayList<>();
    public List<CGEmployee> getEmployeeList(){
        return cgEmployeeList;
    }
    public List<CGEmployee> createEmployeeList(CGEmployee employee){
        cgEmployeeList.add(employee);
        return cgEmployeeList;
    }
}
