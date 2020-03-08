package com.derintester.dailycodingproblems;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question: 
 * 
 * A company has employed N developers (numbered from 0 to N−1) and wants to divide them 
 * into two teams. The first is a front-end team with F developers. 
 * The second is a back-end team with N−F developers. If the K-th developer is 
 * assigned to the front-end team then their contribution is A[K], 
 * and if they are assigned to the back-end team then their contribution is B[K]. 
 * What is the maximum sum of contributions the company can achieve?
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A, int[] B, int F); }
 * 
 * that, given two arrays A, B (consisting of N integers each) and the integer F, 
 * returns the maximum sum of contributions the company can achieve.
 * 
 * Examples:
 * 
 * 1. Given A = [4, 2, 1], B = [2, 5, 3] and F = 2, the function should return 10. 
 * There should be two front-end developers and one back-end developer. 
 * The 0th and 2nd developers should be assigned to the front-end team 
 * (with contributions 4 and 1) and the 1st developer should be assigned to the 
 * back-end team (with contribution 5).
 * 
 * 2. Given A = [7, 1, 4, 4], B = [5, 3, 4, 3] and F = 2, 
 * the function should return 18. The 0th and 3rd developers should be 
 * assigned to the front-end team and the 1st and 2nd developers should be 
 * assigned to the back-end team.
 * 
 * 3. Given A = [5, 5, 5], B = [5, 5, 5] and F = 1, the function should return 15. 
 * The 0th developer can be assigned to the front-end team and the 1st and 2nd 
 * developers can be assigned to the back-end team.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..200,000];
 * arrays A and B have equal lengths;
 * each element of array A is an integer within the range [0..1,000];
 * F is an integer within the range [0..N].
 *
 */
public class Zirconium2019 {
	
	private static final Logger logger = LogManager.getLogger(Zirconium2019.class);

	public static void main(String[] args) {
		int[] developers = {4, 2, 1};
		int[] devContribution = {2, 5, 3};
		int maxFrontEndDev = 2;
		int summation = getDeveloperContributionSum(developers, devContribution, 
				maxFrontEndDev);
		boolean range = sizeOfArray(developers);
		boolean arrayLengths = equalArraySize(developers, devContribution);
		boolean arrayElement = getArrayElement(developers);
		boolean maxNumRange = frontEndDevRange(developers.length, maxFrontEndDev);
		boolean finalResult = verifyAssumptions(range, arrayLengths, arrayElement, maxNumRange);
//		logger.debug("range holds:\t" + range);
//		logger.debug("arrayLengths holds:\t" + arrayLengths);
//		logger.debug("arrayElement holds:\t" + arrayElement);
//		logger.debug("maxNumRange holds:\t" + maxNumRange);
		logger.debug("finalResult holds:\t" + finalResult);
		logger.debug("summation holds:\t" + summation);
	}

	private static boolean verifyAssumptions(boolean range, boolean arrayLengths, boolean arrayElement,
			boolean maxNumRange) {
		boolean finalResult = false;
		if(range && arrayLengths && arrayElement && maxNumRange) {
			finalResult = true;
		}
		return finalResult;
	}

	private static boolean frontEndDevRange(int length, int maxFrontEndDev) {
		boolean result = false;
		if(maxFrontEndDev >= 0 && maxFrontEndDev <= length) {
			result = true;
		}
		return result;
	}

	private static boolean getArrayElement(int[] developers) {
		boolean result = true;
		for(int i = 0; i < developers.length; i++) {
			if (!(developers[i] >= 0 && developers[i] <= 1000)) {
				return result = false;
			}
		}
		return result;
	}

	private static boolean equalArraySize(int[] developers, int[] devContribution) {
		boolean result = false;
		if (developers.length == devContribution.length) {
			result = true;
		}
		return result;
	}

	private static boolean sizeOfArray(int[] developers) {
		boolean result = false;
		if(developers.length >= 1 && developers.length <= 200000) {
			result = true;
		}
		return result;
	}

	private static int getDeveloperContributionSum(int[] developers, int[] devContribution, 
			int maxFrontEndDev) {
		int result = 0;
		for (int i = 0; i < devContribution.length; i++) {
			result += devContribution[i];
		}
		return result;
	}

}
