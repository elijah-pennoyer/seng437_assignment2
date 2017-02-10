package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

/**
 * This equivalence class test covers the contains functions when the range it has been given is "empty".
 * Ex. Range extends from 1.5 to 1.5
 *
 */
public class emptyRangeTest {
	
	public Range r;

	@Before
	/**
	 * Creates an empty Range which extends from 1.5 to 1.5
	 */
	public void setup(){
		r = new Range(1.5,1.5);
	}
	
	@Test
	/**
	 * The value 1.5 is expected to fall within the given Range
	 */
	public void withinRange() {
		boolean b = r.contains(1.5);
		assertTrue("The given range should contain 1.5", b);
	}
	
	@Test
	/**
	 * The value 1.6 is expected to fall outside the given Range
	 */
	public void notWithinRange() {
		boolean b = r.contains(1.6);
		assertFalse("The given range should not contain 1.6",b);
	}

}
