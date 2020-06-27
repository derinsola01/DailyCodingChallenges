package com.derintester.dailycodingproblems.september2019;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.derintester.dailycodingproblems.september2019.DayThirtyFive;

public class DayThirtyFiveTest extends TestCase {
	
	public void sortCharArrayInReverseTest() {
		char[] givenCharArray = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		char[] returnArray = {'R', 'R', 'R', 'G', 'G', 'B', 'B'};
		assertTrue( DayThirtyFive.sortCharArrayInReverse(givenCharArray)
				== (returnArray) );
	}
	
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public DayThirtyFiveTest( String testName )
	{
	    super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
	    return new TestSuite( DayThirtyFiveTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
	    assertTrue( true );
	}
}