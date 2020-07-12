package com.pankaj.springdemo.applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pankaj.springdemo.interfaces.coach.Coach;

public class CoachApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("basketballCoach", Coach.class);
		coach.giveExercise();
		coach.getFortune();
		coach.coachDetails();
		
		coach = context.getBean("cricketCoach", Coach.class);
		coach.giveExercise();
		coach.getFortune();
		coach.coachDetails();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
