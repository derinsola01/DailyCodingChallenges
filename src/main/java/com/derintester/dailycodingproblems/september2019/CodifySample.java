package com.derintester.dailycodingproblems.september2019;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CodifySample {
	
	private static final Logger logger = LogManager.getLogger(CodifySample.class);
	
	public static void main(String[] args) {
//		int[] arr = {1, 3, 6, 4, 1, 2};
//		int[] arr = {1, 3, 2};
		int[] arr = {-1, -3};
		int result = solution(arr);
		logger.debug("retNum holds:\t" + result);
	}
	
	private static int solution(int[] A) {
		Set<Integer> integerSet = new HashSet<>();
		for (int index = 0; index < A.length; index++) {
		    if (A[index] > 0) {
		    	integerSet.add(A[index]);
		    }
		}
		
		for (int index2 = 1; index2 <= A.length + 2; index2++) {
		    if (!integerSet.contains(index2)) {
		        return index2;
		    }
		}
		
		return 0;
	}

}
