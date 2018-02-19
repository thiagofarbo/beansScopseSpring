package com.example.demo.singletonScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Product;



@Configuration
public class AppConfig {

	@Bean("productService")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)		
	public Product getProduct() {
		return new Product();
	}
}
