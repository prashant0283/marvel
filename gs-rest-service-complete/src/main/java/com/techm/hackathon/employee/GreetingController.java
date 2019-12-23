package com.techm.hackathon.employee;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private EmployeeService employeeService;
	
	 @RequestMapping(value="/greeting/{id}",method=RequestMethod.GET)
	public Greeting greeting(@PathVariable String id) {
		return new Greeting(counter.incrementAndGet(),
							String.format(template, id));
	}
}
