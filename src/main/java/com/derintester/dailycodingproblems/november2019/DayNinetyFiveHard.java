package com.derintester.dailycodingproblems.november2019;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayNinetyFiveHard {
	
	private static final Logger logger = LogManager.getLogger(DayNinetyFiveHard.class);

	public static void main(String[] args) {
		ArrayList<Integer> givenList = new ArrayList<Integer>();
		givenList.add(1);
		givenList.add(2);
		givenList.add(3);
		givenList.add(4);
//		givenList.add(5);
		
//		logger.debug("givenList is:\t" + givenList);
		List<Integer> permList = getNextPermutation(givenList);
//		logger.debug("permList is:\t" + permList);
	}

	private static List<Integer> getNextPermutation(List<Integer> givenList) {
		List<Integer> returnList = new ArrayList<Integer>();
		List<List<Integer>> permutationsList = getPermutationList(givenList);
		for(List<Integer> item : permutationsList) {
			logger.debug("Gotten the correct perm List, it holds:\t" + item);
		}
		
		return returnList;
	}

	private static List<List<Integer>> getPermutationList(List<Integer> givenList) {
		List<List<Integer>> returnPermList = new ArrayList<List<Integer>>();
		int listSize = givenList.size();
		for(int currentNumberIndex = 0; currentNumberIndex < listSize; currentNumberIndex++) {
			List<Integer> tempListHolder = new ArrayList<Integer>(givenList);
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(givenList.get(currentNumberIndex));
			tempListHolder.remove(currentNumberIndex);
			int tempListSize = tempListHolder.size();
			int[] numArr = new int[tempListSize];
			for(int i = 0; i < tempListSize; i++) {
				numArr[i] = tempListHolder.get(i);
				temp.add(numArr[i]);
			}
			returnPermList.add(temp);
			int numOfRotations = tempListSize - 1;
			for (int i = 0; i < numOfRotations; i++) {
				numArr = rotateNumberArray(numArr).clone();
				List<Integer> temp1 = new ArrayList<Integer>();
				temp1.add(givenList.get(currentNumberIndex));
				for(int ii = 0; ii < tempListSize; ii++) {
					temp1.add(numArr[ii]);
				}
				returnPermList.add(temp1);
			}
			
		}
		return returnPermList;
	}

	private static int[] rotateNumberArray(int[] numArr) {
		int[] holder = new int[numArr.length];
		for (int index = 0; index < numArr.length; index++) {
			int tempPos = ((index % numArr.length) + 1);
			int position = (tempPos < numArr.length) ? tempPos : tempPos % numArr.length;
			holder[position] = numArr[index];
		}
		return holder;
	}

}
