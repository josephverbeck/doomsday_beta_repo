package com.leidos.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KieSessionUtil{
	
	private static KieServices kServices;
	private static KieContainer kContainer;
	
	public KieSessionUtil(){
		kServices = KieServices.Factory.get();
		kContainer = kServices.getKieClasspathContainer();
	}
		
	public KieSession createSession(String name){
		return kContainer.newKieSession(name);
	}
	
}