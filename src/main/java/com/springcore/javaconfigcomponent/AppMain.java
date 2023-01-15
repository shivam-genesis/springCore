package com.springcore.javaconfigcomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJavaComponent.class);

		Student student = (Student) context.getBean("student");
		System.out.println(student);
		student.study();
	}

}