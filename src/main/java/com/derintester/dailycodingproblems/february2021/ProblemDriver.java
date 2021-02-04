package com.derintester.dailycodingproblems.february2021;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProblemDriver {
	
	private static final Logger logger = LogManager.getLogger(ProblemDriver.class);
	
	public static void main(String args []) {
		String input = "  aaaa  bbbcca";
		List<ClassHolder> listResponse = computeNumberOfCharsList(input);
		String stringResponse = computeNumberOfCharsString(input);
		logger.info("listResponse holds: {}", listResponse);
		logger.info("stringResponse holds: {}", stringResponse);
	}

	private static String computeNumberOfCharsString(String input) {
		if(input == null || input.trim().length() == 0) {
			return null;
		}
		char[] charArray = input.toCharArray();
		int countHolder = 1;
		char previousValue = charArray[0];
		String response = "";
		if(charArray.length == 1) {
			String responseInput = String.valueOf(previousValue) + countHolder + "";
			response = response + responseInput;
		}
		if(charArray.length > 1) {
			for(int index = 1; index < charArray.length; index++) {
				if(previousValue == charArray[index]) {
					countHolder +=1;
				} else {
					String responseInput = String.valueOf(previousValue) + countHolder + "";
					response = response + responseInput;
					previousValue = (index == (charArray.length - 1)) ? previousValue : charArray[index];
					countHolder = 1;
				}
				if((index == (charArray.length - 1)) && previousValue != charArray[index]) {
					String responseInput = String.valueOf(charArray[index]) + countHolder + "";
					response = response + responseInput;
				}
			}
		}
		return response;
	}

	private static List<ClassHolder> computeNumberOfCharsList(String input) {
		if(input == null || input.trim().length() == 0) {
			return null;
		}
		char[] charArray = input.toCharArray();
		int countHolder = 1;
		char previousValue = charArray[0];
		List<ClassHolder> response = new ArrayList<ClassHolder>();
		if(charArray.length == 1) {
			ClassHolder responseInput = new ClassHolder(previousValue, countHolder);
			response.add(responseInput);
		}
		if(charArray.length > 1) {
			for(int index = 1; index < charArray.length; index++) {
				if(previousValue == charArray[index]) {
					countHolder +=1;
				} else {
					ClassHolder responseInput = new ClassHolder(previousValue, countHolder);
					response.add(responseInput);
					previousValue = (index == (charArray.length - 1)) ? previousValue : charArray[index];
					countHolder = 1;
				}
				if((index == (charArray.length - 1)) && previousValue != charArray[index]) {
					ClassHolder responseInput = new ClassHolder(charArray[index], countHolder);
					response.add(responseInput);
				}
			}
		}
		return response;
	}

}
