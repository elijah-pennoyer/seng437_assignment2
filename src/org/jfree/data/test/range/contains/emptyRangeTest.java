package org.jfree.data.test.range.contains;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class emptyRangeTest {
	
	public Range r;

	@Before
	public void setup(){
		r = new Range(1.5,1.5);
	}
	
	@Test
	public void withinRange() {
		boolean b = r.contains(1.5);
		assertTrue("The given range should contain 1.5", b);
	}
	
	@Test
	public void notWithinRange() {
		boolean b = r.contains(1.6);
		assertFalse("The given range should not contain 1.6",b);
	}

}
