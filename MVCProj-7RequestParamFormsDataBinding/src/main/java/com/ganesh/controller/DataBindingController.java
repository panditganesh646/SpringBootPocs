package com.ganesh.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {
    /*
	@GetMapping("/data")
	public String dataBind(Map<String,Object> map, @RequestParam("sno") int no,@RequestParam("sname")String name) {
		
		System.out.println(no+" "+name);
		
		return "show_data";
	}
	  */
	
	
	/*
	
	@GetMapping("/data")
	public String dataBind(Map<String,Object> map, @RequestParam int sno,@RequestParam String sname) {
		
		System.out.println(sno+" "+sname);
		
		return "show_data";
	}
	*/
	
	/*
	@GetMapping("/data")
	public String dataBind(Map<String,Object> map, @RequestParam int sno,@RequestParam(required = false) String sname) {
		                                                                               //default value is true
		System.out.println(sno+" "+sname);
		
		return "show_data";
	}
	
	*/
	
	
	/*
	@GetMapping("/data")
	public String dataBind(Map<String,Object> map, @RequestParam(defaultValue = "100",required = false) int sno,@RequestParam(defaultValue = "Ganesh") String sname) {
		                                                                              
		System.out.println(sno+" "+sname);
		
		return "show_data";
	}
	
	*/
	/*
	@GetMapping("/data")
	public String dataBind(Map<String,Object> map, @RequestParam Integer sno,@RequestParam(defaultValue = "Ganesh") String sname) {
		                                                                              
		System.out.println(sno+" "+sname);
		
		return "show_data";
	}
	*/
	
	
	@GetMapping("/data")
	public String dataBind(Map<String,Object> map, @RequestParam(required=false) Integer sno,
			                                       @RequestParam String[] sname,
			                                       @RequestParam("sname") List<String> names) {
		                                                                              
		System.out.println(sno+" "+Arrays.toString(sname)+" "+names);
		
		
		return "show_data";
	}
	
	
	
	
	
	
	
	
}
