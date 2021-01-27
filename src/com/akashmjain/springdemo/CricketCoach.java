package com.akashmjain.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println(">> Inside cricket coach");
	}
	
	
	@Autowired
	public CricketCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	/*
	@Autowired
	public void anyFunckyName(Coach coach, FortuneService service) {
		System.out.println(coach.getDailyWorkout() + service.getFortune());
	} */
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "do bowling practice";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
