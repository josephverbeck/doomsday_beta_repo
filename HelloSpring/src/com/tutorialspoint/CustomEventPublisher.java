package com.tutorialspoint;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publisher(){
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}
}