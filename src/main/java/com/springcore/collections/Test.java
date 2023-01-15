package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");

		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getPhoneNumber());
		System.out.println(employee1.getEmpAddress());
		System.out.println(employee1.getCourses());
		System.out.println(employee1.getProp());
		System.out.println(employee1.getBObject());
		System.out.println(employee1);
	}
}
