package com.EmployeesAndVendorsManager.employees_and_vendors_manager.controller;


import com.EmployeesAndVendorsManager.employees_and_vendors_manager.model.Vendor;
import com.EmployeesAndVendorsManager.employees_and_vendors_manager.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
@CrossOrigin(origins = "http://localhost:3000")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public void sendEmailToVendors(@RequestBody List<Vendor> vendors) {
        for (Vendor vendor : vendors) {
            String subject = "Payment Notification";
            String body = "Sending payments to vendor " + vendor.getName() + " at upi " + vendor.getUpi();
            emailService.sendEmail(vendor.getEmail(), subject, body);
        }
    }
}
