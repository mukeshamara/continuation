package com.model;

public class Account {
	private String accNumber;
	private String description;
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Account(String accNumber, String description) {
		super();
		this.accNumber = accNumber;
		this.description = description;
	}
	public Account() {
		super();
	}
}
