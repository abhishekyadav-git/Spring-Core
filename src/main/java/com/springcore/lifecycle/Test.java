package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//using AbstractApplicationContext, so that it has registerShutdownHook method, which will help call destroy methos
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeCycleConfig.xml");
		Virus v = (Virus)context.getBean("virus");
		Vaccine vac = (Vaccine)context.getBean("vaccine");
		AnnotationBasedLifeCycle ano = (AnnotationBasedLifeCycle)context.getBean("annotationBased");
		System.out.println(v);
		System.out.println(vac);
		System.out.println(ano);
		context.registerShutdownHook();
	}

}
