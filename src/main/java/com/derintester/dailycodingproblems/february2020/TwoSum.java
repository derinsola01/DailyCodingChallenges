package com.derintester.dailycodingproblems.february2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TwoSum {
	
	private static Logger logger = LogManager.getLogger(TwoSum.class);

	public static void main(String[] args) {
		int[] givenArr = {10, 11, 12, 16, 25, 40};
		int targetNum = 23;
		int[] indexes = getIndices(givenArr, targetNum);
		logger.debug("indexes are: " + Arrays.toString(indexes));
	}

	private static int[] getIndices(int[] givenArr, int targetNum) {
		int[] result = new int[2];
		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		
		for(int index = 0; index < givenArr.length; index++) {
			int remainder = targetNum - givenArr[index];
			
			if (indexMap.size() == 0) {
				indexMap.put(remainder, index);
			}
			
			if(indexMap.containsKey(givenArr[index])) {
				result[0] = indexMap.get(givenArr[index]);
				result[1] = index;
				return result;
			}
			
			indexMap.put(remainder, index);
		}
		
		return null;
	}

}
