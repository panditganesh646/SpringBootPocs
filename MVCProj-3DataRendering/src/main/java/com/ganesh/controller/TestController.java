package com.ganesh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ganesh.model.Employee;

@Controller
public class TestController {
       
	    
	@GetMapping("/")
	public String displayPage(Map<String,Object> map) {
		/*
		map.put("name","Ganesh");
		map.put("age",23);
		map.put("addr","sillod");
		 return "display";
		 */
		/*
		String nicknames[] = new String[] {"bunny","chinny","chakuli","bhaiya"};
		Set<Long> mobilePhonesSet = new HashSet<Long>();
		mobilePhonesSet.add(889999L);
		mobilePhonesSet.add(8888888L);
		mobilePhonesSet.add(77777L);
		mobilePhonesSet.add(6666666l);
		mobilePhonesSet.add(555555L);
		
		List<String> coursesList = List.of("java","spring","springBoot","hibernate");
		Map<String,Long> idsMap = Map.of("Aadhar",384384L,
				                          "VoterId",84737L,
				                           "panNo",57473L);
		//Create model object
		map.put("nicknames",nicknames);
		map.put("mobilePhoneSet",mobilePhonesSet);
		map.put("courseList",coursesList);
		map.put("idMap", idsMap);
				                           
		*/
		/*
		List<Employee> empList =List.of(new Employee(101,"Rajesh","clerk",90000.0),
				                        new Employee(102,"Ganesh","Developer",190000.0),
				                         new Employee(103,"Sagar","Teacher",200000.0));
		map.put("empInfo", empList);
		*/
		Employee empInfo = new Employee(105,"Avinash","Student",4546.00);
		map.put("empInfo", empInfo);
		
		return "display";
	}
}
