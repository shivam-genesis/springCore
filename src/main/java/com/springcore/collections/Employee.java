package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> phoneNumber;
	private Set<String> empAddress;
	private Map<String, Integer> courses;
	private Properties prop;
	private int x;
	private B bObject;

	public Employee(String empName, List<String> phoneNumber, Set<String> empAddress, Map<String, Integer> courses,
			Properties prop, int x, B object) {
		super();
		this.empName = empName;
		this.phoneNumber = phoneNumber;
		this.empAddress = empAddress;
		this.courses = courses;
		this.prop = prop;
		this.x = x;
		this.bObject = bObject;
	}

	public Employee() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<String> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getBObject() {
		return bObject;
	}

	public void setBObject(B bObject) {
		this.bObject = bObject;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phoneNumber=" + phoneNumber + ", empAddress=" + empAddress
				+ ", courses=" + courses + ", prop=" + prop + ", x=" + x + ", bObject=" + bObject + "]";
	}
}
