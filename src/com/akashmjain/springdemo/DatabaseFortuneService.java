package com.akashmjain.springdemo;

import org.springframework.stereotype.Controller;

@Controller
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "db connected";
	}

}
