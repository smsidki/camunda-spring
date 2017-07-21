package com.me.camunda.service.impl;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.me.camunda.service.MealService;

import lombok.Setter;

@Service("mealService")
public class MealServiceImpl implements MealService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MealServiceImpl.class);

	@Setter
	private Expression food;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOG.info(food.getValue(execution) + " has been served");
	}
	
	@Override
	public void serveFood() {
		LOG.info("All food have been served");
	}

	@Override
	public String prepareAppetizer(String appetizer) {
		LOG.info("Preparing appetizer " + appetizer);
		return appetizer;
	}

	@Override
	public String prepareMainCourse(String dish) {
		LOG.info("Preparing dish " + dish);
		return dish;
	}

	@Override
	public String prepareDessert(String dessert) {
		LOG.info("Preparing dessert " + dessert);
		return dessert;
	}

}
