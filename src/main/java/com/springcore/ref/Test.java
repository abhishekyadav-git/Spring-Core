package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		ParentCompany pc = (ParentCompany)context.getBean("parent");
		System.out.println("Parent company name = "+pc.getName() +"\n" +  "Country = " +pc.getCountry());
		System.out.println("Child company name = "+pc.getCobj().getName() +"\n" +  "Country = " +pc.getCobj().getCountry());
		

	}

}
