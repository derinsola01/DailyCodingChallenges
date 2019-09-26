package com.derintester.dailycodingproblems.august2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HackerrankReview {

	private static final Logger logger = LogManager.getLogger(HackerrankReview.class);
	
	public static void main(String[] args) {
		logger.debug("Enter the Number of words below...");
		Scanner num = new Scanner(System.in); 
		Integer number = num.nextInt();
		num.close();
		logger.debug("Enter a new word on a new line. No spaces.");
		Scanner str = new Scanner(System.in);
		str.close();
		List<String> inputString = new ArrayList<String>();
		for(int i = 0; i < number; i++) {
			inputString.add(str.nextLine());
		}
		List<String> returnString = new ArrayList<String>();
		for (String aaa: inputString) {
			returnString.add(modifyString(aaa));
		}
		logger.debug("returnString now holds:\t" + returnString);
		for (String bbb: returnString) {
			logger.debug(bbb);
		}
        
	}

	private static String modifyString(String firstString) {
		char[] charString = firstString.toCharArray();
		String returnString = "";
		String tempHolder1 = "";
		String tempHolder2 = "";
		for (int i = 0; i < charString.length; i++) {
			if (i % 2 == 0) {
				tempHolder1 += charString[i];
			} else {
				tempHolder2 += charString[i];
			}
		}
		returnString = tempHolder1 + " " + tempHolder2;
		return returnString;
	}

}
