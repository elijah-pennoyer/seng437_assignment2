package org.jfree.data.test.datautilities.createNumberArray;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class NullInputTest {

	
	/**
	 * Test Plan Coverage: createNumberArray test plan 1
	 * Test Strategy Coverage: Null equivalence class
	 * Description: Tests the result of entering a null array pointer
	 * Expected Output: IllegalArgumentException
	 * Assumptions: N/A
	 */
	@Test (expected = IllegalArgumentException.class)
	public void createNumberArray_NullInput_Test() {
		
		double[] data = null;
		//This should throw an IllegalArgumentException
		DataUtilities.createNumberArray(data);
		
	}

}
