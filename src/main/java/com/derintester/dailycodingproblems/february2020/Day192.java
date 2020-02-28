package com.derintester.dailycodingproblems.february2020;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Day192 {
	
	private static Logger logger = LogManager.getLogger(Day192.class);

	public static void main(String[] args) {
//		int[] givenArr = {1, 3, 1, 2, 0, 1};
//		int[] givenArr = {1, 2, 1, 0, 0};
//		int[] givenArr = {3, 3, 1, 2, 0, 1};
		int[] givenArr = {2, 3, 3, 2, 0, 3, 0, 1, 4, 2, 3, 11, 13};
		boolean result = canTrack(givenArr);
		logger.debug("result is: " + result);
	}

	private static boolean canTrack(int[] givenArr) {
		boolean result = false;
		int limit = givenArr.length - 1;
		int index = 0;
		int initElem = -1;
		while(index <= limit) {
			if (index == 0) {
				index = givenArr[index];
			} else if (index > 0 && initElem == -1) {
				initElem = givenArr[index];
				index = givenArr[index];
			} else if (index > 0 && initElem != -1) {
				index += givenArr[index];
			}
			
			logger.debug("index is\t" + index);
			
			if(index == limit) {
				return result = true;
			} else if (index > limit) {
				return result;
			} else if ((givenArr[index] == 0) && index < limit) {
				return result;
			} 
			
			
		}
		return result;
	}

}
