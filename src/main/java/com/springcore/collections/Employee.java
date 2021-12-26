package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
		private String name;
		private List<Integer> phoneNumbers;
		private Set<String> addresses;
		private Map<String,String> courses;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Integer> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(List<Integer> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
		public Set<String> getAddresses() {
			return addresses;
		}
		public void setAddresses(Set<String> addresses) {
			this.addresses = addresses;
		}
		public Map<String, String> getCourses() {
			return courses;
		}
		public void setCourses(Map<String, String> courses) {
			this.courses = courses;
		}
		public Employee(String name, List<Integer> phoneNumbers, Set<String> addresses, Map<String, String> courses) {
			super();
			this.name = name;
			this.phoneNumbers = phoneNumbers;
			this.addresses = addresses;
			this.courses = courses;
		}
		public Employee() {
			super();
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", phoneNumbers=" + phoneNumbers + ", addresses=" + addresses + ", courses=" + courses
					+ "]";
		}
		
		
		


}
