package com.EmployeesAndVendorsManager.employees_and_vendors_manager.repository;

import com.EmployeesAndVendorsManager.employees_and_vendors_manager.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
