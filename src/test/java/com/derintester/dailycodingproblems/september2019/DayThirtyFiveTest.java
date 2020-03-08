package com.derintester.dailycodingproblems.september2019;

import junit.framework.TestCase;
import com.derintester.dailycodingproblems.september2019.DayThirtyFive;

public class DayThirtyFiveTest extends TestCase {
	
	public void sortCharArrayInReverseTest() {
		char[] givenCharArray = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		char[] returnArray = {'R', 'R', 'R', 'G', 'G', 'B', 'B'};
		assertTrue( DayThirtyFive.sortCharArrayInReverse(givenCharArray)
				== (returnArray) );
	}

}


//public class AppTest 
//
//{
///**
// * Create the test case
// *
// * @param testName name of the test case
// */
//public AppTest( String testName )
//{
//    super( testName );
//}
//
///**
// * @return the suite of tests being tested
// */
//public static Test suite()
//{
//    return new TestSuite( AppTest.class );
//}
//
///**
// * Rigourous Test :-)
// */
//public void testApp()
//{
//    assertTrue( true );
//}
//}