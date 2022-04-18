package com.learn.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/assignment/config.xml");
		University uni = (University) ctx.getBean("uni");
		System.out.println(uni.toString());
	 
	}

}
