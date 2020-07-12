package com.pankaj.springdemo.impls.fortuneservice;

import com.pankaj.springdemo.interfaces.fortuneservice.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		return "HappyFortuneService: Today is your lucky day";
	}

}
