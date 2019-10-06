package com.derintester.dailycodingproblems.october2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DayFortyFour {
	
	private static final Logger logger = LogManager.getLogger(DayFortyFour.class);

	public static void main(String[] args) {
//		int[] givenArray = {2,4,1,3,5};
		int[] givenArray = {5,4,3,2,1};
		int flips = getNumberOfInversions(givenArray);
		logger.debug("number of flips is: " + flips);
	}

	private static int getNumberOfInversions(int[] givenArray) {
		int flips = 0;
		for(int outerIndex = 0; outerIndex < givenArray.length - 1; outerIndex++) {
			for(int innerIndex = outerIndex + 1; innerIndex < givenArray.length; innerIndex++) {
				if(givenArray[outerIndex] > givenArray[innerIndex]) {
					flips += 1;
				}
			}
		}
		return flips;
	}

}
