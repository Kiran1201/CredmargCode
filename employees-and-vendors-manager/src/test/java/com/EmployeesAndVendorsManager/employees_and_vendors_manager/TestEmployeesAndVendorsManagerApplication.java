package com.EmployeesAndVendorsManager.employees_and_vendors_manager;

import org.springframework.boot.SpringApplication;

public class TestEmployeesAndVendorsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(EmployeesAndVendorsManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
