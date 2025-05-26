package com.yedam.api;

public class ranNum {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int ranNum = (int)(Math.random()*91)+10;
			int sum = 0;
			double avg = 1.0 * sum / 10;
			sum += ranNum;
		}
	}
}
