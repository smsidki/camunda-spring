package com.me.camunda.service;

import org.camunda.bpm.engine.delegate.JavaDelegate;

public interface MealService extends JavaDelegate {
	
	void serveFood();
	String prepareAppetizer(String appetizer);
	String prepareMainCourse(String dish);
	String prepareDessert(String dessert);

}
