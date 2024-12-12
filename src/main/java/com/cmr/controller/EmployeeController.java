package com.cmr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    
    @PostMapping("/add")
    public String addEmployee() {
        return "Employee added successfully";
    }

    }
