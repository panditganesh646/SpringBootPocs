package com.ganesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ganesh.model.Employee;
import com.ganesh.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepo empRepo;
	
	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepo.findAll(Sort.by("job").ascending());
		 
	}
    
	
	
}
