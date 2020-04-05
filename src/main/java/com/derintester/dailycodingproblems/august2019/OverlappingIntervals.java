package com.derintester.dailycodingproblems.august2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OverlappingIntervals {
	
	public static final Logger logger = LogManager.getLogger(OverlappingIntervals.class);

	public static void main(String[] args) {
//        Integer[][] unitSet = {{6,8}, {1,9}, {2,4}, {4,7}};
//		Integer[][] unitSet = {{1,3}, {2,4}, {5,7}, {6,8}, {9,11}, {10,12}};
		Integer[][] unitSet = {{30,75}, {0,50}, {60,150}};
        List<Integer[]> unitSetList = Arrays.asList(unitSet);
        List<List<Integer>> unitSetFinal = new ArrayList<List<Integer>>();
        
        for (Integer[] mm : unitSetList) {
        	List<Integer> tempList = Arrays.asList(mm);
        	unitSetFinal.add(tempList);
        }
//        Collections.sort(unitSetFinal, Comparator.naturalOrder());
        logger.debug("unitSetFinal is: " + unitSetFinal);
		int arrLen = unitSet.length;
		List<Integer> intNum1 = new ArrayList<Integer>();
		List<List<Integer>> intNum2 = new ArrayList<List<Integer>>();
		for(int count = 0; count < arrLen - 1; count++) {
			if(unitSet[count][1] >= unitSet[count+1][0]) {
				Integer[] aa =  {unitSet[count][0], unitSet[count+1][1]};
				intNum1 = Arrays.asList(aa);
				intNum2.add(intNum1);
			}
		}
		logger.debug("intNum2 holds:\t" + intNum2);
	}

}
