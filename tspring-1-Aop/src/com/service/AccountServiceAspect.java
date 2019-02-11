package com.service;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspect {
	
	public void validateCard(JoinPoint joinpoint) {
       System.out.println("Before Method: "+joinpoint.getSignature().getName()+" of Class: "+joinpoint.getTarget().getClass().getSimpleName());
	}	
	
	public void validateCard1(JoinPoint joinpoint) {
		  System.out.println("Before Method: "+joinpoint.getSignature().getName()+" of Class: "+joinpoint.getTarget().getClass().getSimpleName());
		}	
}
