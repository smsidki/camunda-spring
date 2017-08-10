package com.me.camunda.enumeration;

public enum User {
	
	KOPET("Kopet Kelelep"),
	AYAM("Ayam Ngesot"),
	KUCENG("Kuceng Bertelur");
	
	private String user;
	
	private User(String user) {
		this.user = user;
	}
	
	public String get() {
		return user;
	}

}
