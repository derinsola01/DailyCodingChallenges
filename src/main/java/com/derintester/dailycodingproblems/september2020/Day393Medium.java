package com.derintester.dailycodingproblems.september2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day393Medium {
	
	private static final Logger logger = LogManager.getLogger(Day395Medium.class);
	
	public static void main(String[] args) {
//		int[] givenArr = {9, 6, 1, 3, 8, 10, 12, 11};
		int[] givenArr = {101,102,103,120,121,123,124,130,132}; //8, 10, 11,11,12,13,60,90
		List<Integer> rangeInterval = getRange(givenArr);
		logger.debug("rangeInterval is: {}", rangeInterval);
	}

	private static List<Integer> getRange(int[] givenArr) {
		List<Integer> returnList = new ArrayList<Integer>();
		if(givenArr == null || givenArr.length == 0) {
			return returnList;
		}
		Arrays.sort(givenArr);
		int initialNumber = givenArr[0];
		int finalNumber = givenArr[0];
		for(int index = 1; index < givenArr.length; index++) {
//			logger.debug("Looping through the element index: {}, to see what gives: {}", index, givenArr[index]);
			if(index < givenArr.length - 1) {
				if ((givenArr[index - 1] == givenArr[index] - 1) && (givenArr[index + 1] == givenArr[index] + 1)) {
					logger.debug("counting sheep: {}", givenArr[index]);
//					initialNumber = givenArr[index];
					finalNumber = givenArr[index];
				} else if ((givenArr[index - 1] != givenArr[index] - 1) && (givenArr[index + 1] == givenArr[index] + 1) ) {
					initialNumber = givenArr[index];
				} else if((index == givenArr.length - 1) && (givenArr[index + 1] == givenArr[index] + 1)) {
					logger.debug("HOW MANY TIMES: {}", givenArr[index]);
					finalNumber = givenArr[index] + 1;
				}
			}
			
//			if (index == givenArr.length - 1) {
//				
//			}
		}
		
		logger.debug("initialNumber is: {}, whilst finalNumber is: {}", initialNumber, finalNumber);
		returnList.add(initialNumber);
		returnList.add(finalNumber);
		return returnList;
	}

}
