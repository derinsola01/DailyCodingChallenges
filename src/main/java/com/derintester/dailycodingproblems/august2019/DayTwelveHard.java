package com.derintester.dailycodingproblems.august2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayTwelveHard {
	
	public static final Logger logger = LogManager.getLogger(DayTwelveHard.class);

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
