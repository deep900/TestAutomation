/**
 * 
 */
package com.sequence;

import com.testautomation.ApplicationConstants;

/**
 * @author pradheep
 *
 */
public class SequenceOrderMissingException extends RuntimeException{
	
	public SequenceOrderMissingException(){
		super(ApplicationConstants.SEQUENCE_ORDER_MISMATCH_ERROR);
	}

}
