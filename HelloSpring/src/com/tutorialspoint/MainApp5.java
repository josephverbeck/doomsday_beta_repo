package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp5 {
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
		
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publisher();
		cvp.publisher();
	}
}