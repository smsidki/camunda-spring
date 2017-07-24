package com.me.camunda.listener.impl;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.me.camunda.listener.AssignmentHandler;

@Component("assignmentHandler")
public class AssignmentHandlerImpl implements AssignmentHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(AssignmentHandlerImpl.class);

	@Override
	public void notify(DelegateTask delegateTask) {
		LOG.info("Assigning task to user . . .");
		delegateTask.setAssignee("Kopet Kelelep");
	}
	
}
