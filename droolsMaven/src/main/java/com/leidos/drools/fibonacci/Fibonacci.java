package com.leidos.drools.fibonacci;

import org.kie.api.runtime.KieSession;

import com.leidos.drools.KieSessionUtil;

public class Fibonacci{
	
	public static void main(String[] args){
		KieSession kSession = new KieSessionUtil().createSession("FibonacciKS");
		
		kSession.insert(new FibonacciModel(10));
		kSession.fireAllRules();
		
		kSession.dispose();
		
	}
	
}