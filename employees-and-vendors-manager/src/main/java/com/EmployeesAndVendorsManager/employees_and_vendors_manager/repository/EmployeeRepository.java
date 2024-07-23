package com.EmployeesAndVendorsManager.employees_and_vendors_manager.repository;

import com.EmployeesAndVendorsManager.employees_and_vendors_manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
