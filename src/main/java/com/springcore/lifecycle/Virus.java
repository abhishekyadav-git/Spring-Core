package com.springcore.lifecycle;

public class Virus {
	private String virusName;
	private String variant;
	public String getVirusName() {
		return virusName;
	}
	public void setVirusName(String virusName) {
		this.virusName = virusName;
		System.out.println("Inside Setter");
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
	public Virus(String virusName, String variant) {
		super();
		this.virusName = virusName;
		this.variant = variant;
	}
	public Virus() {
		super();
	}
	@Override
	public String toString() {
		return "Virus [virusName=" + virusName + ", variant=" + variant + "]";
	}
	
	public void init() { // name can be anything ,syntax should be same,before init setter is called
		System.out.println("Third Wave Inevitable");
	}
	
	public void destroy() { 
		System.out.println("Take Vaccine, Follow Distancing , wear n95 masks, help destroy virus");
	}
}
