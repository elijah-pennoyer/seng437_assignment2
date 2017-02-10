package org.jfree.data.test.datautilities.getcumulativepercentages;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * getCumulativePercentages test plan 3. 
 * Tests a valid data input and a positive data input, with a keyset of (0,1) and values of (5,5)
 * Expected output: A KeyedValues object with keys (0, 1) and values (0.5, 1)
 */
public class PositiveInputTest {

	@Test
	public void test() {
		
		Mockery mockingContext = new Mockery();
		final KeyedValues input = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				allowing (input).getItemCount();
				will(returnValue(2)); 
				
				//TODO - Have no clue if you're allowed to do this, but it makes sense to me...
				//If getKeys is called, it will return an ArrayList containing Integer objects of 0 and 1
				allowing (input).getKeys();
				ArrayList<Integer> ret = new ArrayList<Integer>();
				ret.add(0);
				ret.add(1);
				will(returnValue(ret));
				
				//If getValue(0) is called, will return 5
				one (input).getValue(0);
				will(returnValue(5));
				
				//If getValue(1) is called, will return 5
				one (input).getValue(1);
				will(returnValue(5));
				
			}
		});
		
		KeyedValues output = DataUtilities.getCumulativePercentages(input);
		
		
		//TODO - finish this test. There must be a better way than multipple assertTrues?
		
		ArrayList<Integer> expectedKeys = new ArrayList<Integer>();
		expectedKeys.add(0);
		expectedKeys.add(1);
		assertTrue(output.getKeys().equals(expectedKeys));
		assertTrue((double) output.getValue(0) == 0.5);
		assertTrue((double) output.getValue(1) == 1);
		
		fail("Not yet implemented");
	}

}
