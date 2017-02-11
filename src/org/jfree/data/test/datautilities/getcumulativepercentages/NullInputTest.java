package org.jfree.data.test.datautilities.getcumulativepercentages;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.junit.Test;


public class NullInputTest {
	
	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 1.
	 * Test Strategy Coverage: Data is null
	 * Description: Tests the result of entering a null KeyedValues
	 * Expected Output: Exception.
	 * Assumptions: N/A
	 */
	@Test (expected = Exception.class)
	public void getCumulativePercentages_NullInput_Test() {
		KeyedValues input = null;
		DataUtilities.getCumulativePercentages(input);
	}

}
