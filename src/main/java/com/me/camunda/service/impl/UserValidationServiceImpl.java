package com.me.camunda.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.me.camunda.service.UserValidationService;

@Service("userValidationService")
public class UserValidationServiceImpl implements UserValidationService {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserValidationServiceImpl.class);
	
	public boolean isNameValid(String userName) {
		LOG.info("Validating user " + userName.toUpperCase());
		boolean valid = false;
		if (userName.length() >= 4) {
			valid = true;
		}
		return valid;
	}
	
	public boolean isValidApproval() {
		LOG.info("Validating approval");
		// assume valid, TODO change this
		return true;
	}
	
}
