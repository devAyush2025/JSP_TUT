package com.app.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("basicFortuneService")
	FortuneService fortuneService;
	
	
	public TennisCoach()
	{
		System.out.println("In Defualt TennisCoach");
	}
	
	@Autowired
	@Qualifier("basicFortuneService")
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	

	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	
	
	@PostConstruct
	
	public void startupCode()
	{
		System.out.println("In startupcode"+fortuneService.getClass().getSimpleName());
	}
	
	@PreDestroy
	public void cleanupcode()
	{
		System.out.println("In cleanupcode"+fortuneService.getClass().getSimpleName());
	}
	


	@Override
	public String getDailyWorkout() {
		
		return "kaam karo";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Your Fortune="+fortuneService.getFortuneService();
	}

	

	
	
	
}
