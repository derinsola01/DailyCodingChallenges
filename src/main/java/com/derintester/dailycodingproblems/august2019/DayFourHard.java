package com.derintester.dailycodingproblems.august2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 */
public class DayFourHard {
	
	
	
	public static final Logger logger = LogManager.getLogger(DayFourHard.class);

	/**
	 * @param args
	 * 
	 * Question:
	 * Given an array of integers, find the first missing positive integer 
	 * in linear time and constant space. 
	 * In other words, find the lowest positive integer that does not exist in the array. 
	 * The array can contain duplicates and negative numbers as well.
	 * For example, the input [3, 4, -1, 1] should give 2. 
	 * The input [1, 2, 0] should give 3.
	 * You can modify the input array in-place.
	 * 
	 * Solution not complete, will continue working on it till its all done.
	 */
	
	public static void main(String[] args) {
//		int[] numArray = {3, 4, -1, 1};
//		int[] numArray = {3, 4, -1, 1, 1, 5, 5};
		int[] numArray = {13, 14, -1, 11, 11, 15, 15};
//		int[] numArray = {1, 2, 0};
//		int[] numArray = {3, 2, 0};
//		int[] numArray = {3, 5, -1, 7, 11, 1, 9, 13};
//		int[] numArray = {5, -5, 15, 20};
		Arrays.sort(numArray);
		int lowestNumNotInArray = lowestPositiveNumNotInArray(numArray);
		Arrays.sort(numArray);
		logger.debug("lowestNumNotInArray is: " + lowestNumNotInArray);
		logger.debug("Array now is: " + Arrays.toString(numArray));
	}

	private static int lowestPositiveNumNotInArray(int[] numArray) {
		int numArrayLength = numArray.length;
		int intervalNum = - 1;
		int getArrayElement = 0;
		List<String> convString = getPositiveIntegers(numArray);
		if (convString.size() < numArrayLength) {
			intervalNum = getInterval(convString, intervalNum);
		}
		getArrayElement = getPossibleArrayElement(convString, intervalNum);
		getArrayElement = getLowestPositiveNumberAndPlaceInArrayLocation(numArray, intervalNum, getArrayElement,
				convString);
		return getArrayElement;
	}

	private static int getLowestPositiveNumberAndPlaceInArrayLocation(int[] numArray, int intervalNum,
			int getArrayElement, List<String> convString) {
		for(int aa = 0; aa < numArray.length; aa++) {
			if(numArray[aa] <= 0) {
				int tempNegNum = Integer.valueOf(convString.get(0));
				if (tempNegNum - intervalNum <= 0) {
					tempNegNum += intervalNum;
				} 
				else {
					tempNegNum -= intervalNum;
				}
				if(convString.contains(Integer.toString(tempNegNum))) {
					for (int ab = 0; ab < convString.size() - 1; ab++) {
						if (Integer.valueOf(convString.get(ab)) 
								>= Integer.valueOf(convString.get(ab + 1))) {
							while (convString.contains(Integer.toString(tempNegNum))) {
								tempNegNum += intervalNum;
							}
						} else {
							while (convString.contains(Integer.toString(tempNegNum))) {
								tempNegNum += intervalNum;
							}
						}
					}
					numArray[aa] = tempNegNum;
				} else {
					numArray[aa] = tempNegNum;
				}
				getArrayElement = tempNegNum;
			}
		}
		return getArrayElement;
	}

	private static int getPossibleArrayElement(List<String> convString, int intervalNum) {
		int getArrayElement = -1; 
		if(convString.size() == 0) {
			getArrayElement = 0;
		} else {
			getArrayElement = Integer.valueOf(convString.get(0));
		}
		return getArrayElement;
	}

	private static int getInterval(List<String> convString, int diff) {
		for(int i = 0; i < convString.size() - 1; i++) {
			int initDiff = - 1;
			if(Integer.valueOf(convString.get(i)) 
					< Integer.valueOf(convString.get(i + 1))) {
				initDiff = Integer.valueOf(convString.get(i + 1)) 
						- Integer.valueOf(convString.get(i));
				if(diff == - 1) {
					diff = initDiff;
				} else if(diff > initDiff){
					diff = initDiff;
				}
				
			} else if(Integer.valueOf(convString.get(i)) 
					> Integer.valueOf(convString.get(i + 1))) {
				initDiff = Integer.valueOf(convString.get(i)) 
						- Integer.valueOf(convString.get(i + 1));
				if(diff == - 1) {
					diff = initDiff;
				} else if(diff > initDiff){
					diff = initDiff;
				}
			}
		}
		return diff;
	}

	private static List<String> getPositiveIntegers(int[] numArray) {
		List<String> convString = new ArrayList<String>();
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i] > 0) {
				String number = Integer.toString(numArray[i]);
				convString.add(number);
			}
		}
		return convString;
	}

}
