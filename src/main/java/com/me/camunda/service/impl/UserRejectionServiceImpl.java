package com.me.camunda.service.impl;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.me.camunda.service.UserRejectionService;

@Service("userRejectionService")
public class UserRejectionServiceImpl implements UserRejectionService {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserRejectionServiceImpl.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOG.info("User rejected");
	}

}
