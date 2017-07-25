package com.me.camunda.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.me.camunda.service.UserApprovalService;

@Service("userApprovalService")
public class UserApprovalServiceImpl implements UserApprovalService {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserApprovalServiceImpl.class);
	
	private static final String KOPET = "Kopet Kelelep";
	private static final String AYAM = "Ayam Ngesot";
	private static final String KUCENG = "Kuceng Bertelur";

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOG.info("User approved");
	}

	@Override
	public List<String> findAssigneeByTask(String task) {
		LOG.info("Populating user based on " + task + " task");
		List<String> assignee = new ArrayList<String>();
		assignee.add(KOPET);
		assignee.add(AYAM);
		assignee.add(KUCENG);
		return assignee;
	}

	@Override
	public String getCurrentAssignee(String code) {
		String assignee = null;
		switch (code) {
		case "1":
			assignee = KOPET;
			break;
		case "2":
			assignee = AYAM;
			break;
		case "3":
			assignee = KUCENG;
		default:
			//do nothing
			break;
		}
		LOG.info("Task is assigned to : " + assignee);
		return assignee;
	}
	
}
