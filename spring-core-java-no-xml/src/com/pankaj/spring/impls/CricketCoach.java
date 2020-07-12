package com.pankaj.spring.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.Coach;
import com.pankaj.spring.interfaces.FortuneService;

@Component("cricket")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

	@Value("Pankaj Patil")
	private String name;
	
	@Value("patilpankaj212@gmail.com")
	private String email;
	
	private FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void giveTask() {
		System.out.println("CricketCoach: do fielding practice");
	}

	@Override
	public void giveFortune() {
		System.out.println("CricketCoach: " + fortuneService.giveFortune());
	}

	@Override
	public void getInformation() {
		System.out.println("CricketCoach: Name = " + name + ", Email = " + email);
	}

}
