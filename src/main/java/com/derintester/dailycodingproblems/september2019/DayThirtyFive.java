package com.derintester.dailycodingproblems.september2019;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayThirtyFive {
	
	private static final Logger logger = LogManager.getLogger(DayThirtyFive.class);

	public static void main(String[] args) {
		char[] givenCharArray = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		char[] sortedCharArray = sortCharArrayInReverse(givenCharArray);
		logger.debug("sortedCharArray holds:\t" + Arrays.toString(sortedCharArray));
	}

	public static char[] sortCharArrayInReverse(char[] givenCharArray) {
		char[] sortedCharArray = new char[givenCharArray.length];
		Arrays.sort(givenCharArray);
		int sortedCharArrayIndex = 0;
		for(int index = givenCharArray.length - 1; index >= 0; index--) {
			sortedCharArray[sortedCharArrayIndex] = givenCharArray[index];
			sortedCharArrayIndex++;
		}
		return sortedCharArray;
	}

}
