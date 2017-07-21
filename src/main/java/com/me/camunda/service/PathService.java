package com.me.camunda.service;

import org.camunda.bpm.engine.delegate.JavaDelegate;

public interface PathService extends JavaDelegate {
	
	String goTo(String path);
	String getVehicle(String vehicle);

}
