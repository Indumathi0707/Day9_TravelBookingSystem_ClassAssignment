package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FlightBooking {

	public void book(String destination) {
		System.out.println("Flight Booked to -> "+destination);
	}
}
