package com.regExpress;

import java.io.File;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class Main{
	
	public static void main(String[] aregs){
		KnowledgeBase knowledgebase = createKnowledgeBase();
		StatefulKnowledgeSession session = knowledgebase.newStatefulKnowledgeSession();
		
		Password password = new Password("P@sword2FX!");
		password.setRegExpression(".*[0-9].*[0-9].*");
		
		session.insert(password);
		session.fireAllRules();
		
		password = new Password("p@s1word2fx!");
		password.setRegExpression(".*[A-Z].*[A-Z].*");
		
		session.insert(password);
		session.fireAllRules();
		
	}
	
	
	private static KnowledgeBase createKnowledgeBase() {
		KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		File accountRules = new File("/Users/joey/git/doomsday_beta_repo/DroolsTest/src/com/regExpress/rulePassRegExpression.drl");
		
		builder.add(ResourceFactory.newFileResource(accountRules), ResourceType.DRL);
		
		if(builder.hasErrors())
			throw new RuntimeException(builder.getErrors().toString());
		
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
		knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());
		return knowledgeBase;
	}
}