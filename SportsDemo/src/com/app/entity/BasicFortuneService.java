package com.app.entity;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class BasicFortuneService implements FortuneService{
	
	public BasicFortuneService()
	{
		System.out.println("In default of basicFortuneService");
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "today is not your day ";
	}

}
