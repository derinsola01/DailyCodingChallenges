package com.derintester.dailycodingproblems.october2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day424 {
	
	private static final Logger logger = LogManager.getLogger(Day424.class);

	public static void main(String[] args) {
		int[] givenArr = {2,4,6,8,10,2,6,10};
		List<Integer> uniqueElems = getElementsAppearingOnce(givenArr);
		logger.debug("uniqueElems holds: {}", uniqueElems);
	}

	private static List<Integer> getElementsAppearingOnce(int[] givenArr) {
		if(givenArr == null || givenArr.length == 0) {
			return null;
		}
		
		List<Integer> response = new ArrayList<Integer>();
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for(int index = 0; index < givenArr.length; index++) {
			if (intMap.containsKey(givenArr[index])) {
				// increase count of non-unique integers.
				intMap.put(givenArr[index], intMap.get(givenArr[index]) + 1);
			}
			intMap.putIfAbsent(givenArr[index], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
			// add unique integers to response list 
			if (entry.getValue() == 1) {
				response.add(entry.getKey());
			}
		}
		return response;
	}

}
