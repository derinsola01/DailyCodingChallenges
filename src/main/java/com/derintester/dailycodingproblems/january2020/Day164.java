package com.derintester.dailycodingproblems.january2020;

import java.util.Set;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day164 {
	
	private static Logger logger = LogManager.getLogger(Day164.class);

	public static void main(String[] args) {
		int[] givenArr = {1,2,3,4,5,6,7,4,8,9};
		int duplicateNumber = findDuplicate(givenArr);
		logger.debug("duplicateNumber number is: " + duplicateNumber);
	}

	private static int findDuplicate(int[] givenArr) {
		Set<Integer> hashSet = new TreeSet<Integer>();
		int duplicateNumber = 0;
		for (int index = 0; index < givenArr.length; index++) {
			if (index == 0) {
				hashSet.add(givenArr[index]);
			} else if (index > 0) {
				if (hashSet.contains(givenArr[index])) {
					return duplicateNumber = givenArr[index];
				} else {
					hashSet.add(givenArr[index]);
				}
			}
		}
		
		return duplicateNumber;
	}

}
