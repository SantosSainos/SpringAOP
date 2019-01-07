package com.springAOP.demoAOP.model;

import com.springAOP.demoAOP.aspect.Loggable;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

public class Employee {
	private String name;

	public String getName() {
		return name;
	}
	
	@Loggable
	public void setName(String name) {
		this.name = name;
	}
	
	public void throwException() {
		throw new RuntimeException("Dummy Exception!!!");
	}

}
