package com.springAOP.demoAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

@Aspect
public class EmployeeAfterAspect {
	
	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running After Advice. String argument passed = " + name);
	}
	
	@After("com.springAOP.demoAOP.model.Employee")
	public void logExceptions(JoinPoint joinPoint) {
		System.out.println("Exception throw in Employee Method = " + joinPoint.toLongString());
	}
	
	@AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
	public void getNameReturningAdvice(String returnString) {
		System.out.println("getNameReturningAdvice executed. Returned String = " + returnString);
	}
}
