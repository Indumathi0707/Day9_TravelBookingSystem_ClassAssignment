package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TravelBookingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TravelBookingService bookingService = ac.getBean(TravelBookingService.class);
		
		bookingService.bookTravel("flight", "Bangalore");
		bookingService.bookTravel("train", "Jaipur");
		
	}

}
