package com.derintester.dailycodingproblems.september2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseVowels {
	
	private static final Logger logger = LogManager.getLogger(ReverseVowels.class);

	public static void main(String[] args) {
		String word = "aaa-bb-cc-dd-ee-ff-g-0-1u";
		String reversedWord = reverseVowel(word);
		logger.debug("Word with reversed vowels is: {}", reversedWord);
	}

	private static String reverseVowel(String word) {
		String reversedWord = "";
		
		if(word == null || word.length() == 0) {
			return reversedWord;
		}
		
		char[] charArr = word.toCharArray();
		List<Character> listVowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		List<Character> wordVowelsBackward = new ArrayList<Character>();
		List<Character> wordVowelsForward = new ArrayList<Character>();
		
		for (int index = 0; index < charArr.length; index++) {
			if (listVowels.contains(Character.toLowerCase(charArr[index]))) {
				wordVowelsForward.add(charArr[index]);
			}
		}
		
		for (int index = charArr.length - 1; index >= 0; index--) {
			if (listVowels.contains(Character.toLowerCase(charArr[index]))) {
				wordVowelsBackward.add(charArr[index]);
			}
		}
		
		for(int index = 0; index < charArr.length; index++) {
			if (listVowels.contains(Character.toLowerCase(charArr[index]))) {
				int counter = wordVowelsForward.indexOf(charArr[index]);
				charArr[index] = wordVowelsBackward.get(counter);
				wordVowelsForward.remove(counter);
				wordVowelsBackward.remove(counter);
			}
		}
		
		logger.debug("charArr now holds: {}", Arrays.toString(charArr));
		
		
		return new String(charArr);
	}

}
