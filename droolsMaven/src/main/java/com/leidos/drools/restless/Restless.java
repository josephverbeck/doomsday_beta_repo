package com.leidos.drools.restless;

import java.util.Scanner;

import org.drools.compiler.kproject.ReleaseIdImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.leidos.drools.helloworld.Message;

public class Restless{
	
	/*
	 * http://stackoverflow.com/questions/25129499/integrating-drool-6-work-bench-with-java-application/25192223#25192223
	 */
	
	public static void main(String[] args){
		
		otherTry();
		
	}
	
	public static void otherTry(){
		
		/*
		 * Project(drools-6.1.0.Final.jar) is included in the resource folder
		 * The project needs to be loaded into the kie-wb.
		*/
		
		//Location/name of project in maven repository. 
		ReleaseIdImpl releaseId = new ReleaseIdImpl("org.drools", "drools", "6.1.0.Final");
		KieServices ks = KieServices.Factory.get();
		
		//Gets container for specific project and loads it into drools.
		KieContainer kContainer = ks.newKieContainer(releaseId);
		
		//Scans repository for any updates to the project.
		KieScanner kScanner = ks.newKieScanner(kContainer);
		kScanner.start(10000);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			runRule(kContainer);
			System.out.println("Press Enter to continue");
			scanner.nextLine();
		}
		
	}
	
	private static void runRule(KieContainer kContainer) {
		KieSession kSession = kContainer.newKieSession();
		kSession.insert(Message.HELLO);
		kSession.fireAllRules();
		
		kSession.insert(Message.GOODBYE);
		kSession.fireAllRules();
		
	}
}