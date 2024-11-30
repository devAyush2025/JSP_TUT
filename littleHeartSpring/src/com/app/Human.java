package com.app;

public class Human {
	Heart heart;
	
	public Human() {
		System.out.println("Human has taken birth");
	}
	
	
	public void setHeart(Heart heart) {
	System.out.println("Inside the heart Setter (heart is generating)");
		this.heart = heart;
	}
	
	public void pumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("You are dead bro");
		}
	}
	
	
	
	
}
