package com.springcore.ref;

public class ParentCompany {
	private String name;
	private String country;
	private ChildCompany cobj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ChildCompany getCobj() {
		return cobj;
	}
	public void setCobj(ChildCompany cobj) {
		this.cobj = cobj;
	}
	public ParentCompany(String name, ChildCompany cobj) {
		super();
		this.name = name;
		this.cobj = cobj;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public ParentCompany() {
		super();
	}
	@Override
	public String toString() {
		return "ParentCompany [name=" + name + ", cobj=" + cobj + "]";
	}
	
}
