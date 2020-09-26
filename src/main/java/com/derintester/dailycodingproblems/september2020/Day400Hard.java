package com.derintester.dailycodingproblems.september2020;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day400Hard {
	
	private static final Logger logger = LogManager.getLogger(Day400Hard.class);
	private static final int ZERO = 0;
	private static final int ONE = 1;

	public static void main(String[] args) {
		int[] givenList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] interval = {13, 15};
		int[] sumList = getSumList(givenList);
		int result = sum(sumList, interval);
		logger.debug("result is: {}", result);
	}

	private static int[] getSumList(int[] givenList) {
		if (givenList == null || givenList.length == ZERO) {
			return null;
		}
		
		int[] sumHolder = new int[givenList.length];
		for (int index = ZERO; index < givenList.length; index++) {
			if(index == ZERO) {
				sumHolder[index] = givenList[index];
			} else {
				sumHolder[index] = sumHolder[index - ONE] + givenList[index]; 
			}
		}
		logger.debug("sumHolder holds: {}", Arrays.toString(sumHolder));
		return sumHolder;
	}

	private static int sum(int[] sumList, int[] interval) {
		int result = ZERO;
		
		if (sumList == null) {
			return result;
		}
		
		int intialElement = interval[ZERO];
		int finalElement = interval[ONE];
		
		if (intialElement > finalElement) {
			return result;
		} else {
			if(interval[ZERO] == ZERO) {
				result = sumList[finalElement - ONE];
			} else {
				int tempHolder = sumList[finalElement - ONE];
				result = tempHolder - sumList[intialElement - ONE];
			}
		}
	
		return result;
	}

}
