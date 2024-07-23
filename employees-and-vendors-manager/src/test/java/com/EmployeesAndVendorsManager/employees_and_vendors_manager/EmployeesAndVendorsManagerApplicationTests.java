package com.EmployeesAndVendorsManager.employees_and_vendors_manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class EmployeesAndVendorsManagerApplicationTests {

	@Test
	void contextLoads() {
	}

}
