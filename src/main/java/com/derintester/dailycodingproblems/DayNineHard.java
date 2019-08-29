package com.derintester.dailycodingproblems;

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
		int arrLength = arrayList.length;
		int nonAdjacentSum = getNonAdjacentSum(arrayList, arrLength);
		logger.debug("nonAdjacentSum is:\t" + nonAdjacentSum);
	}

	private static int getNonAdjacentSum(int[] arrayList, int arrLength) {
		int returnSum = 0;
		if (arrLength >= 4) {
			returnSum += arrayList[0];
			int loopLimit = arrLength - 1;
			for(int index = 2; index < loopLimit; index+=2) {
				int nextIndex = index + 1;
				int tempNum = (arrayList[index] >= arrayList[nextIndex]) 
						? arrayList[index] : arrayList[nextIndex] ;
				returnSum += tempNum;
				if (arrayList[nextIndex] > arrayList[index]) {
					index += nextIndex;
				}
				if(index + 2 > loopLimit) {
					index = loopLimit;
				} else if (index + 2 == loopLimit) {
					returnSum += arrayList[index + 2];
					index = loopLimit;
				}
			}
			return returnSum;
		} else {
			return returnSum;
		}
	}

}
