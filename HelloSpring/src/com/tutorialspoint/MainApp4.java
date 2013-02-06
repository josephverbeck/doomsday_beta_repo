package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp4 {
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans4.xml");
		
		context.start();
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage1();
		
		context.stop();
	}
}