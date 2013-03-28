package com.DroolSpring;

public class Password{
	
	
	private String password;
	private String errors;
	
	public Password(){
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = this.errors + " " + errors;
	}
	
}