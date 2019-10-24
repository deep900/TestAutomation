/**
 * 
 */
package com.sequence;

/**
 * @author pradheep
 *
 */
public interface SequenceTask {
	
	public SequenceTask getNextSequence();
	
	public boolean hasPreviousSequence();
	
	public boolean hasNextSequence();
	
	public SequenceTask getPreviousSequence();
	
	public String getName();
	
	public void setName(String sequenceName);
	
	public Object getInputData();
	
	public void setInputData(Object inputData);
	
	public Object getOutputData();
	
	public void reportFailure();
	
	public void performSequence();
	
	public void setSequenceNumber(Integer sequenceNumber) throws SequenceOrderMissingException;
	
}
