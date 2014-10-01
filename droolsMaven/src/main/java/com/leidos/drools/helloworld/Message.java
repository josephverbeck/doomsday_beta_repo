package com.leidos.drools.helloworld;

	
	public enum Message{
		HELLO(0) {
			@Override
			public void printMessage() {
				System.out.println("Hello World " + this.getValue());
			}
		}, 
		GOODBYE(1) {
			@Override
			public void printMessage() {
				System.out.println("Goodbye World " + this.getValue());
			}
		};
		
		private int value;
		
		Message(int value){
			this.setValue(value);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public abstract void printMessage();
	}
