package com.ganesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ganesh.model.Employee;
import com.ganesh.service.IEmployeeMgmtService;

@Controller
public class EmployeeController {
   
	@Autowired
	private IEmployeeMgmtService service;
	
	@GetMapping("/")
	public String showHomePage() {
		 return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object> map) {
		Iterable<Employee> empsList = service.getAllEmployees();
		
		map.put("empsList", empsList);
		
		return "employee_report";
	}
}
