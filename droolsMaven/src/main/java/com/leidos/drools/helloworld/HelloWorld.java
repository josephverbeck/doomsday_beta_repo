package com.leidos.drools.helloworld;

import org.kie.api.runtime.KieSession;

import com.leidos.drools.KieSessionUtil;

public class HelloWorld{
	public static final void main(String[] args){
		
		KieSession kSession = new KieSessionUtil().createSession("HelloWorldKS");
		
		kSession.insert(Message.HELLO);
		kSession.fireAllRules();
		
		kSession.insert(Message.GOODBYE);
		kSession.fireAllRules();
		
		kSession.dispose();
		
	}
}