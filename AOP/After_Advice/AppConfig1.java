package com.pratik.after;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
	
	@Bean
	public Employee getEmployee()
	{
	
		return new Employee();
	}
	@Bean
	public AfterAdvice_Demo getAfterAdvice_Demo()
	{
		
		return new AfterAdvice_Demo();
	}
	@Bean
	public AnnotationAwareAspectJAutoProxyCreator getAnnotationAwareAspectJAutoProxyCreator()
	{
		return new AnnotationAwareAspectJAutoProxyCreator();
	}
}	
