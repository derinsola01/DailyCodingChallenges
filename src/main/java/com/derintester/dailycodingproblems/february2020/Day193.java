package com.derintester.dailycodingproblems.february2020;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Day193 {
	
	private static Logger logger = LogManager.getLogger(Day193.class);

	public static void main(String[] args) {
		int[] stockPrices = {1, 3, 2, 8, 4, 10};
		int fee = 2;
		int maxProfit = getMaxProfit(stockPrices, fee);
		logger.debug("maxProfit is:\t" + maxProfit);
	}

	private static int getMaxProfit(int[] stockPrices, int fee) {
		int maxProfit = 0;
		int limit = stockPrices.length - 1;
		Map<Integer, Integer> priceDiffs = new HashMap<Integer, Integer>();
		int initElem = -1;
		if(limit + 1 > 2) {
			initElem = (stockPrices[0] > stockPrices[1]) ? 1 : 0;
		}
		int tempProfitHolder = 0;
		for(int index = initElem; index < limit; index++) {
			if (index == 0) {
				
			}
			
//			if (index != limit) {
//				priceDiffs.put(stockPrices[index], stockPrices[index + 1] - stockPrices[index]);
//			}
		}
		
		for(Map.Entry<Integer, Integer> map : priceDiffs.entrySet()) {
			logger.debug("map.key is:\t" + map.getKey() + " whilst map.value is:\t" + map.getValue());
		}
		return maxProfit;
	}

}
