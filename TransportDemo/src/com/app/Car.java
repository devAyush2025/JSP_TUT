package com.app;

import org.springframework.stereotype.Component;

//@Component
public class Car implements Vehicle{

	
	public Car()
	{
		System.out.println("Car Constructor");
	}
	
	
	@Override
	public String start() {
		return "car started";
		// TODO Auto-generated method stub
		
	}
	

}
