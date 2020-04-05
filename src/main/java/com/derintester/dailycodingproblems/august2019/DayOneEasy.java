package com.derintester.dailycodingproblems.august2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author derin
 * 
 * Question: Given a list of numbers and a number k, return whether any two numbers 
 * from the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
public class DayOneEasy {
	
	private static final Logger logger = LogManager.getLogger(DayOneEasy.class);

	public static void main(String[] args) {
		int[] givenArray = {10, 15, 3, 7};
		int summedNumber = 25;
		boolean sumIs = sumOfTwoNumbers(givenArray, summedNumber);
		logger.debug("SumIs ?:\t " + sumIs);
	}

	private static boolean sumOfTwoNumbers(int[] givenArray, int summedNumber) {
		int arrayLength = givenArray.length;
		for(int outerIndex = 0; outerIndex < arrayLength - 1; outerIndex++) {
			for (int innerIndex = outerIndex + 1; innerIndex < arrayLength; innerIndex++) {
				if((givenArray[outerIndex] + givenArray[innerIndex]) == summedNumber) {
					return true;
				}
			}
		}
		return false;
	}

}
