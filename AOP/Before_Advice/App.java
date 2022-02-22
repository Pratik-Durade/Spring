package com.pratik.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Operation op=(Operation) ac.getBean(Operation.class);
		System.out.println("APP CONFIG CLASS\n\n");
		op.msg();
		op.m();
		op.k();
	}
}
