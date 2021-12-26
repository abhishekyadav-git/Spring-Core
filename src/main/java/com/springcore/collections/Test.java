package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsConfig.xml");
		Employee emp1 = (Employee)context.getBean("emp");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhoneNumbers());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
	}

}
