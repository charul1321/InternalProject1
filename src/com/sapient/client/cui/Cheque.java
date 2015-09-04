package com.sapient.client.cui;

public class Check extends Payment implements Authorization{
	Object name;
	Object bankID;
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public Object getBankID() {
		return bankID;
	}
	public void setBankID(Object bankID) {
		this.bankID = bankID;
	}
	
	public void authorized() {
		// TODO Auto-generated method stub
		
	}
	

}
