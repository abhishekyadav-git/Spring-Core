package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationBasedLifeCycle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnnotationBasedLifeCycle [name=" + name + "]";
	}
	
	@PostConstruct  //Both annotation are deprecated from Java 9 , use dependency along with annotations to use it
	public void start() {
		System.out.println("Inside PostConstruct init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside PreDestroy init");
	}
}
