package com.torres.spring.service.impl;

import org.springframework.stereotype.Component;

import com.torres.spring.service.Coach;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Throw that ball!";
	}

}
