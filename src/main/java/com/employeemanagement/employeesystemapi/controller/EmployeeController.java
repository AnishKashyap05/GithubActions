package com.employeemanagement.employeesystemapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public class EmployeeController {
    @GetMapping("/employees")
    public String getEmployees(){
        return "Hello Github actions";
    }
}
