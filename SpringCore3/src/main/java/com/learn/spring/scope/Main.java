package com.learn.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/scope/config.xml");
		Employee emp1=(Employee) ctx.getBean("emp");
		Employee emp2=(Employee) ctx.getBean("emp");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
}
