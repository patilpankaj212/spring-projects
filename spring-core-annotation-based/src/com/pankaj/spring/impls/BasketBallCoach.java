package com.pankaj.spring.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.Coach;
import com.pankaj.spring.interfaces.FortuneService;

@Component
public class BasketBallCoach implements Coach {

	@Value("${coach.name}")
	private String name;
	
	@Value("${coach.email}")
	private String email;
	
	private FortuneService fortuneService;
	
	@Autowired
	public BasketBallCoach(@Qualifier("greatFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void giveExercise() {
		System.out.println("BasketBallCoach: run 10 round around the court");
	}

	@Override
	public void getFortune() {
		System.out.println("BasketBallCoach: " + fortuneService.giveFortune());
	}

	@Override
	public void getInformation() {
		System.out.println("BasketBallCoach: Name = " + name + ", Email = " + email);
	}

}
