package org.jfree.data.test.datautilities.getcumulativepercentages;

import static org.junit.Assert.*;

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

	@Test @exception
	public void test() {
//		Mockery mockingContext = new Mockery();
//		final KeyedValues values = mockingContext.mock(KeyedValues.class);
//		mockingContext.checking(new Expectations() {
//			{
//				
//			}
//		});
		
		DataUtilities.getCumulativePercentages(testKeyedValues);
	}

}
