package com.me.camunda.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.me.camunda.service.LdapService;

@Service("ldapService")
public class LdapServiceImpl implements LdapService {

	private static final Logger LOG = LoggerFactory.getLogger(LdapServiceImpl.class);

	@Override
	public String findByUserName(String userName) {
		LOG.info("Searching for user " + userName + ", and summon him into 'Kopet Kelelep'");
		return "Kopet Kelelep";
	}
	
}
