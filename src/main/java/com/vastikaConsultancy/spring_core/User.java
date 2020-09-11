package com.vastikaConsultancy.spring_core;

public class User {
	String name;
	String mobile;
	Address address;


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public void display(){
	System.out.println("Display spring-core java   "+getName());
	System.out.println("mobile "+getMobile());
	System.out.println("Country "+getAddress().getContry());
	System.out.println("state "+getAddress().getState());
	
		
	}

	
	}
