package com.derintester.dailycodingproblems.december2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayOneHundredAndSix {
	
	private static final Logger logger = LogManager.getLogger(DayOneHundredAndSix.class);

	public static void main(String[] args) {
//		List<Integer> givenList = new ArrayList<Integer>();
		int[] givenArray = {2, 0, 2, 0, 1, 0};
//		int[] givenArray = {1, 1, 2, 1, 0, 0};
		boolean result = canHop(givenArray);
		logger.debug("result holds:\t" + result);
	}

	private static boolean canHop(int[] givenArray) {
		int terminator = givenArray.length;
		int index = 0;
		boolean result = false;
		while(index < terminator) {
			if(index == terminator - 1) {
				result = true;
				break;
			}
			if((givenArray[index] == 0) && (index != terminator - 1)) {
				break;
			}
			index = givenArray[index] + index;
		}
		return result;
	}

}
