package com.app.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class FootballCoach implements Coach {

	public FootballCoach() {
		System.out.println("Football coach Constructor");
	}
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Football workout";
	}
	
	
	
}
