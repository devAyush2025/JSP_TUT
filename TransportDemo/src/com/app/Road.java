package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Road {
	
	Vehicle vehicle;
	
	public Road()
	{
		System.out.println("Road Constructor");
	}
	
	@Autowired
	@Qualifier("airplane")
	public void SetVehicle(Vehicle vehicle)
	{
		System.out.println("setter of vehicle");
		this.vehicle=vehicle;
	}
	
	public String toString()
	{
		return "Road[vehicle="+vehicle+"]";
	}
	
	public void callStart()
	{
		System.out.println(vehicle.start());
	}
	

}
