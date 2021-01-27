package com.akashmjain.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
	
		
	
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
