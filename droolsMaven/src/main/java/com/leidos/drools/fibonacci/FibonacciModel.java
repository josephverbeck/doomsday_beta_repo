package com.leidos.drools.fibonacci;

public class FibonacciModel{
	
	private int sequence;
	private long value;
	
	public FibonacciModel(final int sequence){
		this.setSequence(sequence);
		this.setValue(-1);
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
}