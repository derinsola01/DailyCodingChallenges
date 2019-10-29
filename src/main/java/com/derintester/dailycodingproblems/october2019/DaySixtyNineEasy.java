package com.derintester.dailycodingproblems.october2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DaySixtyNineEasy {
	
	private static final Logger logger = LogManager.getLogger(DaySixtyNineEasy.class);

	public static void main(String[] args) {
		int[] givenArray = {-10, -10, 5, 2, 10, 50, 1, 2, 3};
		int highestProduct = getHighestProduct(givenArray);
		logger.debug("highestProduct holds: " + highestProduct);
	}

	private static int getHighestProduct(int[] givenArray) {
		int highProd = 0;
		if(givenArray.length == 3) {
			highProd = givenArray[0] * givenArray[1] * givenArray[2];
		} else if (givenArray.length > 3) {
			for(int outerIndex = 0; outerIndex < givenArray.length - 2; outerIndex++) {
				int indexLimit = outerIndex + 2;
				int tempProduct =  givenArray[outerIndex];
				for(int innerIndex = outerIndex + 1; innerIndex <= indexLimit; innerIndex++) {
					tempProduct *= givenArray[innerIndex];
				}
				highProd = (tempProduct > highProd) ? tempProduct : highProd;
			}
		}
		return highProd;
	}

}
