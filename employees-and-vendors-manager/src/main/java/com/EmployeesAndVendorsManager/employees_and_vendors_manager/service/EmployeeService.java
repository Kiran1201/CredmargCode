package com.EmployeesAndVendorsManager.employees_and_vendors_manager.service;

import com.EmployeesAndVendorsManager.employees_and_vendors_manager.model.Employee;
import com.EmployeesAndVendorsManager.employees_and_vendors_manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
