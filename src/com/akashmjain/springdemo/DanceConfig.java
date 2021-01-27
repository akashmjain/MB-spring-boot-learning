package com.akashmjain.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanceConfig {
	@Bean
	public Coach danceCoach() {
		return new DanceCoach(danceFortuneService());
	}
	
	
	// injection
	@Bean 
	public FortuneService danceFortuneService() {
		return new DanceFortuneService();
		
	}

}
