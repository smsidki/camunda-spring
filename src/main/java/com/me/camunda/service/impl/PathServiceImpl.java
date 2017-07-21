package com.me.camunda.service.impl;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.me.camunda.service.PathService;

@Service("pathService")
public class PathServiceImpl implements PathService {
	
	private static final Logger LOG = LoggerFactory.getLogger(PathServiceImpl.class);

	private Expression vehicleType;

	public void setVehicleType(Expression vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public void execute(DelegateExecution exec) throws Exception {
		LOG.info("The vehicle used is " + vehicleType.getValue(exec).toString().toUpperCase());
	}
	
	public String getVehicle(String vehicle) {
		return vehicle;
	}
		
	public String goTo(String path) {
		LOG.info("User selects " + path.toUpperCase() + " path");
		return path;
	}

}
