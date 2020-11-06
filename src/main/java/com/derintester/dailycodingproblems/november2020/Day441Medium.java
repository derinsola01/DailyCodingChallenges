package com.derintester.dailycodingproblems.november2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day441Medium {
	
	private static final Logger logger = LogManager.getLogger(Day441Medium.class);

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst = Arrays.asList(9, 12, 3, 5, 14, 10, 10);
		int pivot = 10;
		List<Integer> partitions = getPartitions(lst, pivot);
		logger.debug("partitions holds: {}", partitions);
	}

	private static List<Integer> getPartitions(List<Integer> lst, int pivot) {
		List<Integer> result = null;
		if (lst == null || lst.size() == 0) {
			return result;
		}
		List<Integer> lessThanPivot = new ArrayList<Integer>();
		List<Integer> equalToPivot = new ArrayList<Integer>();
		List<Integer> greaterThanPivot = new ArrayList<Integer>();
		
		for (int index = 0; index < lst.size(); index++) {
			if(lst.get(index) < pivot) {
				lessThanPivot.add(lst.get(index));
			} else if (lst.get(index) > pivot) {
				greaterThanPivot.add(lst.get(index));
			} else {
				equalToPivot.add(lst.get(index));
			}
		}

		result = new ArrayList<Integer>(lessThanPivot);
		result.addAll(equalToPivot);
		result.addAll(greaterThanPivot);
		return result;
	}

}
