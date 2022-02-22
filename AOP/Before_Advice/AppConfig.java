package com.pratik.before;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Operation getOperation()
	{
		return new Operation();
	}
	
	@Bean
	public TrackOperation getTrackOperation()
	{
		return new TrackOperation();
	}
	
	@Bean
	public AnnotationAwareAspectJAutoProxyCreator getAnnotationAwareAspectJAutoProxyCreator()
	{
		return new AnnotationAwareAspectJAutoProxyCreator();
	}

}
