package com.derintester.dailycodingproblems.october2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayFortyNine {
	
	private static final Logger logger = LogManager.getLogger(DayFortyNine.class);

	public static void main(String[] args) {
//		int[] givenArray = {34, -50, 42, 14, -5, 86};
		int[] givenArray = {-5, -1, -8, -9};
		int maximumSum = getMaximumSum(givenArray);
		logger.debug("maximumSum is: " + maximumSum);
	}

	private static int getMaximumSum(int[] givenArray) {
		int maxNum = 0;
		
		if (givenArray.length == 0) {
			return maxNum;
		} else if (givenArray.length == 1) {
			return maxNum = (givenArray[0] < 0) ? maxNum : givenArray[0];
		} else if (givenArray.length > 1){
			for(int index = 0; index < givenArray.length; index++) {
				maxNum = ((maxNum + givenArray[index]) < 0) ? 0 : (maxNum + givenArray[index]);
			}
		}
		return maxNum;
	}

}
