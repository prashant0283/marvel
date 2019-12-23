package com.techm.hackathon.employee;

import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeService {
	
	public Employee getEmployee (String empId) {
		
		return new Employee("Krishna Kumar", "12345", "emailId@techm.com", "PojectX", "Gopal Kumar", "IBU1",
				"1234","1234567890");
	}
}
