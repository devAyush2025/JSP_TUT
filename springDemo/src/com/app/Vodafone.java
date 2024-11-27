package com.app;

public class Vodafone implements Sim{

	
	public Vodafone() {
		System.out.println("Vodafone constructor");
	}
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling from using Vodafone Sim");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from using Vodafone sim");
	}
	
}
