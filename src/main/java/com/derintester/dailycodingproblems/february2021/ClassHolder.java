package com.derintester.dailycodingproblems.february2021;

public class ClassHolder {
	private char charHolder;
	private int numOfTimes;
	
	public ClassHolder() { }
	
	public ClassHolder(char charHolder, int numOfTimes) {
		this.charHolder = charHolder;
		this.numOfTimes = numOfTimes;
	}

	public char getCharHolder() {
		return charHolder;
	}

	public void setCharHolder(char charHolder) {
		this.charHolder = charHolder;
	}

	public int getNumOfTimes() {
		return numOfTimes;
	}

	public void setNumOfTimes(int numOfTimes) {
		this.numOfTimes = numOfTimes;
	}

	@Override
	public String toString() {
		return "ClassHolder [charHolder=" + charHolder + ", numOfTimes=" + numOfTimes + "]";
	}

}
