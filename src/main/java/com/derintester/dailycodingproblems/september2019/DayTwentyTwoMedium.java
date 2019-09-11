package com.derintester.dailycodingproblems.september2019;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author derin
 *
 * Question:
 * Given a dictionary of words and a string made up of those words (no spaces), 
 * return the original sentence in a list. 
 * If there is more than one possible reconstruction, return any of them. 
 * If there is no possible reconstruction, then return null.
 * 
 * For example, given the set of words 'quick', 'brown', 'the', 'fox', 
 * and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
 * 
 * Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', 
 * and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] 
 * or ['bedbath', 'and', 'beyond'].
 */
public class DayTwentyTwoMedium {
	
	private static final Logger logger = LogManager.getLogger(DayTwentyTwoMedium.class);

	public static void main(String[] args) {
		List<String> givenWords = new ArrayList<>();
//		String[] words = {"quick", "brown", "the", "fox"};
		String[] words = {"bed", "bath", "bedbath", "and", "beyond"};
		for (int i = 0; i < words.length; i++) {
			givenWords.add(words[i]);
		}
//		String givenString = "derinisagoodboy";
//		String givenString = "thequickbrownfox";
		String givenString = "bedbathandbeyond";
		List<String> removeWords = findInputsToRemove(givenWords);
		List<String> returnStrings = returnInputList(givenWords, givenString, removeWords);
		logger.debug("returnStrings holds:\t" + returnStrings);
	}

	private static List<String> returnInputList(List<String> givenWords, String givenString, List<String> removeWords) {
		List<String> returnStrings = new ArrayList<String>();
		for(String word : givenWords) {
			if (givenString.contains(word) && !(removeWords.contains(word))) {
				returnStrings.add(word);
			}
		}
		List<String> listHolder = (returnStrings.size() > 0) ? returnStrings : null;
		return listHolder;
	}

	private static List<String> findInputsToRemove(List<String> givenWords) {
		List<String> removeWords = new ArrayList<String>();
		String[] setArr = givenWords.toArray(new String[givenWords.size()]);
		for (int index = 0; index < setArr.length - 1; index++) {
			String appendWords = setArr[index] + setArr[index + 1];
			if(givenWords.contains(appendWords)) {
				removeWords.add(appendWords);
			}
		}
		return removeWords;
	}

}
