package com.pankaj.spring.applications;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pankaj.spring.interfaces.Coach;

public class CoachApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("cricketCoach", Coach.class);
		coach.giveExercise();
		coach.getFortune();
		coach.getInformation();
		
		coach = context.getBean("basketBallCoach", Coach.class);
		coach.giveExercise();
		coach.getFortune();
		coach.getInformation();
		
		context.close();
	}
}
