package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class MainApp6{
	
	static Logger log = Logger.getLogger(MainApp.class.getName());
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		log.info("Going to create HelloWorld obj");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage1();
		
		log.info("Exiting the Program");
	}
}