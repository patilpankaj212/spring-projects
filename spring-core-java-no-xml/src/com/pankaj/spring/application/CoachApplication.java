package com.pankaj.spring.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pankaj.spring.config.AppConfig;
import com.pankaj.spring.interfaces.Coach;

public class CoachApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Coach coach = context.getBean("basketBall", Coach.class);
		coach.giveTask();
		coach.giveFortune();
		coach.getInformation();
		
		coach = context.getBean("cricket", Coach.class);
		coach.giveTask();
		coach.giveFortune();
		coach.getInformation();
		
		context.close();
	}
}
