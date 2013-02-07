package com.fibonacci;

import java.io.File;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class Main{
	
	public static void main(String[] args){
		KnowledgeBase knowledgebase = createKnowledgeBase();
		StatefulKnowledgeSession session = knowledgebase.newStatefulKnowledgeSession();
		
		session.insert(new Fibonacci( 10 ));
		session.fireAllRules();
		
	}
	
	private static KnowledgeBase createKnowledgeBase() {
		KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		File accountRules = new File("/Users/joey/Desktop/workspace2/DroolsTest/src/com/fibonacci/ruleFibonacci.drl");
		
		builder.add(ResourceFactory.newFileResource(accountRules), ResourceType.DRL);
		
		if(builder.hasErrors())
			throw new RuntimeException(builder.getErrors().toString());
		
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
		knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());
		return knowledgeBase;
	}
	
}