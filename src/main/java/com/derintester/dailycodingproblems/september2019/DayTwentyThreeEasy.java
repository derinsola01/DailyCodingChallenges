package com.derintester.dailycodingproblems.september2019;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author derin
 * 
 * Question:
 * You are given an M by N matrix consisting of booleans that represents a board. 
 * Each True boolean represents a wall. 
 * Each False boolean represents a tile you can walk on.
 * 
 * Given this matrix, a start coordinate, and an end coordinate, 
 * return the minimum number of steps required to reach the end coordinate 
 * from the start. If there is no possible path, then return null. 
 * You can move up, left, down, and right. You cannot move through walls. 
 * You cannot wrap around the edges of the board.
 * 
 * For example, given the following board:
 * 
 * [[f, f, f, f],
 * [t, t, f, t],
 * [f, f, f, f],
 * [f, f, f, f]]
 * 
 * and start = (3, 0) (bottom left) and end = (0, 0) (top left), 
 * the minimum number of steps required to reach the end is 7, 
 * since we would need to go through (1, 2) because there is a wall everywhere 
 * else on the second row.
 */
public class DayTwentyThreeEasy {
	
	public static final Logger logger = LogManager.getLogger(DayTwentyThreeEasy.class);

	public static void main(String[] args) {
		int[] start = {3,0};
		int[] end = {0,0};
		int[][] maze = {{0,0,0,0},
						{1,1,0,1},
						{0,0,0,0},
						{0,0,0,0}};
		Arrays.asList(maze);
		int numberOfSteps = mazeWalkThrough(maze, start, end);
		logger.debug("maze holds:\t" + Arrays.deepToString(maze));
		logger.debug("numberOfSteps holds:\t" + numberOfSteps);
	}

	private static int mazeWalkThrough(int[][] maze, int[] start, int[] end) {
		maze[start[0]][start[1]] = -1;
		mark(maze, start, 0);
        return maze[end[0]][end[1]];
	}

	private static void mark(int[][] maze, int[] start, int i) {
		
	}

}
