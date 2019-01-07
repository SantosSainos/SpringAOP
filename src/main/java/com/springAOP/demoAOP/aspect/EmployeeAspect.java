package com.springAOP.demoAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

@Aspect
public class EmployeeAspect {
	
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.springAOP.demoAOP.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("Service method getter called");
	}
}
