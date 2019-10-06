package com.derintester.dailycodingproblems.october2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DayFortySeven {
	
	private static final Logger logger = LogManager.getLogger(DayFortySeven.class);

	public static void main(String[] args) {
		int[] givenArray = {9, 11, 8, 5, 7, 10, 3};
		int maxGain = getMaximumStockGain(givenArray);
		logger.debug("maxGain is: " + maxGain);
	}

	private static int getMaximumStockGain(int[] givenArray) {
		int maxGain = 0;
		int lengthOfArray = givenArray.length;
		if (lengthOfArray == 1) {
			return maxGain;
		} else if (lengthOfArray == 2) {
			if (givenArray[1] < givenArray[0]) {
				return maxGain;
			} else {
				maxGain = givenArray[1] - givenArray[0];
				return maxGain;
			}
		} else if (lengthOfArray > 2) {
			for (int outerIndex = 0; outerIndex < lengthOfArray - 1; outerIndex++) {
				for(int innerIndex = outerIndex + 1; innerIndex < lengthOfArray; innerIndex++) {
					if ((givenArray[outerIndex] > givenArray[innerIndex])) {
						continue;
					} else {
						maxGain = (maxGain < (givenArray[innerIndex] - givenArray[outerIndex])) 
								? (givenArray[innerIndex] - givenArray[outerIndex]) : maxGain;
					}
				}
			}
		}
		
		return maxGain;
	}

}
