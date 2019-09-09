package com.derintester.dailycodingproblems.august2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question: 
 * Given a list of integers, write a function that returns the largest sum of 
 * non-adjacent numbers. Numbers can be 0 or negative.
 * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. 
 * [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 * 
 * I noticed that this solution does not solve for edge cases with input like these - 
 * 		{1,5,1}, this solution will only add the first and third numbers.
 * 		Also, when the input size is 2 and the second number is greater.
 * 
 * I will have to incorporate these and harden the algorithm.
 *
 */
public class DayNineHard {
	
	private static final Logger logger = LogManager.getLogger(DayNineHard.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayList = {2, 4, 6, 2, 5};
//		int[] arrayList = {5, 1, 1, 5};
//		int[] arrayList = {5, 1, 10, 5, 10, 7, 8, 23, 2};
//		int[] arrayList = {5, 1, 10};
		int nonAdjacentSum = getNonAdjacentSum(arrayList);
		logger.debug("nonAdjacentSum is:\t" + nonAdjacentSum);
	}

	private static int getNonAdjacentSum(int[] arrayList) {
		int returnSum = 0;
		int loopLimit = arrayList.length - 1;
		for(int index = 0; index < loopLimit; index+=2) {
			int nextIndex = index + 1;
			if (returnSum == 0) {
				logger.debug("Initial Number selected is:\t" + arrayList[index]);
				returnSum = arrayList[index];
			}
			else if (arrayList[index] > arrayList[nextIndex]) {
				returnSum += arrayList[index];
				logger.debug("Next Number selected is:\t" + arrayList[index]);
			} else {
				returnSum += arrayList[nextIndex];
				index += nextIndex;
				logger.debug("Next Number selected is:\t" + arrayList[nextIndex]);
			}
			if(index + 2 > loopLimit) {
				index = loopLimit;
			} else if (index + 2 == loopLimit) {
				returnSum += arrayList[index + 2];
				logger.debug("Final number in array was selected:\t" + arrayList[loopLimit]);
				index = loopLimit;
			}
		}
		return returnSum;
	}

}
