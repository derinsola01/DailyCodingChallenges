package com.derintester.dailycodingproblems.september2019;

import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DayForty {
	
	private static final Logger logger = LogManager.getLogger(DayForty.class);

	public static void main(String[] args) {
		int[] givenArray = {6,1,3,3,3,6,6};
//		int[] givenArray = {13,19,13,13};
		int number = getNonDuplicateNumber(givenArray);
		logger.debug("Non duplicate number is: " + number);
		
	}

	private static int getNonDuplicateNumber(int[] givenArray) {
		int resultHolder = -1;
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		for (int index = 0; index < givenArray.length - 1; index++) {
			if(givenArray[index] == givenArray[index + 1]) {
				setOfNumbers.add(givenArray[index]);
			} else {
				if (!(setOfNumbers.contains(givenArray[index]))) {
					setOfNumbers.add(givenArray[index]);
					resultHolder = givenArray[index];
				}
				
				if (((index + 1) == (givenArray.length - 1)) && !(setOfNumbers.contains(givenArray[index + 1]))) {
					setOfNumbers.add(givenArray[index + 1]);
					resultHolder = givenArray[index + 1];
				}
				
			}
		}
		return resultHolder;
	}

}
