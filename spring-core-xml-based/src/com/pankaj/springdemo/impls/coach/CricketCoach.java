package com.pankaj.springdemo.impls.coach;

import com.pankaj.springdemo.interfaces.coach.Coach;
import com.pankaj.springdemo.interfaces.fortuneservice.FortuneService;

public class CricketCoach implements Coach {

	private String name;
	private String emailAddress;

	private FortuneService fortuneService;

	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}

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

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void giveExercise() {
		System.out.println("Cricket: Do a balling practice.");
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
		System.out.println("CricketCoach: Name = " + this.getName() + ", Email = " + this.getEmailAddress());
	}
	
	public void initMethod() {
		System.out.println("The init method of the cricket coach called");
	}
	
	public void destroyMethod() {
		System.out.println("The destroy method of the cricket coach called");
	}

}
