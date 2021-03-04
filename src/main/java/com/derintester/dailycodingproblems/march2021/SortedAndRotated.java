package com.derintester.dailycodingproblems.march2021;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortedAndRotated {
	
	private static final Logger logger = LogManager.getLogger();
	
	public static void main(String args[]) {
//		int[] input = {2,1,3,4};
//		int[] input = {1,2,3,4,5};
//		int[] input = {3,4,5,1,2};
//		int[] input = {3,6,10,1,8,9,9,8,9};
//		int[] input = {3,2,1};
//		int[] input = {6,10,6};
//		int[] input = {2,4,1,3};
//		int[] input = {5,1,2,3,4};
//		int[] input = {5,5,1,2,3,4};
		int[] input = {3,6,10,2,1};
//		int[] input = {5,5,6,6,6,9,1,2};
		boolean valid = check(input);
		System.out.println("valid holds: " + valid);
//		logger.info("valid holds: ", valid);
	}
	
	public static boolean check(int[] nums) {
		int switchModeCount = 0;
		int arrayLength = nums.length;
        for (int index = 0; index < arrayLength; index++) {
            if (nums[index] > nums[(index + 1) % arrayLength]) {
                switchModeCount++;
            }
            if (switchModeCount > 1) {
                return false;
            }
        }
        return true;
    }

}
