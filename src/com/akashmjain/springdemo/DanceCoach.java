package com.akashmjain.springdemo;

public class DanceCoach implements Coach {

	private FortuneService danceFortuneService;
	
	
	
	
	public DanceCoach(FortuneService danceFortuneService) {
		super();
		this.danceFortuneService = danceFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Dance with your heart";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
