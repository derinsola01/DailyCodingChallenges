package com.derintester.dailycodingproblems.july2020;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day320 {
	
	private static final Logger logger = LogManager.getLogger(Day320.class);

	public static void main(String[] args) {
		String givenString = "jiujitsu";
		int lengthOfUniqueChars = getDistinctNumberOfChars(givenString);
		logger.debug("lengthOfUniqueChars is: {}", lengthOfUniqueChars);
	}

	private static int getDistinctNumberOfChars(String givenString) {
		int length = 0;
		if((givenString == null) || (givenString.length() == 0)) {
			return length;
		}
		char[] charArr = givenString.toCharArray();
		Set<Character> charArrSet = new HashSet<Character>();
		for(int index = 0; index < charArr.length; index++) {
			charArrSet.add(charArr[index]);
		}
		return charArrSet.size();
	}

}
