package com.techm.hackathon.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
}
