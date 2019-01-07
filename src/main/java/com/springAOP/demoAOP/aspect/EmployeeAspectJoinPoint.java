package com.springAOP.demoAOP.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

@Aspect
public class EmployeeAspectJoinPoint {
	
	@Before("execution(public void com.springAOP.demoAOP.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Before running loggingAdvice on method = " + joinPoint.toLongString());
		
		System.out.println("Arguments Passed = " + Arrays.toString(joinPoint.getArgs()));
	}
	
//	Advice arguments, will de applied to bean methods with single String argument
	
	@Before("args(name)")
	public void logStringArguments(String name) {
		System.out.println("String argument passed = " + name);
	}
}
