package com.derintester.dailycodingproblems.june2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day311 {
	
	private static final Logger logger = LogManager.getLogger(Day311.class);

	public static void main(String[] args) {
		int[] givenArr = {1,2,3,4,6,5,7,8,12,10};
		int peakElement = findPeakElement(givenArr);
		logger.debug("Peak element is: {}", peakElement);
	}

	private static int findPeakElement(int[] givenArr) {
		int result = -1;
		if (givenArr.length < 3){
			return result;
		} else {
			for(int index = 1; index < givenArr.length - 1; index++) {
				if(givenArr[index] > givenArr[index - 1] && givenArr[index] > givenArr[index + 1]) {
					result = givenArr[index];
				}
			}
		}
		return result;
	}

}
