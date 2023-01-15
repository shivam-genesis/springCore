package com.springcore.javaconfigbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation is used to indicate the java configuration class
public class ConfigJavaBean {

	@Bean // This annotation is used to return the object of class from java configuration
			// class
	public Student getStudent() {
		Student student = new Student();
		return student;
	}

}
