package com.example.ordering;

public class Customer {
	private String name;
	private long contact;
	private String preferredCuisine;
	
	public Customer(String name, long contact, String cuisine) {
		this.name = name;
		this.contact = contact;
		this.preferredCuisine = cuisine;
	}

	public String getName() {
		return name;
	}

	public long getContact() {
		return contact;
	}

	public String getCuisine() {
		return preferredCuisine;
	}
}
