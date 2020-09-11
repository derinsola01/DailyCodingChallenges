package com.derintester.dailycodingproblems.september2020;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighestCharFrequency {
	
	private static final Logger logger = LogManager.getLogger(HighestCharFrequency.class);

	public static void main(String[] args) {
		String word = "bbadddeefe";
		char highestChar = getCharWithHighestFrequency(word);
		logger.debug("highestChar is: {}", highestChar);
	}

	private static char getCharWithHighestFrequency(String word) {
		int highestFrequency = 0;
		char responseChar = 0;
		
		if(word == null || word.length() == 0) {
			return responseChar;
		}
		
		char[] charArr = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		highestFrequency = 1;
		responseChar = charArr[0];
		for(int index = 0; index < charArr.length; index++) {
			if(charMap.get(charArr[index]) != null) {
				charMap.put(charArr[index], charMap.get(charArr[index]) + 1);
				if (charMap.get(charArr[index])  > highestFrequency) {
					highestFrequency = charMap.get(charArr[index]);
					responseChar = charArr[index];
				}
			}
			charMap.putIfAbsent(charArr[index], 1);
		}
		
		logger.debug("highestFrequency is: {}, and first occurence is: {}", highestFrequency, responseChar);
		return responseChar;
	}

}
