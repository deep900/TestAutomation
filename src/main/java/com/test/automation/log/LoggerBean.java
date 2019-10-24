package com.test.automation.log;

import javax.annotation.PostConstruct;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.core.io.ClassPathResource;

/**
 * @author pradheep
 *
 */
public class LoggerBean {
	
	private LogManager logManager = new LogManager();

	public Logger getLogBean(Class classObj) {
		return logManager.getLogger(classObj);
	}
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		ClassPathResource resource = new ClassPathResource("app-log.properties");
		getLogBean(this.getClass()).info("Logger Bean is up");
		try {
			PropertyConfigurator.configure(resource.getInputStream());
		} catch (Exception e) {
			getLogBean(this.getClass()).error("Exception occured in reading properties", e);
		}
	}
}
