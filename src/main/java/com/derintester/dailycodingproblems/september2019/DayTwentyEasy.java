package com.derintester.dailycodingproblems.september2019;

import java.util.LinkedList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question:
 * Given two singly linked lists that intersect at some point, 
 * find the intersecting node. The lists are non-cyclical.
 * 
 * For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, 
 * return the node with value 8.
 *
 */
public class DayTwentyEasy {
	
	private static final Logger logger = LogManager.getLogger(DayTwentyEasy.class);

	public static void main(String[] args) {
		logger.debug("Day 20");
		
//		{99,1,8,10,11,12,15,2,32,1};
		int[] arr1 = {99,1,8,10,11,12,15,2,32,1};
		int[] arr2 = {3,7,8,10,12,13,5};
		
		LinkedList<Integer> list1 = populateLinkedList(arr1);
		LinkedList<Integer> list2 = populateLinkedList(arr2);
		
		int sameNum = 0;
		if (list1.size() == list2.size()) {
			for (int index = 0; index < list1.size(); index++) {
				if(list1.get(index) == list2.get(index)) {
					sameNum = list1.get(index);
					break;
				}
			}
		} else {
			LinkedList<Integer> greaterList = (list1.size() > list2.size()) ? list1 : list2;
			LinkedList<Integer> lesserList = (greaterList.equals(list2)) ? list1 : list2;
			int diff = greaterList.size() - lesserList.size();
			logger.debug("greaterList holds:\t" + greaterList);
			logger.debug("lesserList holds:\t" + lesserList);
			logger.debug("diff holds:\t" + diff);
		}
		logger.debug("sameNum holds:\t" + sameNum);
		
		
//		if(list1.size() > list2.size()) {
//			int diff = Math.abs(list1.size() - list2.size());
//			for (int index = 0; index < list2.size(); index++) {
//				if(list1.get(index + diff) == list2.get(index)) {
//					sameNum = list2.get(index);
//					logger.debug("if(list1.size() > list2.size()) called");
//					break;
//				}
//			}
//		} 
//		else if (list2.size() < list1.size()) {
//			int diff = Math.abs(list2.size() - list1.size());
//			for (int index = 0; index < list1.size(); index++) {
//				if(list1.get(index) == list2.get(index + diff)) {
//					sameNum = list1.get(index);
//					logger.debug("else if(list2.size() < list1.size()) called");
//					break;
//				}
//			}
//		} 
//		else {
//			
//		}
		
//		int arr1Length = arr1.length;
//		int arr2Length = arr2.length;
//		
//		for(int index = 0; index < arr1Length; index++) {
//			list1.add(arr1[index]);
//		}
//		
//		for(int index = 0; index < arr2Length; index++) {
//			list2.add(arr2[index]);
//		}
//		
//		int sameNum = 0;
//		if (arr1Length == arr2Length) {
//			for (int index = 0; index < arr1Length; index++) {
//				if(list1.get(index) == list2.get(index)) {
//					sameNum = list1.get(index);
//					break;
//				}
//			}
//		} else {
//			int diff = Math.abs(arr1Length - arr2Length);
//			logger.debug("diff holds:\t" + diff);
//		}
		
		
		
	}
	
	private static LinkedList<Integer> populateLinkedList(int[] givenArray){
		LinkedList<Integer> returnList = new LinkedList<Integer>();
		for(int index = 0; index < givenArray.length; index++) {
			returnList.add(givenArray[index]);
		}
		return returnList;
	}

}
