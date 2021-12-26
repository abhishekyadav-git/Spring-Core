package com.springcore.constructorinjection;

public class Certificate {
	private String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
