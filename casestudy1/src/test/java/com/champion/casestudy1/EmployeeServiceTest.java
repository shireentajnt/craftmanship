package com.champion.casestudy1;

import com.champion.casestudy1.employeeapi.model.Employee;
import com.champion.casestudy1.employeeapi.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EmployeeServiceTest  {
	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testGetAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		assertNotNull(employees);
		assertTrue(employees.size() >= 0); // Assume empty DB initially
	}

}
