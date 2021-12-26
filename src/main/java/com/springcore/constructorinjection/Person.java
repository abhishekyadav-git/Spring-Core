package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String name;
	private String designation;
	private Certificate cert;
	private List<String> skills;
	
	public Person(String name, String designation, Certificate cert, List<String> skills) {
		super();
		this.name = name;
		this.designation = designation;
		this.cert = cert;
		this.skills = skills;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", designation=" + designation + ", cert=" + cert.getName() + ", skills=" + skills + "]";
	}
	
	
	
}
