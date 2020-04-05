package com.derintester.dailycodingproblems.august2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SalesTaxCalculator {
	
	public static final Logger logger = LogManager.getLogger(PreviewCodingChallenge.class);

	public static void main(String[] args) {
		String input1 = "1 book at 12.49";
		String input2 = "1 music CD at 16.49";
		String input3 = "1 chocolate bar at 0.85";
		List<String> orderedGoods = new ArrayList<String>();
		Map<String, Float> mapToPrint = new HashMap<String, Float>();
		orderedGoods.add(input1);
		orderedGoods.add(input2);
		orderedGoods.add(input3);
		mapToPrint = tokenizeInput(orderedGoods);
		printReceipt(mapToPrint);
	}

	private static void printReceipt(Map<String, Float> mapToPrint) {
		for (Map.Entry<String,Float> entry : mapToPrint.entrySet())  
			logger.debug(entry.getKey() + ": " + entry.getValue()); 
	}

	private static Map<String, Float> tokenizeInput(List<String> inputString) {
		Map<String, Float> mappedGoods = new HashMap<String, Float>();
		for(String stringLine: inputString) {
			String [] arrOfStr = stringLine.split(" at "); 
			Map<String, Float> tempHolder =  mapStringToLong(arrOfStr);
			mappedGoods.putAll(tempHolder);
		}
		
//		Float totalSalesTaxHolder = calculateSalesTax(mappedGoods);
		Float totalAmountHolder =  calculateTotalAmount(mappedGoods);
		mappedGoods.put("Total", totalAmountHolder);
		
		return mappedGoods;
	}

//	private static Float calculateSalesTax(Map<String, Float> mappedGoods) {
//		Float totalAmount = 0.00f;
//		for (Map.Entry<String,Float> entry : mappedGoods.entrySet()) { 
//			totalAmount += entry.getValue();
//		}
//		return totalAmount;
//	}

	private static Float calculateTotalAmount(Map<String, Float> mappedGoods) {
		Float totalAmount = 0.00f;
		for (Map.Entry<String,Float> entry : mappedGoods.entrySet()) { 
			totalAmount += entry.getValue();
		}
		return totalAmount;
	}

	private static Map<String, Float> mapStringToLong(String[] arrOfStr) {
		Map<String, Float> returnMap = new HashMap<String, Float>();
		String arrKey = arrOfStr[0];
		float arrValue = Float.parseFloat(arrOfStr[1]);
		returnMap.put(arrKey, arrValue);
		return returnMap;
	}
	

}
