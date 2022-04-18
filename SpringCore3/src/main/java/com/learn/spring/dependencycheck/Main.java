package com.learn.spring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/dependencycheck/config.xml");
		Prescription patient = (Prescription) ctx.getBean("pat");
		System.out.println(patient.toString());


	}
}
