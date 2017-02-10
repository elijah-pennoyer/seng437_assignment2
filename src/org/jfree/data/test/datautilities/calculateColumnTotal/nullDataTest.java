package org.jfree.data.test.datautilities.calculateColumnTotal;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/**
 * This equivalence test class covers the calculateColumnTotal function when the data is has been given is null
 * The column index is arbitrarily set to 1 for this test.
 */
public class nullDataTest {

	@Test
	public void test() {
		double result = DataUtilities.calculateColumnTotal(null, 1);
		assertTrue("The function did not correctly return 0 when given a null input", result == 0);
	}

}
