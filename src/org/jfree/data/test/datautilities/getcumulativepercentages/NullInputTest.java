package org.jfree.data.test.datautilities.getcumulativepercentages;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * This tests the result of entering invalid inputs to the getCumulativePercentages function of the DataUtilities class.
 */
public class NullInputTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	/**
	 * Tests the result of entering a null KeyedValues. Expected result: Exception.
	 */
	@Test (expected = Exception.class)
	public void getCumulativePercentages_NullInput_Test() {
		KeyedValues input = null;
		DataUtilities.getCumulativePercentages(input);
	}

}
