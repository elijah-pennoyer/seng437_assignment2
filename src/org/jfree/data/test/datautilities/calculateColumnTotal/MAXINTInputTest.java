package org.jfree.data.test.datautilities.calculateColumnTotal;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class MAXINTInputTest {

	/**
	 * Test Plan Coverage: calculateColumnTotal test plan 5
	 * Test Strategy Coverage: MAX_INT Data equivalence class
	 * Description: Tests the calculateColumnTotal function when presented with a Values2D containing MAX_INT
	 * Expected Output: 0.0
	 * Assumptions: The function should recognize the risk for overflow when presented with MAX_INT as an input.
	 * 				The function should return 0 as this case should be an invalid input.
	 */
	@Test
	public void maxIntTest() {
		
		//mocked Values2D array containing a single column and 2 rows. All values in the array are MAX_INT
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,0);
			will (returnValue(Integer.MAX_VALUE));
			
			allowing (input).getValue(1,0);
			will (returnValue(Integer.MAX_VALUE));
			
			allowing (input).getColumnCount();
			will (returnValue(1));
			
			allowing (input).getRowCount();
			will (returnValue(2));
			}
		});
		
		double result = DataUtilities.calculateColumnTotal(input, 0);
		assertTrue("expected 0 but got " + result, result == 0);
	}

}
