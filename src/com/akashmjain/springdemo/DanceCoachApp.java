package com.akashmjain.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DanceCoachApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DanceConfig.class);
		
		
		
		// get the bean from spring container
		Coach theCoach = context.getBean("danceCoach", Coach.class);
		
		// call a method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		// destory the context
		context.close();
	}

}
