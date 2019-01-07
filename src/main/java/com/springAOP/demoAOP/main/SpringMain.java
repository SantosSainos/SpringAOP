package com.springAOP.demoAOP.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAOP.demoAOP.service.EmployeeService;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

public class SpringMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Sainos");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}
}
