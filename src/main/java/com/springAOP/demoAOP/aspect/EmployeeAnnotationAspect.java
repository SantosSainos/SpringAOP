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
public class EmployeeAnnotationAspect {
	
	@Before("@annotation(com.springAOP.demoAOP.aspect.Loggable)")
	public void myAdvice() {
		System.out.println("Executing myAdvice!!");
	}
}
