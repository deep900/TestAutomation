/**
 * 
 */
package com.testautomation;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.automation.log.LoggerBean;

/**
 * @author pradheep
 *
 */
public class SequenceLoader {
	
	@Autowired
	private LoggerBean loggerBean;
	
	public List<String> loadAllSequences(){
		loggerBean.getLogBean(this.getClass()).debug("Loading the sequences .. ");
		return Collections.emptyList();
	}
}
