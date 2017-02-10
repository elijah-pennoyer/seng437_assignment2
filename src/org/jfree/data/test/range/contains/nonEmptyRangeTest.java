package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class nonEmptyRangeTest {
	public Range r;

	@Before
	public void setup(){
		r = new Range(1.5, 2.5);
	}
	
	@Test
	public void belowRange() {
		boolean b = r.contains(1.0);
		assertFalse("The given range should not contain 1.0", b);
	}
	
	@Test
	public void withinRange() {
		boolean b = r.contains(2.0);
		assertTrue("The given range should contain 2.0", b);
	}
	
	@Test
	public void aboveRange() {
		boolean b = r.contains(3.0);
		assertFalse("The given range should not contain 3.0", b);
	}
}
