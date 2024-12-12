package com.cmr.service;

import com.cmr.Repository.EmployeeRepository;
import com.cmr.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Autowired
    //crete add Employee method for Employee entity
    public void addEmployee(Employee employee) {
        // Implement logic to save employee to the database
        employeeRepository.save(employee);
    }
}
