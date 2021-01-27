package com.akashmjain.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] randomFortune = {
			"fortune 1",
			"fortune 2",
			"fortune 3"
	};
	Random random = new Random();
	 
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = random.nextInt(randomFortune.length);
		return randomFortune[index];
	}

}
