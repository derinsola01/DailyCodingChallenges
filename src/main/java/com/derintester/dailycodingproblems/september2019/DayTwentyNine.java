package com.derintester.dailycodingproblems.september2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author derin
 * 
 * Question:
 * 
 * Run-length encoding is a fast and simple method of encoding strings. 
 * The basic idea is to represent repeated successive characters as a single count 
 * and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
 * 
 * Implement run-length encoding and decoding. 
 * You can assume the string to be encoded have no digits and consists solely of 
 * alphabetic characters. You can assume the string to be decoded is valid.
 *
 */
public class DayTwentyNine {
	
	private static final Logger logger = LogManager.getLogger(DayTwentyNine.class);

	public static void main(String[] args) {
		String givenString = "AAAABBBCCDAA";
		String encodedString = encodeGivenString(givenString);
		logger.debug("encodedString holds:\t" + encodedString);
	}

	private static String encodeGivenString(String givenString) {
		String encodedString = "";
		char[] charArray = givenString.toCharArray();
		int arrayLength = charArray.length;
		char arrayElementHolder = charArray[0];
		int count = 1;
		if (arrayLength == 1) {
			encodedString += String.valueOf(count) + arrayElementHolder;
		} else if (arrayLength > 1) {
			for (int index = 1; index < arrayLength; index++) {
				if (arrayElementHolder == charArray[index]) {
					count++;
				} else {
					encodedString += String.valueOf(count) + arrayElementHolder;
					count = 1;
				}
				
				arrayElementHolder = charArray[index];
				
				if (index == arrayLength - 1) {
					encodedString += String.valueOf(count) + arrayElementHolder;
				}
			}
		}
		return encodedString;
	}

}
