package org.jfree.data.test.datautilities.calculateColumnTotal;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RobustInputTest {
	
	public int col;
	public double expected;
	
	public RobustInputTest(int col, double expected) {
		this.col = col;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{-1, 0},
			{3, 0}
		});
	}

	@Test
	public void outOfRangeTest() {
		
		//mocked Values2D array containing a single column and 2 rows. All values in the array are MIN_INT
		Mockery mockingContext = new Mockery();
		final Values2D input = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			allowing (input).getValue(0,-1);
			will (returnValue(2));
			
			allowing (input).getValue(0,3);
			will (returnValue(2));
			
			allowing (input).getColumnCount();
			will (returnValue(1));
			
			allowing (input).getRowCount();
			will (returnValue(1));
			}
		});
				
		double result = DataUtilities.calculateColumnTotal(input, col);
		assertTrue("expected 0 but got " + result, result == 0);
	}

}
