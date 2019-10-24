/**
 * 
 */
package com.testautomation.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.automation.log.LoggerBean;
import com.testautomation.CacheData;
import com.testautomation.SequenceLoader;

/**
 * @author pradheep
 *
 */
@Configuration
public class TestAutomationConfiguration {

	static {
		System.out.println("--- Loading the configuration ---");
	}

	@Bean
	public CacheData getCacheData() {
		CacheData data = new CacheData();
		return data;
	}
	
	@Bean
	public LoggerBean getLoggerBean(){
		LoggerBean bean = new LoggerBean();
		return bean;
	}
	
	@Bean
	public SequenceLoader getSequenceLoader(){
		SequenceLoader sequenceLoader = new SequenceLoader();
		return sequenceLoader;
	}
}
