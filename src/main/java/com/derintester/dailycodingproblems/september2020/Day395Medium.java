package com.derintester.dailycodingproblems.september2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day395Medium {
	
	private static final Logger logger = LogManager.getLogger(Day395Medium.class);

	public static void main(String[] args) {
		String[] givenArr = {"eat", "ate", "apt", "pat", "tea", "now"};
		List<List<String>> returnedList = groupAnagrams(givenArr);
		logger.debug("returnedList holds: {}", returnedList);
	}

	private static List<List<String>> groupAnagrams(String[] givenArr) {
		List<List<String>> returnList = new ArrayList<List<String>>();
		if (givenArr == null || givenArr.length == 0) {
			return returnList;
		}
		
		Map <String, List<String>> anagramMap = new HashMap<String, List<String>>();
		for (int index = 0; index < givenArr.length; index++) {
			char[] charHolder = givenArr[index].toCharArray();
			Arrays.sort(charHolder);
			String sortedStringHolder = new String(charHolder);
			anagramMap.putIfAbsent(sortedStringHolder, new ArrayList<String>());
			List<String> tempListHolder = anagramMap.get(sortedStringHolder);
			tempListHolder.add(givenArr[index]);
			anagramMap.put(sortedStringHolder, tempListHolder);
		}
		
		for(Map.Entry<String, List<String>> entrySet : anagramMap.entrySet()) {
			returnList.add(entrySet.getValue());
		}
		
		return returnList;
	}

}
