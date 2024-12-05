package com.app;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("Cricket coach Constructor");
	}

@PostConstruct
public void initCode() {
	System.out.println("Performing Custom init"+getClass().getSimpleName());
}

@PreDestroy
public void cleanUpCode() {
	
	System.out.println("Performing cleanup code "+getClass().getSimpleName());
	
}
	


	
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Batting";
	}
}