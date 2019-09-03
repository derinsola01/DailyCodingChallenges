package com.derintester.dailycodingproblems.september2019;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.decimal4j.util.DoubleRounder;

/**
 * 
 * Question:
 * The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.
 * 
 * Note:
 * Just heard about this algorithm when I got this problem to solve.
 * I had to look it up online and found that there are loads of solutions
 * out there. The best resource I found is here:
 * https://rosettacode.org/wiki/Monte_Carlo_methods
 * 
 * Below is the algorithm in a nutshell:
 * 1. Initialize circle_points, square_points and interval to 0.
 * 2. Generate random point x.
 * 3. Generate random point y.
 * 4. Calculate d = x*x + y*y.
 * 5. If d <= 1, increment circle_points.
 * 6. Increment square_points.
 * 7. Increment interval.
 * 8. If increment < NO_OF_ITERATIONS, repeat from 2.
 * 9. Calculate pi = 4*(circle_points/square_points).
 * 10. Terminate.
 *
 */
public class DayFourteenHard {
	
	public static final Logger logger = LogManager.getLogger(DayFourteenHard.class);

	public static void main(String[] args) {
		logger.debug(getPi(10000));
		logger.debug(getPi(100000));
		logger.debug(getPi(1000000));
		logger.debug(getPi(10000000));
		logger.debug(getPi(100000000));
	}
	
	public static double getPi(int numThrows){
		int inCircle= 0;
		for(int i= 0;i < numThrows;i++){
			double randX= (Math.random() * 2) - 1;
			double randY= (Math.random() * 2) - 1;
			double dist= Math.sqrt(randX * randX + randY * randY);
			if(dist < 1){
				inCircle++;
			}
		}
		
		double initNum = 4.0 * inCircle / numThrows;
		double returnNum = DoubleRounder.round(initNum, 3);
		return returnNum;
	}

}