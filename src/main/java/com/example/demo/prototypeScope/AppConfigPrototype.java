package com.example.demo.prototypeScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Employee;


@Configuration
public class AppConfigPrototype {

	@Bean("employeeService")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)		
	public Employee getEmployee() {
		return new Employee();
	}
}
