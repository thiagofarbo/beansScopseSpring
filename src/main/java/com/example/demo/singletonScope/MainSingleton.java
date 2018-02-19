package com.example.demo.singletonScope;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.model.Product;

import com.google.gson.Gson;

public class MainSingleton {

	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		 Product product1 = context.getBean("productService", Product.class);
		 
		 product1.setProductId(generateProductId());
		 product1.setProductName("Phone 6");
		 product1.setProductPrice(new BigDecimal("1850.00"));
		 product1.setProductDescription(" Iphone 6 display with a resolution of 1334 x 750. The pixel count is 326 ppi");
		 
		 Gson gson = new Gson();
		 String jsonProduct1 = gson.toJson(product1);
		 System.out.println(jsonProduct1);
		 
		 
		 Product product2 = context.getBean("productService", Product.class);
		 String jsonProduct2 = gson.toJson(product2);
	     System.out.println(jsonProduct2);
	     
	     
	     context.close();
	}
	
	public static long generateProductId() {
		
		 long [] randomIds = new long[999999];
		 
		 Random rn = new Random();
		 
		 long randomInt = 0;
		
		 for (int i = 0; i < randomIds.length; i++) {
	       
	         randomInt = rn.nextInt(999999) + 1;
	     }
		 
		return randomInt;
	 }
}
	
	
