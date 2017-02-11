package org.jfree.data.test.datautilities.getcumulativepercentages;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class NegativeInputTest extends PositiveSummingMixedSignInputsTest {

	/**
	 * Test Plan Coverage: getCumulativePercentages test plan 7. 
	 * Test Strategy Coverage: All values are negative
	 * Description: Tests a valid data input and a positive data input, with a keyset of (0,1) and values of (-3,-7)
	 * Expected Output: A KeyedValues object with keys (0, 1) and values (0.3, 1)
	 * Assumptions: N/A
	 */
	@Test
	public void getCumulativePercentages_ValidNegativeInput_Test() {
		
		Mockery mockingContext = new Mockery();
		final KeyedValues input = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				//If getItemCount is called, it will return 2
				allowing (input).getItemCount();
				will(returnValue(2)); 
				
				//If getKeys is called, it will return an ArrayList containing Integer objects of 0 and 1
				allowing (input).getKeys();
				ArrayList<Integer> toReturn = new ArrayList<Integer>();
				toReturn.add(0);
				toReturn.add(1);
				will(returnValue(toReturn));
				
				//If getValue(0) is called, will return -3
				allowing (input).getValue(0);
				will(returnValue(-3));
				
				//If getValue(1) is called, will return -7
				allowing (input).getValue(1);
				will(returnValue(-7));
				
				//If getKey(0) is called, will return 0 - The index of the first object
				allowing (input).getKey(0);
				will(returnValue(0));
				//If getKey(1) is called, will return 1 - The index of the second object
				allowing (input).getKey(1);
				will(returnValue(1));
				
			}
		});
		
		
		KeyedValues output = DataUtilities.getCumulativePercentages(input);
		
		//TODO - Is there a better way than multiple assertTrues?
		ArrayList<Integer> expectedKeys = new ArrayList<Integer>();
		expectedKeys.add(0);
		expectedKeys.add(1);
		assertTrue(output.getKeys().equals(expectedKeys));
		assertTrue((double) output.getValue(0) == 0.3);
		assertTrue((double) output.getValue(1) == 1);
		
	}

}
