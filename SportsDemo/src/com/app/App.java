package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.entity.TennisCoach;

public class App {

	
	public static void main(String []args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		TennisCoach coach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		context.close();
	}
}
