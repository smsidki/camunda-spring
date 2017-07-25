package com.me.camunda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.me.camunda.validator.NumberValidator;
import com.me.camunda.validator.StringValidator;

@Configuration
public class ValidatorBean {
	
	@Bean
	public StringValidator stringValidator() {
		return new StringValidator();
	}
	
	@Bean
	public NumberValidator numberValidator() {
		return new NumberValidator();
	}
	
}
