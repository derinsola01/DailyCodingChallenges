package com.derintester.dailycodingproblems.september2019;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CodifySample {
	
	private static final Logger logger = LogManager.getLogger(CodifySample.class);
	
	public static void main(String[] args) {
//		Integer[] arr = {1, 3, 6, 4, 1, 2};
//		Integer[] arr = {1, 3, 2};
		Integer[] arr = {-1, -3};
		List<Integer> arrConverted = Arrays.asList(arr);
		Arrays.sort(arr);
		int lowestNum = Collections.min(arrConverted);
		int highestNum = Collections.max(arrConverted);
		
		Integer retNum = getLowestPositiveNum(arrConverted, lowestNum, highestNum);
		logger.debug("retNum holds:\t" + retNum);
	}

	private static Integer getLowestPositiveNum(List<Integer> arrConverted, int lowestNum, int highestNum) {
		Integer numNotInArray = 0;
		Integer loopingNum = 0;
		Integer retNum = 0;
		Integer returnNum = 0;
		Integer tempLow = (lowestNum <= 0) ? 1 : lowestNum;
		for (int index = 0; index < arrConverted.size(); index++) {
			loopingNum = tempLow + index;
			logger.debug("loopingNum holds:\t" + loopingNum);
			if (!(String.valueOf(arrConverted).contains(loopingNum.toString()))) {
				loopingNum = arrConverted.get(index) + 1;
				numNotInArray = loopingNum;
			}
		}
		if (lowestNum == tempLow) {
			if(numNotInArray == 0) {
				returnNum = highestNum + 1 ;
			} else {
				returnNum = numNotInArray;
			}
		} else {
			returnNum = tempLow;
		}
		retNum = returnNum;
		return retNum;
	}

}
