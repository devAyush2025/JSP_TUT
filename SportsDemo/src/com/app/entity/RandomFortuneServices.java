package com.app.entity;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class RandomFortuneServices  implements FortuneService{

	public RandomFortuneServices()
	{
		System.out.println("In defualt RandomFortuneServices");
	}
	
	
	
	@Override
	public String getFortuneService() {
		return "Today is your lucky day";
	}

}
