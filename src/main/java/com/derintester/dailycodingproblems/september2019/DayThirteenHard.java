package com.derintester.dailycodingproblems.september2019;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
		
		if(k > stringLength) {
			logger.debug("Number is greater than the length of the given string");
		} else {
			char[] strArr = s.toCharArray();
			char[] chrArr = new char[k];
			int lengthHolder = 0;
//			if (strArr[0] != strArr[1]) {
//				chrArr[0] = strArr[0];
//				chrArr[1] = strArr[1];
//			}
			for(int outerIndex = 0; outerIndex < stringLength - 1; outerIndex++) {
				chrArr[0] = strArr[outerIndex];
				for(int innerIndex = outerIndex + 1; innerIndex < stringLength; innerIndex++) {
					if((chrArr.toString().contains(Character.toString(strArr[innerIndex]))
							|| chrArr.toString().contains(Character.toString(strArr[outerIndex]))) &&
							chrArr.length == 2) {
						chrArr[1] = strArr[innerIndex];
						lengthHolder += 1;
						logger.debug("returnLength holds IF:\t" + returnLength);
						logger.debug("lengthHolder holds IF:\t" + lengthHolder);
					} else {
//						chrArr[]
						if (lengthHolder > returnLength) {
							returnLength = lengthHolder;
						}
						logger.debug("returnLength holds:\t" + returnLength);
						logger.debug("lengthHolder holds:\t" + lengthHolder);
						lengthHolder = 0;
					}
				}
			}
		}
		
	}

}
