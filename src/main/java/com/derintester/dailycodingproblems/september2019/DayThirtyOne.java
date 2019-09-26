package com.derintester.dailycodingproblems.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * @author derin
 * 
 * Question:
 * The edit distance between two strings refers to the minimum number of 
 * character insertions, deletions, and substitutions required to change 
 * one string to the other. For example, the edit distance between “kitten” and “sitting” 
 * is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.
 * 
 * Given two strings, compute the edit distance between them.
 */

public class DayThirtyOne {
	
	private static final Logger logger = LogManager.getLogger(DayThirtyOne.class);

	public static void main(String[] args) {
		String stableString = "kitten";
		String transientString = "sitting";
		int distance = computeDistance(stableString, transientString);
		logger.debug("distance is:\t" + distance);
	}

	private static int computeDistance(String stableString, String transientString) {
		int distance = 0;
		char[] stableStringCharArray = stableString.toCharArray();
		char[] transientStringCharArray = transientString.toCharArray();
		int lengthStable = stableStringCharArray.length;
		int lengthTransient = transientStringCharArray.length;
		if(lengthStable == lengthTransient) {
			for (int index = 0; index < lengthStable; index++) {
				if (stableStringCharArray[index] != transientStringCharArray[index]) {
					transientStringCharArray[index] = stableStringCharArray[index];
					distance += 1;
				}
			}
		} else if (lengthStable < lengthTransient) {
			for (int index = 0; index < lengthStable; index++) {
				if (stableStringCharArray[index] != transientStringCharArray[index]) {
					transientStringCharArray[index] = stableStringCharArray[index];
					distance += 1;
				}
				if (index == lengthStable - 1) {
					distance += (lengthTransient - lengthStable);
				}
			}
		} else {
			for (int index = 0; index < lengthTransient; index++) {
				if (stableStringCharArray[index] != transientStringCharArray[index]) {
					transientStringCharArray[index] = stableStringCharArray[index];
					distance += 1;
				}
				if (index == lengthTransient - 1) {
					distance += (lengthStable - lengthTransient);
				}
			}
		}
		return distance;
	}

}
