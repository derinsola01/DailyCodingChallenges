package com.derintester.dailycodingproblems.august2019;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question: Given an array of integers, return a new array such that each element 
 * at index i of the new array is the product of all the numbers in the original 
 * array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be 
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], 
 * the expected output would be [2, 3, 6].
 *
 */
public class DayTwoHard {
	
	private static final Logger logger = LogManager.getLogger(DayTwoHard.class);

	public static void main(String[] args) {
		int[] givenArray = {1,2,3,4,5};
		int[] returnArray = multiplyArrayExceptIndex(givenArray);
		logger.debug("returnArray holds:\t" + Arrays.toString(returnArray));
	}

	private static int[] multiplyArrayExceptIndex(int[] givenArray) {
		int arrLen = givenArray.length;
		int[] retArray = new int[arrLen];
		for(int origIndex = 0; origIndex < arrLen; origIndex++) {
			int product = 1;
			for(int dupIndex = 0; dupIndex < arrLen; dupIndex++) {
				if (givenArray[origIndex] == givenArray[dupIndex]) {
					continue;
				} else {
					product *= givenArray[dupIndex];
				}
			}
			retArray[origIndex] = product;
		}
		return retArray;
	}

}
