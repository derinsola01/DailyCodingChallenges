package com.derintester.dailycodingproblems.february2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day189 {
	
	private static Logger logger = LogManager.getLogger(Day189.class);

	public static void main(String[] args) {
		int[] givenArr = {5, 1, 3, 5, 2, 3, 4, 1, 5, 2, 1};
		List<Integer> returnArr = longestSubArray(givenArr);
		logger.debug("returnArr holds\t" + returnArr);
	}

	private static List<Integer> longestSubArray(int[] givenArr) {
		List<Integer> returnList = new ArrayList<Integer>();
		Map<Integer, List<Integer>> listHolder = new HashMap<Integer, List<Integer>>();
		for(int index = 0; index < givenArr.length; index++) {
			if(returnList.size() == 0) {
				returnList.add(givenArr[index]);
			}
			
			if (returnList.contains(givenArr[index])) {
				List<Integer> tempListHolder = new ArrayList<Integer>();
				int listSize = returnList.size();
				tempListHolder.addAll(returnList);
				listHolder.putIfAbsent(listSize, tempListHolder);
				returnList.clear();
				returnList.add(givenArr[index]);
				continue;
			}
			
			returnList.add(givenArr[index]);
		}
		
		List<Integer> tempListHolder = new ArrayList<Integer>();
		int listSize = returnList.size();
		tempListHolder.addAll(returnList);
		listHolder.putIfAbsent(listSize, tempListHolder);
		
		Set<Integer> keySet = listHolder.keySet();
		int maxKey = 0;
		for(Integer key : keySet) {
			maxKey = (maxKey > key) ? maxKey : key;
		}
		
		for(Map.Entry<Integer, List<Integer>> list : listHolder.entrySet()) {
			logger.debug("list Key holds\t" + list.getKey() + "\tlist value holds\t" + list.getValue());
		}
		logger.debug("maxKey is\t\t" + maxKey);
		return listHolder.get(maxKey);
	}

}
