package com.derintester.dailycodingproblems.february2020;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Day189 {
	
	private static Logger logger = LogManager.getLogger(Day189.class);

	public static void main(String[] args) {
		int[] givenArr = {5, 1, 3, 5, 2, 3, 4, 1};
		List<Integer> returnArr = longestSubArray(givenArr);
		logger.debug("returnArr holds\t" + returnArr);
	}

	private static List<Integer> longestSubArray(int[] givenArr) {
		List<Integer> returnList = new ArrayList<Integer>();
		for(int index = 0; index < givenArr.length; index++) {
			if(returnList.size() == 0) {
				returnList.add(givenArr[index]);
			}
			
			if (returnList.contains(givenArr[index])) {
				returnList.clear();
				returnList.add(givenArr[index]);
				continue;
			}
			
			returnList.add(givenArr[index]);
		}
		return returnList;
	}

}
