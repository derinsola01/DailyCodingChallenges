package com.derintester.dailycodingproblems.september2019;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DayThirtySeven {
	
	private static final Logger logger = LogManager.getLogger(DayThirtySeven.class);

	public static void main(String[] args) {
		int[] givenArray = {1,2,3};
		List<Integer[]> powerSet = getPowerSet(givenArray);
		logger.debug("powerSet holds:\t" + powerSet);
	}

	private static List<Integer[]> getPowerSet(int[] givenArray) {
		List<Integer[]> powerSet = new ArrayList<Integer[]>();
		if (givenArray.length == 0) {
			logger.debug("Empty Array");
		} 
		return powerSet;
	}

}
