package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.entity.TennisCoach;

@Configuration
public class DemoConfig {
	@Bean
	TennisCoach tennisCoach() {
		return new TennisCoach();
	}
	
}
