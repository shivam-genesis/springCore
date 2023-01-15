package com.springcore.javaconfigbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJavaBean.class);
		Student student = context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.work();
	}

}