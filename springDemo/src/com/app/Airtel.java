package com.app;

public class Airtel implements Sim {
	
public Airtel() {
	
	System.out.println("Airtel  constructor");
}
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling from using Airtel Sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from using Airtel sim");
	}
}
