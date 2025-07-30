package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {

	
	//We not need to use this AppConfig if we use @Components
//	@Bean
//	public FlightBooking flightBooking() {
//		return new FlightBooking();
//	}
//	
//	@Bean
//	public TrainBooking trainBooking() {
//		return new TrainBooking();
//	}
//	
//	@Bean
//	public TravelBookingService travelBookingService() {
//		return new TravelBookingService(flightBooking(), trainBooking());
//	}
}
