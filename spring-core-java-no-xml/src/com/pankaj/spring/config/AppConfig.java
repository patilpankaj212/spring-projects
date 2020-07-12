package com.pankaj.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pankaj.spring")
public class AppConfig {

	//Bean definitions required when not using the @Autowired annotations
	
	/*
	 * @Bean public CricketCoach getCricetCoach() { CricketCoach cricketCoach = new
	 * CricketCoach(getHappyFortuneService()); return cricketCoach; }
	 * 
	 * @Bean public BasketBallCoach getBasketBallCoach() { BasketBallCoach
	 * basketBallCoach = new BasketBallCoach();
	 * basketBallCoach.setFortuneService(getGenericFortuneService()); return
	 * basketBallCoach; }
	 * 
	 * @Bean public HappyFortuneService getHappyFortuneService() { return new
	 * HappyFortuneService(); }
	 * 
	 * @Bean public GenericFortuneService getGenericFortuneService() { return new
	 * GenericFortuneService(); }
	 */
}
