package com.nestvogel.payara.emcom.nestvogel.pocs.payara.embedded.app;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Singleton
@Startup
public class SampleBean {

	@PostConstruct
	private void start() {
		log.info("SampleBean für ein wenig EJB-Gedöns gestartet.");
	}

	public String getText() {
		return "Hallo vom Payara." + System.getProperty("moinsen");
	}

}
