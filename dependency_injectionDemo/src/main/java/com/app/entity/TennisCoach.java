package com.app.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TennisCoach implements Coach {
	public TennisCoach() {
		System.out.println("Tennis Coach Constcutor");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Training";
	}

}
