package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vaccine implements InitializingBean,DisposableBean{ //using interfaces instead if init and destroy
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vaccine [name=" + name + "]";
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Vaccine Init");
		
	}
	public void destroy() throws Exception {
		System.out.println("Inside Vaccine destroy");
	}

	
	
}
