package com.pratik.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterAdvice_Demo {

	@Pointcut("execution(* Employee.*(..))")
	public void pc() {}  // point cut name;
	
	@After("pc()")
	public void afterDemo(JoinPoint jp)
	{
		System.out.println("AfterAdvice method executed....");
	}
}
