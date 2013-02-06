package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
		
	}
}