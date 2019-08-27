package com.derintester.dailycodingproblems;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PreviewCodingChallenge {
	
	public static final Logger logger = LogManager.getLogger(PreviewCodingChallenge.class);

	public static void main(String[] args) {
		int[] steps = {1, 2};
		int numberOfStairs = 4;
		int ways = numOfUniqueWays(numberOfStairs, steps);
		logger.debug("ways now holds\t" + ways);
	}

	private static int numOfUniqueWays(int numberOfStairs, int[] steps) {
		int returnNum = 0;
		if (numberOfStairs < 0) {
			return returnNum = 0;
		}
		else if (numberOfStairs == 0) {
			return returnNum = 1;
		}
		else {
			for(int i = 0; i < steps.length; i++) {
				returnNum += numOfUniqueWays(numberOfStairs - steps[i], steps);
			}
			return returnNum;
		}
		
	}

}
