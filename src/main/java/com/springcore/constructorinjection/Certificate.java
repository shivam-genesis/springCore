package com.springcore.constructorinjection;

public class Certificate {
	private String name;

	Certificate(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
	
	
}
