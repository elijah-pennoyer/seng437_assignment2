package org.jfree.data.test.datautilities.getcumulativepercentages;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InvalidInputTest {
	
	
	private KeyedValues testKeyedValues;
	
	@Before
	public void setUp() throws Exception {
		testKeyedValues = null;
	}

	@After
	public void tearDown() throws Exception {
		testKeyedValues = null;
	}

	@Test (expected = Exception.class)
	public void test() {
		DataUtilities.getCumulativePercentages(testKeyedValues);
	}

}
