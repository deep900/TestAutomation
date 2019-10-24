/**
 * 
 */
package com.sequence;

/**
 * @author pradheep
 *
 */
public interface Sequence {
	
	public SequenceTask geTasks();
	
	public void setName(String sequenceName);
	
	public String getName();
	
	public void loadSequence(String fileName);
}
