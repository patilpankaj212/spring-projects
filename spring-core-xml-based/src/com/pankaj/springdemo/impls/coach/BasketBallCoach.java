package com.pankaj.springdemo.impls.coach;

import com.pankaj.springdemo.interfaces.coach.Coach;
import com.pankaj.springdemo.interfaces.fortuneservice.FortuneService;

public class BasketBallCoach implements Coach {

	private String name;
	private String emailAddress;
	private FortuneService fortuneService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public void giveExercise() {
		System.out.println("BasketBall: 10 rounds around the court.");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getFortune() {
		System.out.println(this.fortuneService.giveFortune());
	}

	@Override
	public void coachDetails() {
		System.out.println("BasketBallCoach: Name = " + this.getName() + ", Email = " + this.getEmailAddress());
	}
}
