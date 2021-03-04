package com.derintester.dailycodingproblems.september2020;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day399Hard {
	
	private static final Logger logger = LogManager.getLogger(Day399Hard.class);

	public static void main(String[] args) {
		int[] givenArr = {3, 5, 8, 0,2,1,3,4,5,6,11,12,13};
		List<List<Integer>> returnedList = threePartition(givenArr);
		logger.debug("returnedList is: {}", returnedList);
	}

	private static List<List<Integer>> threePartition(int[] givenArr) {
		List<List<Integer>> returnedList = null;
		if(givenArr == null || givenArr.length < 3) {
			return returnedList;
		}
		
		if(givenArr.length % 3 == 0) {
			int[] firstArr = new int[givenArr.length/3];
			int[] secondArr = new int[givenArr.length/3];
			int[] thirdArr = new int[givenArr.length/3];
			logger.debug("firstArr holds: {}", Arrays.toString(firstArr));
			logger.debug("secondArr holds: {}", Arrays.toString(secondArr));
			logger.debug("thirdArr holds: {}", Arrays.toString(thirdArr));
		} else if(givenArr.length % 3 == 2) {
			int holder1 = givenArr.length/3;
			int holder2 = givenArr.length % 3;
//			int holder3 = givenArr.length/3;
			int[] firstArr = new int[(givenArr.length % 3)];
			int[] secondArr = new int[(givenArr.length % 3)];
			int[] thirdArr = new int[(givenArr.length/3)];
			logger.debug("firstArr holds: {}", Arrays.toString(firstArr));
			logger.debug("secondArr holds: {}", Arrays.toString(secondArr));
			logger.debug("thirdArr holds: {}", Arrays.toString(thirdArr));
			logger.debug("holder1 holds: {}", holder1);
			logger.debug("holder2 holds: {}", holder2);
		} else if(givenArr.length % 3 == 1) {
			int holder1 = givenArr.length/3;
			int holder2 = givenArr.length % 3;
//			int holder3 = givenArr.length/3;
			int[] firstArr = new int[(givenArr.length / 3) + 1];
			int[] secondArr = new int[(givenArr.length/3)];
			int[] thirdArr = new int[(givenArr.length/3)];
			logger.debug("firstArr holds: {}", Arrays.toString(firstArr));
			logger.debug("secondArr holds: {}", Arrays.toString(secondArr));
			logger.debug("thirdArr holds: {}", Arrays.toString(thirdArr));
			logger.debug("holder1 holds: {}", holder1);
			logger.debug("holder2 holds: {}", holder2);
		}
		
		return returnedList;
	}

}
