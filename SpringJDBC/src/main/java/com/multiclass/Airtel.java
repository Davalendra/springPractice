package com.multiclass;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Airtel implements Sim{
	//execute without calling this method
	@PostConstruct
	public void init()
	{
		System.out.println("Data Seeding of Airtel");
	}
	
	//it will execute when class was loaded
	public Airtel()
	{
		System.out.println("Airtel obj called");
	}
	@Override
	public void call() {
		System.out.println("Airtel is calling");
		
	}

}
