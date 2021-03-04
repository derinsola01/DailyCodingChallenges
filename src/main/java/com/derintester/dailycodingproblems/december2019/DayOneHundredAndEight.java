package com.derintester.dailycodingproblems.december2019;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author derin
 * 
 * This solution is nowhere near optimal.
 *
 */
public class DayOneHundredAndEight {
	
	private static final Logger logger = LogManager.getLogger(DayOneHundredAndEight.class);

	
	public static void main(String[] args) {
		String A = "abcde";
		String B = "cdeab";
//		String A = "abc";
//		String B = "acb";
		boolean result = canShift(A, B);
		logger.debug("result is:\t" + result);
	}

	private static boolean canShift(String a, String b) {
		List<String> stringList = getAllrotations(a);
		boolean result = (stringList.contains(b)) ? true : false ;
		return result;
	}

	private static List<String> getAllrotations(String a) {
		List<String> returnList = new ArrayList<String>();
		char[] charArray = a.toCharArray();
		int charArrayLoopLength = charArray.length;
		for(int outerIndex = 0; outerIndex < charArrayLoopLength; outerIndex++) {
			char[] tempCharArray = new char[charArrayLoopLength];
			for(int innerIndex = 0; innerIndex < charArrayLoopLength; innerIndex++) {
				int tempPos = ((innerIndex % charArrayLoopLength) + 1);
				int position = (tempPos < charArrayLoopLength) ? tempPos : tempPos % charArrayLoopLength;
				tempCharArray[position] = charArray[innerIndex];
			}
			String rotatedString = new String(tempCharArray);
			returnList.add(rotatedString);
			charArray = tempCharArray.clone();
		}
		return returnList;
	}

}
