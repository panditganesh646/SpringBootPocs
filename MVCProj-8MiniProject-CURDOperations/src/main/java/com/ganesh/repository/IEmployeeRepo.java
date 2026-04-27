package com.ganesh.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ganesh.model.Employee;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee,Integer>{

}
