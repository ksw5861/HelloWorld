package com.yedam.condition;

import java.util.Scanner;

public class IfExe {
	
	public static void main(String[] args) {
		UpDownGame();
	}
	// 1 ~ 1000 사이의 임의의 값을 생성. randomValue = 567
	// 사용자가 500 입력하면, "입력값 보다 큽니다/작습니다". 출력 up down 게임..
	// 사용자가 값을 맞추면 "정답입니다" 후 프로그램종료
	public static void UpDownGame() {
		Scanner scn = new Scanner(System.in);
		int randomValue = (int)(Math.random()*1001)+1;
		int cnt = 0;
		while(true) {
			System.out.println("예상 값을 입력하세요>> ");
			int val = Integer.parseInt(scn.nextLine());
			
			if(val > randomValue) {
				System.out.println("Down");
				cnt++;
			}else if (val < randomValue) {
				System.out.println("Up");
				cnt++;
			}else {
				System.out.println("Correct!!");
				switch(cnt / 5) {
				case 0:
					System.out.println("당신은 " + cnt + "번 만에 맞추셨습니다. Perfect!");
					break;
				case 1:
					System.out.println("당신은 " + cnt + "번 만에 맞추셨습니다. Good!");
					break;
				case 2:
					System.out.println("당신은 " + cnt + "번 만에 맞추셨습니다. Not Bad!");
					break;
				default:
					System.out.println("당신은 " + cnt + "번 만에 맞추셨습니다...!");
					break;
				}
			}
		}
	}
	public static void test() {
int score = 79;
		
		// if.
//		if (score >= 60) {
//			System.out.println("▲PASS▲");
//		} else {
//			System.out.println("▼FAIL▼");
//		}
		
//	    if (score >= 90) {
//	    	System.out.println("A Grade");
//	    } else if (score >= 80) {
//	    	System.out.println("B Grade");
//	    } else if (score >= 70) {
//	    	System.out.println("C Grade");
//	    } else {
//	    	System.out.println("...FAIL");
//	    } 
		
		// switch.
		score = score / 10; //소수점을 버림
		switch(score) {
		case 10:
		case 9: 
			System.out.println("A Grade");
			break;
		case 8: 
			System.out.println("B Grade");
			break;
		case 7: 
			System.out.println("C Grade");
			break;
		default:
			System.out.println("...FAIL");
		} // end of switch.
	}
}
