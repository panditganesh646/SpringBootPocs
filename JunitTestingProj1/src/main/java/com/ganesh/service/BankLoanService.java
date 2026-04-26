package com.ganesh.service;

public class BankLoanService {
       public float calcSimpleInterestAmount(float pAmt,float rate,float time) {
    	   System.out.println("BankLoanService.calcSimpleInterestAmount(-,-,-)"); 
    	  if(pAmt<=0 || rate<=0 || time<=0) {
    		   throw new IllegalArgumentException();
    	  }
    	   return pAmt*rate*time/100;
       }
} 
