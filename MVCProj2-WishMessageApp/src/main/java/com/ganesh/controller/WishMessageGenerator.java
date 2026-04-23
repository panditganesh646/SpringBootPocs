package com.ganesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ganesh.service.IWishMessage;

@Controller
public class WishMessageGenerator {
    @Autowired
    public  IWishMessage service;
    
    @RequestMapping("/")
     public String showHome() {
    	  return "home";
     }
    @RequestMapping("/wish")
	public ModelAndView generateMessage() {
		  
    	String result = service.generateMessage();
    	
		/*
		 * ModelAndView mav = new ModelAndView(); mav.addObject("wMsg",result);
		 * mav.setViewName("display");
		 */
    	//return mav;
    	
    	return new ModelAndView("display","wMsg",result);
	}
}
