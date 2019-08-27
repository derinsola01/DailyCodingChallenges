package com.derintester.dailycodingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DaySevenMedium {

	private static final Logger logger = LogManager.getLogger(DaySevenMedium.class);
	
	/**
	 * @param args
	 * 
	 * Question:
	 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
	 * count the number of ways it can be decoded.
	 * 
	 * For example, the message '111' would give 3,
	 * since it could be decoded as 'aaa', 'ka', and 'ak'.
	 * 
	 * You can assume that the messages are decodable.
	 * For example, '001' is not allowed.
	 */
	
	public static void main(String[] args) {
		Map<Character, Integer> loadMap = loadAlphabetMap();
		int[] splitWays = {1,2};
//		String givenNumber = "001";
//		String givenNumber = "111";
//		String givenNumber = "10";
//		String givenNumber = "01";
//		String givenNumber = "4441";
		String givenNumber = "42612341";
		char[] numStringArr = givenNumber.toCharArray();
		List<String> stringArr = getSingleElementsOfNumber(numStringArr);
		int numWays = verifyNumberOfWaysToDecode(splitWays, givenNumber, stringArr);
		logger.debug("numWays is:\t" + numWays);
	}

	private static int verifyNumberOfWaysToDecode(int[] splitWays, String numString, List<String> stringArr) {
		int numOfWaysToDecode = -1;
		int charArrayLength = numString.toCharArray().length;
		if(charArrayLength == 2) {
			if(!numString.startsWith("0")) {
				numOfWaysToDecode = decodeMessage(charArrayLength - 1, splitWays);
			} else {
				numOfWaysToDecode = 0;
			}
		}
		else if (stringArr.contains("0")) {
			numOfWaysToDecode = 0;
		} else {
			numOfWaysToDecode = decodeMessage(charArrayLength, splitWays);
		}
		return numOfWaysToDecode;
	}
	
	private static List<String> getSingleElementsOfNumber(char[] numStringArr) {
		List<String> stringArr = new ArrayList<String>();
		for (char aa : numStringArr) {
			String abbey = Character.toString(aa);
			stringArr.add(abbey);
		}
		return stringArr;
	}
	
	private static int decodeMessage(int number, int[] splitWays) {
		int numOfWays = 0;
		if (number < 0) {
			return numOfWays = 0;
		} else if (number == 0) {
			return numOfWays = 1;
		} else {
			  for(int i = 0; i < splitWays.length; i++) {
				  numOfWays += decodeMessage(number - splitWays[i], splitWays);
			  }
			  return numOfWays;
		}
	}
	private static Map<Character, Integer> loadAlphabetMap() {
		Map<Character, Integer> loadedMap = new HashMap<Character, Integer>();
		char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for(int num = 0; num < alphabets.length; num++) {
			loadedMap.put(alphabets[num], num + 1);
		}
		return loadedMap;
	}

}
