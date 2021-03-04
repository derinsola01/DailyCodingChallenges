package com.derintester.dailycodingproblems.december2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShortestWordDistance {
	
	private static final Logger logger = LogManager.getLogger(ShortestWordDistance.class);

	public static void main(String[] args) {
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "practice";
		String word2 = "coding";
		int distance = shortestDistance(words, word1, word2);
		logger.debug("distance returned is: {}", distance);
	}
	
	public static int shortestDistance(String[] words, String word1, String word2) {
        
        int distance = -1;
        if (words == null || words.length == 0){
            return distance;
        }
        
        int firstWordIndex = -1;
        int secondWordIndex = -1;
        for (int index = 0; index < words.length; index++){
            if (word1.equals(words[index])){
                firstWordIndex = index;
                if(secondWordIndex != -1){
                	distance = CalculateDistance(distance, firstWordIndex, secondWordIndex);
                	
                }
            }
            if (word2.equals(words[index])){
                secondWordIndex = index;
                if(firstWordIndex != -1){
                	distance = CalculateDistance(distance, firstWordIndex, secondWordIndex);
                }
            }
        }
        return distance;
    }

	private static int CalculateDistance(int distance, int firstWordIndex, int secondWordIndex) {
		int tempDistance = (Math.abs(secondWordIndex - firstWordIndex));
        distance = (tempDistance > distance && distance != -1) ? 
            distance : tempDistance;
		return distance;
	}

}
