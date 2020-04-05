package com.derintester.dailycodingproblems.september2019;

import java.util.Arrays;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Question:
 * Given a stream of elements too large to store in memory, 
 * pick a random element from the stream with uniform probability.
 * 
 * Found this already implemented on geeksforgeeks website here:
 * https://www.geeksforgeeks.org/reservoir-sampling/ the algorithm is called - 
 * reservoir sampling. Also, here is a stack overflow link if you want more info:
 * https://stackoverflow.com/questions/23351918/select-an-element-from-a-stream-with-uniform-distributed-probability
 *
 */
public class DayFifteenMedium {
	
	public static final Logger logger = LogManager.getLogger(DayFifteenMedium.class);

	// A function to randomly select k items from stream[0..n-1]. 
    static void selectKItems(int stream[], int n, int k) 
    { 
        int i;   // index for elements in stream[] 
          
        // reservoir[] is the output array. Initialize it with 
        // first k elements from stream[] 
        int reservoir[] = new int[k]; 
        for (i = 0; i < k; i++) 
            reservoir[i] = stream[i]; 
          
        Random r = new Random(); 
          
        // Iterate from the (k+1)th element to nth element 
        for (; i < n; i++) 
        { 
            // Pick a random index from 0 to i. 
            int j = r.nextInt(i + 1); 
              
            // If the randomly  picked index is smaller than k, 
            // then replace the element present at the index 
            // with new element from stream 
            if(j < k) 
                reservoir[j] = stream[i];             
        } 
          
        logger.debug("Following are k randomly selected items"); 
        logger.debug(Arrays.toString(reservoir)); 
    } 
      
    //Driver Program to test above method 
    public static void main(String[] args) { 
        int stream[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 
        int n = stream.length; 
        int k = 5; 
        selectKItems(stream, n, k); 
    } 

}