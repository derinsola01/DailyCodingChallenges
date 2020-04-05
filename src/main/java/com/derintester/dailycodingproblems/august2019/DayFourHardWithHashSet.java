package com.derintester.dailycodingproblems.august2019;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author derin
 *
 *Question:
 * Given an array of integers, find the first missing positive integer 
 * in linear time and constant space. 
 * In other words, find the lowest positive integer that does not exist in the array. 
 * The array can contain duplicates and negative numbers as well.
 * For example, the input [3, 4, -1, 1] should give 2. 
 * The input [1, 2, 0] should give 3.
 * You can modify the input array in-place. 
 * Solution not complete, will continue working on it till its all done.
 */
public class DayFourHardWithHashSet {
	
	
	
	public static final Logger logger = LogManager.getLogger(DayFourHard.class);

	/**
	 * @param args
	 * 
	 
	 */
	
	public static void main(String[] args) {
//		int[] numArray = {3, 4, -1, 1};
//		int[] numArray = {3, 4, -1, 1, 1, 5, 5};
//		int[] numArray = {13, 14, -1, 11, 11, 15, 15};
//		int[] numArray = {1, 3, 6, 4, -1, 2};
		int[] numArray = {101, 103, 106, 104, -1, 102};
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
		logger.debug("Array now is: " + Arrays.toString(numArray));
		int numArrayLength = numArray.length;
		int intervalNum = - 1;
		int getArrayElement = 0;
		Set<Integer> convString = getPositiveIntegers(numArray);
		
		if (convString.size() < numArrayLength) {
			intervalNum = getInterval(convString, intervalNum);
		}
		logger.debug("convString holds:\t" + convString);
		logger.debug("intervalNum holds:\t" + intervalNum);
		getArrayElement = getPossibleArrayElement(convString, intervalNum);
		logger.debug("getArrayElement holds:\t" + getArrayElement);
		getArrayElement = getLowestPositiveNumberAndPlaceInArrayLocation(numArray, intervalNum, getArrayElement,
				convString);
		return getArrayElement;
	}
	
	private static int getLowestPositiveNumberAndPlaceInArrayLocation(int[] numArray, int intervalNum,
			int getArrayElement, Set<Integer> convString) {
		Integer[] setArr = convString.toArray(new Integer[convString.size()]);
		List<Integer> listArr = Arrays.asList(setArr);
		for(int aa = 0; aa < numArray.length; aa++) {
			if(numArray[aa] <= 0) {
				int tempNegNum = setArr[0];
				if (tempNegNum - intervalNum <= 0) {
					tempNegNum += intervalNum;
				} 
				else {
					tempNegNum -= intervalNum;
				}
				if(listArr.contains(tempNegNum)) {
					for (int ab = 0; ab < setArr.length - 1; ab++) {
						if (setArr[ab] >= setArr[ab + 1]) {
							while (listArr.contains(tempNegNum)) {
								tempNegNum += intervalNum;
							}
						} else {
							while (listArr.contains(tempNegNum)) {
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
	
	private static int getPossibleArrayElement(Set<Integer> convString, int intervalNum) {
		Integer[] setArr = convString.toArray(new Integer[convString.size()]);
		int getArrayElement = (convString.size() == 0) ? 0 : setArr[0];
		return getArrayElement;
	}
	
	private static int getInterval(Set<Integer> convString, int diff) {
		Integer[] setArr = convString.toArray(new Integer[convString.size()]);
		Arrays.sort(setArr);
		for(int i = 0; i < convString.size() - 1; i++) {
			int initDiff = - 1;
			
			if(setArr[i] < setArr[i + 1]) {
				initDiff = setArr[i + 1] - setArr[i];
				if(diff == - 1) {
					diff = initDiff;
				} else if(diff > initDiff){
					diff = initDiff;
				}
				
			} else if(setArr[i] > setArr[i + 1]) {
				initDiff = setArr[i] - setArr[i + 1];
				if(diff == - 1) {
					diff = initDiff;
				} else if(diff > initDiff){
					diff = initDiff;
				}
			}
		}
		return diff;
	}

	private static Set<Integer> getPositiveIntegers(int[] numArray) {		
		Set<Integer> convString = new HashSet<Integer>();
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i] > 0) {
				convString.add(numArray[i]);
			}
		}
		return convString;
	}

}
