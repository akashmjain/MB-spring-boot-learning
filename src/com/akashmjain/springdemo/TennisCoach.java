package com.akashmjain.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Construtor ");
	}
	@PostConstruct
	public void inititate() {
		System.out.println("Inititation ");
	}
	@PreDestroy
	public void destruction() {
		System.out.println("desotroyed");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your volley";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
