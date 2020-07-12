package com.pankaj.spring.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.Coach;
import com.pankaj.spring.interfaces.FortuneService;

@Component
public class CricketCoach implements Coach {

	@Value("Ruksad Mia")
	private String name;
	
	@Value("ruksad@mia.com")
	private String email;
	
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void giveExercise() {
		System.out.println("CricketCoach: practice dive catches");
	}

	@Override
	public void getFortune() {
		System.out.println("CricketCoach: " + fortuneService.giveFortune());
	}
	
	@Override
	public void getInformation() {
		System.out.println("BasketBallCoach: Name = " + name + ", Email = " + email);
	}

}
