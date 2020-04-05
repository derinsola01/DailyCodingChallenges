package com.derintester.dailycodingproblems.october2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaySeventyEasy {
	
	private static final Logger logger = LogManager.getLogger(DaySeventyEasy.class);

	public static void main(String[] args) {
		int givenNumber = 5;
		String perfectNumber = getPerfectNumber(givenNumber);
		logger.debug("perfectNumber holds: " + perfectNumber);
	}

	private static String getPerfectNumber(int givenNumber) {
		String returnedString = "";
		if(givenNumber < 10) {
			int remainder = 10 - givenNumber;
			returnedString = givenNumber + "" + remainder;
//					Integer.toString(givenNumber) + Integer.toString(remainder);
		}
		return returnedString;
	}

}
