package com.derintester.dailycodingproblems.november2019;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DayNinetyNine {
	
	private static Logger logger = LogManager.getLogger(DayNinetyNine.class);

	public static void main(String[] args) {
		int[] givenArray = {100, 4, 200, 1, 3, 2, 20,21,22,23,24,25,26,27,29,28,40,42,44,43,50,54,59};
		int sequenceLength = getLongestSequence(givenArray);
		logger.debug("Longest sequence length is: " + sequenceLength);
	}

	private static int getLongestSequence(int[] givenArray) {
		int returnNum = 0;
		Arrays.sort(givenArray);
		int tempHolder = 1;
		if (givenArray.length < 1) {
			tempHolder = 0;
		} else if(givenArray.length == 1){
			return returnNum = 1;
		} else {
			for(int index = 0; index < givenArray.length - 1; index++) {
				if(givenArray[index + 1] == givenArray[index] + 1) {
					tempHolder++;
				} else {
					returnNum = (returnNum > tempHolder) ? returnNum : tempHolder;
					tempHolder = 1;
				}
			}
		}
		
		return returnNum;
	}

}
