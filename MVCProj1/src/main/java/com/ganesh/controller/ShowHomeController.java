package com.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	

     @RequestMapping("/")
    public String showHomePage() {
        return "home";
    }
     
//     @GetMapping("/")
//     public String home() {
//         return "<h1 style='color:green;text-align:center'>Hello Ganesh! Spring Boot is working 🚀</h1>";
//     }
     
     
     
}
