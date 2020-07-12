package com.pankaj.spring.impls;

import org.springframework.stereotype.Component;

import com.pankaj.spring.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String giveFortune() {
		return "Its your lucky day today";
	}

}
