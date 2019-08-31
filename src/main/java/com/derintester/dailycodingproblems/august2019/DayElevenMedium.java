package com.derintester.dailycodingproblems.august2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 * 
 * Question:
 * Implement an auto-complete system. That is, given a query string s and a 
 * set of all possible query strings, return all strings in the set that have s as a prefix.
 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 */
public class DayElevenMedium {
	
	private static final Logger logger = LogManager.getLogger(DayElevenMedium.class);

	public static void main(String[] args) {
		String inputString = "de";
		String[] existingWordArray = {"dog", "deer", "deal"};
		List<String> returnedWords = autocompletedWords(inputString, existingWordArray);
		logger.debug("returnWords now holds:\t" + returnedWords);
	}

	/**
	 * @param inputString
	 * @param existingWordArray
	 * @return List<String>
	 *  linear auto-completion. Solution not optimal.
	 */
	private static List<String> autocompletedWords(String inputString, String[] existingWordArray) {
		List<String> wordsToReturn = new ArrayList<String>();
		Arrays.sort(existingWordArray);
		for(String str : existingWordArray) {
			if(str.startsWith(inputString)) {
				wordsToReturn.add(str);
			}
		}
		return wordsToReturn;
	}

}
