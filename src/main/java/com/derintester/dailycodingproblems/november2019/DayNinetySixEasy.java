package com.derintester.dailycodingproblems.november2019;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayNinetySixEasy {
	
	private static final Logger logger = LogManager.getLogger(DayNinetyFiveHard.class);

	public static void main(String[] args) {
		List<Integer> givenList = new ArrayList<Integer>();
		givenList.add(1);
		givenList.add(2);
		givenList.add(3);
		givenList.add(4);
		givenList.add(5);
		List<List<Integer>> permList = getPermutations(givenList);
		logger.debug("permList now holds:\t" + permList);
	}

	private static List<List<Integer>> getPermutations(List<Integer> givenList) {
		int numOfPermutations = getNumOfPermutations(givenList.size());
		List<List<Integer>> permutationList = new ArrayList<List<Integer>>();
		List<Integer> tempListHolder = new ArrayList<Integer>();
		for (int index = 0; index <givenList.size(); index++) {
			
		}
		logger.debug("numOfPermutations is:\t" + numOfPermutations);
		return null;
	}

	private static int getNumOfPermutations(int size) {
		if (size <= 1)
			return 1;
		else
			return size * getNumOfPermutations(size - 1);
	}

}
