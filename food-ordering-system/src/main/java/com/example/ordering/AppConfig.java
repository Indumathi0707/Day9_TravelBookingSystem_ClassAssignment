package com.example.ordering;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Customer customer() {
		return new Customer("Indu", 1234567890, "Dosa");
	}
	
	@Bean
	public Restaurent restuarent() {
		return new Restaurent("Veg hotel", "Kurnool", Arrays.asList("Dosa", "Idli", "Upma"));
	}
	
	@Bean
	public FoodOrderService foodOrderService() {
		return new FoodOrderService(customer(), restuarent());
	}
}
