package org.jfree.data.test.datautilities.createNumberArray;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class ValidNegativeInputTest {
	
	/**
	 * Test Plan Coverage: createNumberArray test plan 2-b
	 * Test Strategy Coverage: Valid non-empty equivalence class
	 * Description: Input an array with a length of 3, elements {-1.5, -1.5, -1.5}
	 * Expected Output: A Number array of {-1.5, -1.5, -1.5}
	 * Assumptions: N/A
	 */
	@Test
	public void createNumberArray_ValidNegativeInput_Test() {
		double[] data = {-1.5, -1.5, -1.5};
		Number[] output = DataUtilities.createNumberArray(data);
		Number[] expected = {-1.5, -1.5, -1.5};

		
		assertArrayEquals(expected, output);
	}

}
