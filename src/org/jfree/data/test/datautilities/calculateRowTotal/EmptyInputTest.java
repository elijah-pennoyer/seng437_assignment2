package org.jfree.data.test.datautilities.calculateRowTotal;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class EmptyInputTest {

	/**
	 * Test Plan Coverage: calculateRowTotal test plan 3
	 * Test Strategy Coverage: Empty Data equivalence class
	 * Description: Tests the calculateRowTotal function when presented with an empty Values2D array as input
	 * Expected Output: 0.0 (invalid row index)
	 * Assumptions: The row index 0 is treated as an invalid input and therefore the function should return 0
	 */
	@Test
	public void calculateRowTotal_EmptyInput_Test() {
		//mocked Values2D array with 0 columns and 0 rows (empty)
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getColumnCount();
			will (returnValue(0));
			
			allowing (input).getRowCount();
			will (returnValue(0));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(input, 0);
		assertTrue("expected 0 but got " + result, result == 0);
	}

}
