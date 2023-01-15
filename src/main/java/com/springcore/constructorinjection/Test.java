package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorinjection/ciConfig.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
	}
 
}
