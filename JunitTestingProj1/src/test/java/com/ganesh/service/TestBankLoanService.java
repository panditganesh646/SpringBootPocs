package com.ganesh.service;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestBankLoanService {
	private static BankLoanService service;
	
	@BeforeAll
	public static void setUpOne() {
		 service  = new BankLoanService();
	}
	
	/*
	@BeforeEach
	public void setUp() {
		System.out.println("TestBankLoanService.setUp()");
		  service = new BankLoanService();
	}*/
	
	@Test
	public void calcSimpleInterestAmountWithSmallNumbers() {
	   
	    float actual = service.calcSimpleInterestAmount(100000, 2, 12);
	    float expected = 24000.0f; 
	    Assertions.assertEquals(expected, actual, 0.001);
	}
	@Test
	public void calcSimpleInterestAmountWithBigNumbers() {
	  
	    float actual = service.calcSimpleInterestAmount(10000000, 2, 12);
	    float expected = 2400000.0f;

	    Assertions.assertEquals(expected, actual, 0.001, "values not matching");
	}

	@Test
	public void calcSimpleInterestAmountWithInvalidInputs() {

	    Assertions.assertThrows(
	        IllegalArgumentException.class,
	        () -> service.calcSimpleInterestAmount(0, 0, 0),
	        "Exception not thrown for invalid inputs"
	    );
	}
	
	/*
	@Test
	public void calcSimpleInterestAmountWithTimer() {
	    BankLoanService service = new BankLoanService();
	    Assertions.assertTimeout(Duration.ofMillis(20000),()->{
	    	   service.calcSimpleInterestAmount(10000000, 2, 12);
	    });
	}
	*/
	
	@Test
	public void calcSimpleInterestAmountForNoException() {
	    Assertions.assertDoesNotThrow(() -> {
	        service.calcSimpleInterestAmount(100000, 2, 12);
	    });
	}
	
	/*
	@AfterEach
	public  void clear() {
		 System.out.println("TestBankLoanService.clear()");
		 service = null;
	}*/
	
	@AfterAll
	public static void clearOnce() {
		 System.out.println("TestBankLoanService.clear()");
		 service = null;
	}
	   
}
	    
	    
	    
	    
	    	 
