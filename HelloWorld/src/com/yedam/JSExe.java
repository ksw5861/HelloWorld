package com.yedam;

public class JSExe {
	public static void main(String[] args) {
		test2();
	} // end of main.

	public static void test2() {
		// 임의의 수를 생성. 1 ~ 100사이의 임의의 값 생성.
		// 1 <= x < 11
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int result = (int) (Math.random() * 100) + 1; // 0 <= x < 1 실수 생성
			sum += result;
			System.out.println(result); // 생성된 난수 출력
		}
		System.out.println("결과는 " + sum + "입니다.");
	} // end of main.

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
