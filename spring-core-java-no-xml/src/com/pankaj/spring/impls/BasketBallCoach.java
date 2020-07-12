package com.pankaj.spring.impls;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.Coach;
import com.pankaj.spring.interfaces.FortuneService;

@Component("basketBall")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class BasketBallCoach implements Coach {

	@Value("Ruksad Mia")
	private String name;
	
	@Value("ruksad@mia.com")
	private String email;
	
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("genericFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public void giveTask() {
		System.out.println("BasketBallCoach: do fielding practice");
	}

	@Override
	public void giveFortune() {
		System.out.println("BasketBallCoach: " + fortuneService.giveFortune());
	}

	@Override
	public void getInformation() {
		System.out.println("BasketBallCoach: Name = " + name + ", Email = " + email);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method of BasketBallCoach called");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method of BasketballCoach called");
	}
}
