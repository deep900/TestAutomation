/**
 * 
 */
package com.testautomation;

import com.sequence.SequenceOrderMissingException;
import com.sequence.SequenceTask;

/**
 * @author pradheep
 *
 */
public class BFAHttpSeqenceTask implements SequenceTask {

	public SequenceTask getNextSequence() {		
		return null;
	}

	public boolean hasPreviousSequence() {		
		return false;
	}

	public boolean hasNextSequence() {		
		return false;
	}

	public SequenceTask getPreviousSequence() {		
		return null;
	}

	public String getName() {		
		return null;
	}

	public void setName(String sequenceName) {		

	}

	public Object getInputData() {
		return null;
	}

	public void setInputData(Object inputData) {

	}

	public Object getOutputData() {
		return null;
	}

	public void reportFailure() {

	}

	public void performSequence() {

	}

	public void setSequenceNumber(Integer sequenceNumber) throws SequenceOrderMissingException {

	}

}
