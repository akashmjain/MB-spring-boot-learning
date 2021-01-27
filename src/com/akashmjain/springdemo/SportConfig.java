package com.akashmjain.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.akashmjain.springdemo")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
	// injection
	@Bean 
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
		
	}
}
