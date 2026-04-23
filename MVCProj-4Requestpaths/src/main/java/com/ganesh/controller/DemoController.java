package com.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
      /*
	    @RequestMapping(value = "/report",method= RequestMethod.GET)
	    public String showHomePage() {
	    	 return "home";
	    }
	   */
	
	    /*
	    @RequestMapping(value={"/home","/ganesh"})
	    public String showHomePage1() {
	    	 return "home";
	    }
	    */
	
	     @GetMapping("/report")
	    public String showHomePage() {
	    	  return "show";
	    }
	
	
	
	
	
	
	
	
	    
}
