package com.EmployeesAndVendorsManager.employees_and_vendors_manager.service;

import com.EmployeesAndVendorsManager.employees_and_vendors_manager.model.Vendor;
import com.EmployeesAndVendorsManager.employees_and_vendors_manager.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
