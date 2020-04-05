package com.derintester.dailycodingproblems.february2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiddleRotation {
	
	private static Logger logger = LogManager.getLogger(MiddleRotation.class);

	public static void main(String[] args) {
//		String givenWord = "123456";
		String givenWord = "Hello World!";
		String result = rotate(givenWord, 0,6,11);
		logger.debug("result is: '" + result + "'");
	}

	private static String rotate(String givenWord, int i, int j, int k) {
		char[] charArr = givenWord.toCharArray();
		int charArrayLoopLength = charArr.length;
		char[] returnArr = new char[charArrayLoopLength];
		if(charArr.length != charArrayLoopLength) {
			return null;
		} else {
			for (int index = 0; index < charArrayLoopLength; index++) {
				int tempPos = ((index % charArrayLoopLength) + j);
				int position = (tempPos < charArrayLoopLength) ? tempPos : tempPos % charArrayLoopLength;
				returnArr[position] = charArr[index];
			}

		}
		return new String(returnArr);
	}

}
