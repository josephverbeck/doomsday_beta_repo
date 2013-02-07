package com.fibonacci;

public class Fibonacci{
	
	private int sequence;
	private long value;

	public Fibonacci(final int sequence){
		this.sequence = sequence;
		this.value = -1;
	}
	
	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
}