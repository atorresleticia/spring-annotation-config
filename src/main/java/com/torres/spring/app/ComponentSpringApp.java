package com.torres.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.torres.spring.service.Coach;

public class ComponentSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		context.close();
		
	}
}
