package com.springAOP.demoAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @version 1.0
 */

@Aspect
public class EmployeeAroundAspect {
	
	@Around("execution(* com.springAOP.demoAOP.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Before invoking getName() method");
		
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("After involing getName() method. Return value = " + value);
		
		return value;
	}
}
