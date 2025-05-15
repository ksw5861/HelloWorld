package com.yedam.condition;

import java.util.Scanner;

public class LoopExe {
	// "가위(1)", "바위(2)", "보(3)" 게임
	// 무작위값 1, 2, 3 <==> 입력값 1, 2, 3 비교

	public static void main(String[] args) {
		rspGame();
	} // end of main.

	public static void rspGame() {
		int Enemy = (int)((Math.random()*3)+1);
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println(" 1.가위 2.바위 3.보 4.종료");
			int Me = Integer.parseInt(scn.nextLine());
			
			if(Me == 1) {
				if(Enemy == 1) {
					System.out.println("Draw");
				}else {
					
				}
			}else if(Me == 2)
		}
	}

	public static void test() {
		// while vs. do .. while
		boolean run = false;

//				while (run) {
//					System.out.println("while문");
//					run = !run;
//				}

		do {
			System.out.println("while문");
			run = !run;
		} while (run);

		System.out.println("end of prog.");
	}
}
