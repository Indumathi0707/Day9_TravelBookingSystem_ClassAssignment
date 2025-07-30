package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TrainBooking {

	public void book(String destination) {
		System.out.println("Train Booked to -> "+destination);
	}
}
