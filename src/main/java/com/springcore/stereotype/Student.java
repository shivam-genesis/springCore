package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // This annotation is used to create a Bean of a class.
@Scope("prototype") // It gives different object of same class every time, By default it is
					// "Singleton" which gives same object every time.
public class Student {
	@Value("Shivam") // This annotation is used to insert the value of variables in that particular
						// Bean.
	private String studentName;
	@Value("Ghaziabad")
	private String studentAddress;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}

}
