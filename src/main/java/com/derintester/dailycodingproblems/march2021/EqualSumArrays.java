package com.derintester.dailycodingproblems.march2021;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EqualSumArrays {
	
	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		int[] firstArray = {1,2,3,4,5,6};
		int[] secondArray = {1,1,2,2,2,2};
//		int[] firstArray = {1};
//		int[] secondArray = {1,1,1,1,1,1,1};
		int numOfTimes = minOperations(firstArray, secondArray);
		System.out.println("numOfTimes is: " + numOfTimes);
	}
	
	private static int minOperations(int[] nums1, int[] nums2) {
		int nums1Sum = 0;
		int nums2Sum = 0;
		int response = -1;
		
		if (nums1.length > nums2.length) {
			int minSum1 = nums1.length * 1;
			int maxSum2 = nums2.length * 6;
			System.out.println("minSum1 is: " + minSum1 + " whilst maxSum2 is: " + maxSum2);
			if (minSum1 > maxSum2) return -1;
			if (minSum1 == maxSum2) {
				for(int index = 0; index < nums1.length; index++) {
					if (nums1[index] != 1) {
						nums1[index] = 1;
						response = (response == -1) ? 1 : response++ ;
					}
				}
				for(int index = 0; index < nums2.length; index++) {
					if (nums2[index] != 6) {
						nums2[index] = 6;
						response = (response == -1) ? 1 : response++ ;
					}
				}
				System.out.println("nums1 Array now holds: " + Arrays.toString(nums1));
				System.out.println("nums2 Array now holds: " + Arrays.toString(nums2));
			}
//			nums1Sum = getSum(nums1);
//			nums2Sum = getSum(nums1);
		} else if (nums1.length < nums2.length) {
			int maxSum1 = nums1.length * 6;
			int minSum2 = nums2.length * 1;
			System.out.println("maxSum1 is: " + maxSum1 + " whilst minSum2 is: " + minSum2);
			if (minSum2 > maxSum1) return -1;
			if (maxSum1 == minSum2) {
				for(int index = 0; index < nums1.length; index++) {
					if (nums1[index] != 6) {
						nums1[index] = 6;
						response = (response == -1) ? 1 : response++ ;
					}
				}
				for(int index = 0; index < nums2.length; index++) {
					if (nums2[index] != 1) {
						nums2[index] = 1;
						response = (response == -1) ? 1 : response++ ;
					}
				}
				System.out.println("nums1 Array now holds: " + Arrays.toString(nums1));
				System.out.println("nums2 Array now holds: " + Arrays.toString(nums2));
			}
		} else {
//			Arrays.
//			for(int index = 0; index < nums1.length; index++) {
				nums1Sum = getSum(nums1);
				nums2Sum = getSum(nums1);
//			}
		}
//		int avg = nums1Sum / nums2Sum;
//		System.out.println("nums1Sum is: " + nums1Sum);
//		System.out.println("nums2Sum is: " + nums2Sum);
//		System.out.println("avg is: " + avg);
//		int num = new Random().nextInt(2) + 5;
		
        return response;
		
		
//		if(nums1.length > nums2.length * 6 || nums2.length > nums1.length * 6) 
//			return -1;
//		int sum1=0, sum2 =0, operations = 0;
//		for(int i: nums2) sum2+=i;
//		for(int i: nums1) sum1+=i;
//		if(sum1>sum2) {
//			int[] temp = nums1;
//			nums1= nums2;
//			nums2 = temp;
//
//			int tempSum = sum1;
//			sum1 = sum2;
//			sum2 = tempSum;
//		}
//		PriorityQueue<Integer> pq1 = new PriorityQueue<>(), pq2 = new PriorityQueue<>((x,y)->y-x);
//		for(int i:nums1) pq1.offer(i);
//		for(int i:nums2) pq2.offer(i);
//
//		for(;sum1 < sum2;operations++)
//			if(pq2.isEmpty() || pq2.peek() - 1 < 6 - pq1.peek())
//				sum1 += 6 - pq1.poll();
//			else
//				sum2 -= pq2.poll() - 1;
//		System.out.println("sum1 is: " + sum1 + " sum2 is: " + sum2);
//		return operations;
    }
	
	private static int getSum(int[] arr) {
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			sum += arr[index];
		}
		return sum;
	}

}
