package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

/**
 * This equivalence class test covers the contains functions when the range it has been given is not "empty".
 * Ex. Range extends from 1.5 to 2.5
 *
 */
public class nonEmptyRangeTest {
	public Range r;

	@Before
	/**
	 * Creates a non-empty Range which extends from 1.5 to 2.5
	 */
	public void setup(){
		r = new Range(1.5, 2.5);
	}
	
	@Test
	/**
	 * The value 1.0 is expected to fall outside the given Range
	 */
	public void belowRange() {
		boolean b = r.contains(1.0);
		assertFalse("The given range should not contain 1.0", b);
	}
	
	@Test
	/**
	 * The value 2.0 is expected to fall within the given Range
	 */
	public void withinRange() {
		boolean b = r.contains(2.0);
		assertTrue("The given range should contain 2.0", b);
	}
	
	@Test
	/**
	 * The value 3.0 is expected to fall outside the given Range
	 */
	public void aboveRange() {
		boolean b = r.contains(3.0);
		assertFalse("The given range should not contain 3.0", b);
	}
}
