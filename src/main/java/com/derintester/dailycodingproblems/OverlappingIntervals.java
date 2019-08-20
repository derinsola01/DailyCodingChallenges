package com.derintester.dailycodingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class OverlappingIntervals {
	
	public static final Logger logger = LogManager.getLogger(OverlappingIntervals.class);

	public static void main(String[] args) {
//        Integer[][] unitSet = {{6,8}, {1,9}, {2,4}, {4,7}};
		Integer[][] unitSet = {{1,3}, {2,4}, {5,7}, {6,8}, {9,11}, {10,12}};
        List<Integer[]> unitSetList = Arrays.asList(unitSet);
        
        List<List<Integer>> unitSetFinal = new ArrayList<List<Integer>>(); 
        for (Integer[] mm : unitSetList) {
        	List<Integer> tempList = Arrays.asList(mm);
        	unitSetFinal.add(tempList);
        }
//        Collections.sort((List<Integer>) unitSetFinal);
        logger.debug("unitSetList is: " + unitSetList);
        logger.debug("unitSetFinal is: " + unitSetFinal);
		int arrLen = unitSet.length;
		List<Integer> intNum1 = new ArrayList<Integer>();
		List<List<Integer>> intNum2 = new ArrayList<List<Integer>>();
		int count = 0;
		while (count <= arrLen) {
			if(count+1 == arrLen) {
				break;
			} else if(unitSet[count][1] >= unitSet[count+1][0]) {
				Integer[] aa =  {unitSet[count][0], unitSet[count+1][1]};
				intNum1 = Arrays.asList(aa);
				intNum2.add(intNum1);
			}
			count++;
		}
		logger.debug("intNum2 holds:\t" + intNum2);
	}

}
