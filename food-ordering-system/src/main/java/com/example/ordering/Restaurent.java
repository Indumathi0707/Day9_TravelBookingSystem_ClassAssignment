package com.example.ordering;

import java.util.List;

public class Restaurent {
	private String name;
	private String location;
	private List<String> availableCuisine;
	
	public Restaurent(String name, String location, List<String> availableCuisine) {
		this.name = name;
		this.location = location;
		this.availableCuisine = availableCuisine;
	}
	

	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public List<String> getAvailableCuisine() {
		return availableCuisine;
	}

}
