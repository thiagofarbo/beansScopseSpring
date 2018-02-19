package com.example.demo.prototypeScope;

import java.util.Random;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.gson.Gson;
import com.example.demo.model.Employee;

public class MainPrototype {

	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigPrototype.class);

		 Employee employee = context.getBean("employeeService", Employee.class);
		 
		 employee.setId(generateId());
		 employee.setName("Employee1");
		 employee.setPhoneNumber("0000000");
		 
		 Gson gson = new Gson();
		 String jsonEmployee1 = gson.toJson(employee);
		 System.out.println(jsonEmployee1);
		 
		 
		 Employee employee2 = context.getBean("employeeService", Employee.class);
		 String jsonEmployee2 = gson.toJson(employee2);
	     System.out.println(jsonEmployee2);
	     
	     context.close();
	}
	
	public static long generateId() {
		
		 long [] randomIds = new long[999999];
		 
		 Random rn = new Random();
		 
		 long randomInt = 0;
		
		 for (int i = 0; i < randomIds.length; i++) {
	       
	         randomInt = rn.nextInt(999999) + 1;
	     }
		 
		return randomInt;
	 }
}
