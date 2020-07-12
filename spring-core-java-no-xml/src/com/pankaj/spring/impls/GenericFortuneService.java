package com.pankaj.spring.impls;

import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.FortuneService;

@Component
public class GenericFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		return "You will get whatever you need";
	}

}
