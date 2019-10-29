package com.derintester.dailycodingproblems.october2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DaySixtyNineEasy {
	
	private static final Logger logger = LogManager.getLogger(DaySixtyNineEasy.class);

	public static void main(String[] args) {
		int[] givenArray = {-10, -10, 5, 10, 20, 15, 100, 2, 1, 4, 5};
		int highestProductBrute = getHighestProductBrute(givenArray);
		int highestProductSplit = getHighestProductSplit(givenArray);
		logger.debug("highestProductBrute holds: " + highestProductBrute);
		logger.debug("highestProductSplit holds: " + highestProductSplit);
	}

	private static int getHighestProductSplit(int[] givenArray) {
		int highProduct = 0;
		if(givenArray.length == 3) {
			return justThree(givenArray);
		} else if (givenArray.length > 3) {
			int[] firstSet = new int[givenArray.length - 2];
			int[] secondSet = new int[givenArray.length - 2];
			int[] thirdSet = new int[givenArray.length - 2];
			
			int indexCounter = 0;
			for(int firstIndex = 0; firstIndex < givenArray.length - 2; firstIndex++) {
				firstSet[indexCounter] = givenArray[firstIndex];
				indexCounter++;
			}
			indexCounter = 0;
			for(int secondIndex = 1; secondIndex < givenArray.length - 1; secondIndex++) {
				secondSet[indexCounter] = givenArray[secondIndex];
				indexCounter++;
			}
			indexCounter = 0;
			for(int thirdIndex = 2; thirdIndex < givenArray.length; thirdIndex++) {
				thirdSet[indexCounter] = givenArray[thirdIndex];
				indexCounter++;
			}
			
			for (int mergeIndex = 0; mergeIndex < firstSet.length; mergeIndex++) {
				int tempProd = firstSet[mergeIndex] * secondSet[mergeIndex] * thirdSet[mergeIndex];
				highProduct = (highProduct > tempProd) ? highProduct : tempProd;
			}
			
		}
		
		return highProduct;
	}
	
	private static int justThree(int[] givenArray) {
		return givenArray[0] * givenArray[1] * givenArray[2];
	}

	private static int getHighestProductBrute(int[] givenArray) {
		int highProd = 0;
		if(givenArray.length == 3) {
			return justThree(givenArray);
		} 
		else if (givenArray.length > 3) {
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
