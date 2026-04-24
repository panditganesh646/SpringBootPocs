package com.ganesh.model;

import lombok.Data;

@Data
public class Employee {
     private int eno=1547;
     private String ename="Ganesh";
     private String eadd="Pune";
     private float salary=9000.0f;
     
     public Employee() {
    	 System.out.println("Employee:: 0-Param Constructor");
     }
     
}
