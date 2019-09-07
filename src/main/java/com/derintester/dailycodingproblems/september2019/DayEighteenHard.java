package com.derintester.dailycodingproblems.september2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 *Question:
 *Given an array of integers and a number k, where 1 <= k <= length of the array, 
 *compute the maximum values of each subarray of length k.
 *
 *For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
 *10 = max(10, 5, 2)
 *7 = max(5, 2, 7)
 *8 = max(2, 7, 8)
 *8 = max(7, 8, 7)
 *
 *Do this in O(n) time and O(k) space. You can modify the input array in-place 
 *and you do not need to store the results. You can simply print them out as you compute them.
 */
public class DayEighteenHard {
	
	private static final Logger logger = LogManager.getLogger(DayEighteenHard.class);

	public static void main(String[] args) {
		int[] givenArr = {10, 5, 2, 7, 8, 7};
		int substrLength = 3;
		List<List<Integer>> subArray = breakIntoLists(givenArr, substrLength);
		List<Integer> maxNumbers = getMaxNumberInList(subArray);
		logger.debug("maxNumbers holds:\t" + maxNumbers);
	}

	private static List<Integer> getMaxNumberInList(List<List<Integer>> subArray) {
		List<Integer> maxNumbers = new ArrayList<Integer>();
		for (int index = 0; index < subArray.size(); index++) {
			Integer maxNum = Collections.max(subArray.get(index));
			maxNumbers.add(maxNum);
		}
		return maxNumbers;
	}

	private static List<List<Integer>> breakIntoLists(int[] givenArr, int substrLength) {
		List<List<Integer>> subArray = new ArrayList<List<Integer>>();
		int givenArrLength = givenArr.length;
		if(substrLength <= givenArrLength) {
			for(int innerIndex = 0; innerIndex <= givenArrLength - substrLength; innerIndex++) {
				List<Integer> subArr = new ArrayList<Integer>();
				int outerIndexLimit = innerIndex + substrLength;
				for(int outerIndex = innerIndex; outerIndex < outerIndexLimit; outerIndex++) {
					subArr.add(givenArr[outerIndex]);
				}
				subArray.add(subArr);
			}
		}
		return subArray;
	}

}
