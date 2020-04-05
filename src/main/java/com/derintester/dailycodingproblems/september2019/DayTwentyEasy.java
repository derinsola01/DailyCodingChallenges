package com.derintester.dailycodingproblems.september2019;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
 * If returned answer is -1, then the linked list did not intersect.
 *
 */
public class DayTwentyEasy {
	
	private static final Logger logger = LogManager.getLogger(DayTwentyEasy.class);

	public static void main(String[] args) {
//		int[] arr1 = {3,12,7,10,12,13,5};
//		int[] arr2 = {99,1,8,10,12,12,15,2,32,1};
		int[] arr1 = {3,7,8,10};
		int[] arr2 = {99,1,8,10};
		
		LinkedList<Integer> list1 = populateLinkedList(arr1);
		LinkedList<Integer> list2 = populateLinkedList(arr2);
		
		int intersectionNum = getListIntersection(list1, list2);
		logger.debug("intersectionNum is:\t" + intersectionNum);
		
	}

	private static int getListIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		int intersectionNum = -1;
		if (list1.size() == list2.size()) {
			for (int index = 0; index < list1.size(); index++) {
				if(list1.get(index) == list2.get(index)) {
					intersectionNum = list1.get(index);
					break;
				}
			}
		} else {
			LinkedList<Integer> greaterList = (list1.size() > list2.size()) ? list1 : list2;
			LinkedList<Integer> lesserList = (greaterList.equals(list2)) ? list1 : list2;
			int diff = greaterList.size() - lesserList.size();
			for(int index = 0; index < lesserList.size(); index++) {
				if (lesserList.get(index) == greaterList.get(index + diff)) {
					intersectionNum = lesserList.get(index);
					break;
				}
			}
		}
		return intersectionNum;
	}
	
	private static LinkedList<Integer> populateLinkedList(int[] givenArray){
		LinkedList<Integer> returnList = new LinkedList<Integer>();
		for(int index = 0; index < givenArray.length; index++) {
			returnList.add(givenArray[index]);
		}
		return returnList;
	}

}
