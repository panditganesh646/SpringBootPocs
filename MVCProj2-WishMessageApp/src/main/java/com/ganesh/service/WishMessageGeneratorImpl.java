package com.ganesh.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageGeneratorImpl implements IWishMessage{
	
	@Override
	public String generateMessage() {
		LocalDateTime ldt =  LocalDateTime.now();
		
		int hour  = ldt.getHour();
		if(hour<12) {
			return "Good Morning";
		}
		else if(hour<16) {
			 return "Good Afternoon";
		}
		else if(hour<20) {
			 return "Good Evening";
		}
		else {
			 return "Good Night";
		}
	}
     
}
