package com.derintester.dailycodingproblems.april2020;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question: 	Given a list of numbers, create an algorithm that arranges 
 * 				them in order to form the largest possible integer. 
 * 				For example, given [10, 7, 76, 415], you should return 77641510.
 * 
 * Note: This solution is sub-optimal, uses a lot of space and time complexity is O(n-squared).
 *
 */
public class Day228 {
	
	private static final Logger logger = LogManager.getLogger(Day228.class);

	public static void main(String[] args) {
		int[] givenArr = {10, 7, 76, 415};
		int largestInt = getLargestInteger(givenArr);
		logger.debug("largestInt is: " + largestInt);
	}

	private static int getLargestInteger(int[] givenArr) {
		if (givenArr == null || givenArr.length == 0) {
			return 0;
		} else if (givenArr.length == 1) {
			return givenArr[0];
		}
		
		int givenArrLength = givenArr.length;
		int largestInt = 0;
		
		for (int index = 0; index < givenArrLength; index++) {
			String numHolder = "";
			int[] finalArr = new int[givenArrLength];
			for(int innerIndex = 0; innerIndex < givenArrLength; innerIndex++) {
				int tempPos = ((innerIndex % givenArrLength) + 1);
				int position = (tempPos < givenArrLength) ? tempPos : tempPos % givenArrLength;
				finalArr[position] = givenArr[innerIndex];
				numHolder += givenArr[innerIndex];
			}
			
			givenArr = finalArr;
			largestInt = (Integer.parseInt(numHolder) > largestInt) ? Integer.parseInt(numHolder) : largestInt;
		}
		
		return largestInt;
	}

}
