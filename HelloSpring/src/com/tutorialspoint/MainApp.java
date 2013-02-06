package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp{
	public static void main(String[] args){
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("HelloWorldBean.xml");
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.setMessage("I'm object A");
//		obj.getMessage();
//		
//		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//		objB.getMessage();
//		obj.getMessage();
		
//		context.registerShutdownHook();
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		
		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
		context.registerShutdownHook();
	}
}