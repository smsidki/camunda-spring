package com.me.camunda.service;

import java.util.List;

import org.camunda.bpm.engine.delegate.JavaDelegate;

public interface UserApprovalService extends JavaDelegate {

	List<String> findAssigneeByTask(String task);
	String getCurrentAssignee(String code);

}
