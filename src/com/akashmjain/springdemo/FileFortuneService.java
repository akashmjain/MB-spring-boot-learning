package com.akashmjain.springdemo;

import java.io.File;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	private String fortune = "";
	
	@PostConstruct
	public void readFile() {
		File file = new File("/Users/akashjain/eclipse-workspace/spring-demo-annotations/src/fortune.txt");
		try {
		
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				fortune += sc.nextLine();
			}
			sc.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune;
	}

}
