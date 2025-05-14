package com.yedam;

import java.util.Scanner;

public class JSExe {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 30;
//		System.out.println(num1 == num2); // true.

		String str1 = new String("Hello");
		String str2 = new String("Hello");
//		System.out.println(str1);
//		System.out.println(str2);

		// "30" vs. 30
		String str3 = "30";
		int num3 = 30;

//		System.out.println(str3.equals("" + num3));
		int num4 = Integer.parseInt(str3); // 문자열숫자
//		System.out.println(num3 == num4);

//		System.out.println(str1.equals(str2));
		// str1 == str2 => false.
		// 문자열을 비교할 경우에는 .equals()사용.

//		test2(); // 평균을 구하기(소수점까지 출력)
//		test3(); // 스캐너사용.
		test4();
	} // end of main.

	public static void test4() {

		Scanner scn = new Scanner(System.in);
		String str = "친구목록 ";
		while (true) {
			System.out.println("친구이름을 입력하세요. 종료하려면 quit>> ");
			String msg = scn.nextLine();			
			//문자열 비교, .equals 사용
			if(msg.equals("quit")) {
				str += " 입니다.";
				break;
			}
			str += msg + ", ";
		}
		// 홍길동, 김민규, 최석영 을 입력하면
		// 친구목록은 홍길동, 김민규, 최석영 입니다. 로 출력.
		System.out.println(str);
	} // end of test4.

	public static void test3() {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("학생의 점수를 입력>");
			String value = scn.nextLine(); // 입력값을 문자열형태로 반환.
			int score = Integer.parseInt(value);// 문자열을 숫자로 변환.
			sum += score;
			System.out.println("점수의 합은 " + sum);
		}
		double avg = sum / 3.0;
		System.out.println("학생들의 평균점수는 " + Math.round(avg * 100) / 100.0);

	} // end of test3.

	public static void test2() {
		// ..
		// 임의의 수를 생성. 1 ~ 100사이의 임의의 값 생성.
		// 임의의 수를 생성. 30 ~ 100사이의 임의의 값 생성.
		// 평균: 173/5 => 34.6
		// 1 <= x < 11
		int sum = 0;

		for (int i = 1; i <= 7; i++) {
			int result = (int) (Math.random() * 71) + 30; // 30 <= x < 100 실수 생성
			sum += result;
			System.out.println(result); // 생성된 난수 출력
		}
		double avg = sum / 7.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("합계는 " + sum + ", 평균은 " + avg + "입니다.");
		System.out.println(Math.round(23.678 * 100) / 100.0);
	} // end of test2.

	public static void test() {
		int sum = 0;
		// 1 ~ 10 까지의 값을 누적하는 반복문.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과는 " + sum + "입니다.");
	}
} // end of class.
