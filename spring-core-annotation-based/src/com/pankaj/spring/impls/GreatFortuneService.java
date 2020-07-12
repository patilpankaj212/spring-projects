package com.pankaj.spring.impls;

import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.FortuneService;

@Component
public class GreatFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		return "You will get what you need";
	}

}
