package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private int personId;
	private String personName;
	private Certificate c;
	private List<String> phoneNumbers;

	Person(int personId, String personName, Certificate c, List<String> phoneNumbers) {
		this.personId = personId;
		this.personName = personName;
		this.c = c;
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", c=" + c + ", phoneNumbers="
				+ phoneNumbers + "]";
	}

}
