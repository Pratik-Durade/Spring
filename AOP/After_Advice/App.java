package com.pratik.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig1.class);
		
		Employee e=ac.getBean(Employee.class);
		
		e.demo();
		System.out.println("\n");
		e.show();
	}
}
