package com.regExpress;

public class Password{
	
	private String regExpression;
	private String password;
	private String errors;
	
	public Password(){
		
	}
	
	public Password(String password){
		this.password = password;
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
		this.errors = errors;
	}

	public String getRegExpression() {
		return regExpression;
	}

	public void setRegExpression(String regExpression) {
		this.regExpression = regExpression;
	}
	
}