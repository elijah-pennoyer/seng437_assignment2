package org.jfree.data.test.datautilities.getcumulativepercentages;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NullInputTest {
	
	/**
	 * getCumulativePercentages test plan 1.
	 * Tests the result of entering a null KeyedValues.
	 * Expected result: Exception.
	 */
	@Test (expected = Exception.class)
	public void getCumulativePercentages_NullInput_Test() {
		KeyedValues input = null;
		DataUtilities.getCumulativePercentages(input);
	}

}
