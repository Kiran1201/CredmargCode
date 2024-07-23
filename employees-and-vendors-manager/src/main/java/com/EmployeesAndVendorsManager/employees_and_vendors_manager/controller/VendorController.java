package com.EmployeesAndVendorsManager.employees_and_vendors_manager.controller;


import com.EmployeesAndVendorsManager.employees_and_vendors_manager.model.Vendor;
import com.EmployeesAndVendorsManager.employees_and_vendors_manager.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendors")
@CrossOrigin(origins = "http://localhost:3000")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping("/")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.saveVendor(vendor);
    }

    @GetMapping("/")
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }
}
