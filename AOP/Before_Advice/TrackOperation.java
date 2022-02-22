package com.pratik.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	// @Pointcut("execution(* Operation.m*(..))") // applied noly for the methods starting with 'm'
	@Pointcut("execution(* Operation.msg*(..))")
	public void pc() { }  // Pointcut name
	
	@Before("pc()")
	public void beforeAdvice(JoinPoint jp)
	{
		System.out.println("BEFORE ADVICE EXECUTED....");
	}
	
}
