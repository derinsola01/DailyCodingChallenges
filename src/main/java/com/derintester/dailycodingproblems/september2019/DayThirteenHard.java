package com.derintester.dailycodingproblems.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * Question:
 * Given an integer k and a string s, find the length of the longest substring 
 * that contains at most k distinct characters.
 * 
 * For example, given s = "abcba" and k = 2, 
 * the longest substring with k distinct characters is "bcb".
 *
 */
public class DayThirteenHard {
	
	public static final Logger logger = LogManager.getLogger(DayThirteenHard.class);

	public static void main(String[] args) {
		String s = "abcba";
		int k = 2;
		int stringLength = s.length();
		int returnLength = 0;
		
//		logger.debug("String length is: " + s.length());
//		logger.debug("k is: " + k);
		
		if(k > stringLength) {
			logger.debug("Number is greater than the length of the given string");
		} else {
			char[] strArr = s.toCharArray();
			char[] chrArr = new char[k];
			int lengthHolder = 0;
			for(int index = 0; index < stringLength; index++) {
				if(chrArr.toString().contains(Character.toString(strArr[index])) &&
						chrArr.length == 2) {
					lengthHolder += 1;
					logger.debug("returnLength holds IF:\t" + returnLength);
					logger.debug("lengthHolder holds IF:\t" + lengthHolder);
				} else {
//					chrArr[]
					if (lengthHolder > returnLength) {
						returnLength = lengthHolder;
					}
					logger.debug("returnLength holds:\t" + returnLength);
					logger.debug("lengthHolder holds:\t" + lengthHolder);
					lengthHolder = 0;
				}
				
			}
			logger.debug("Check for length here.");
		}
		
	}

}
