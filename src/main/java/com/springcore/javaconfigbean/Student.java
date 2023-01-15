package com.springcore.javaconfigbean;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	public void work() {
		System.out.println("Student is working!!");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	@Value("Shivam")
	private String studentName;
	@Value("Ghaziabad")
	private String studentCity;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}

}
