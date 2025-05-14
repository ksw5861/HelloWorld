package com.yedam;

//ctrl+shift+f 자동들여쓰기
public class HelloJava {
	public static void main(String[] args) {
		// int(정수), double(실수(소수점)), boolean(참/거짓)
		int num1 = 10; // 변수 초기화
		double num2 = 20; // 자동형변환(promotion)

		num1 = (int) num2; // 큰 값을 작은 값에 넣을 수 없음.//강제형변환(casting)

		int num3 = 100;
		double num4 = 200;
		double result = (double) num3 + num4;
		System.out.println("결과는 " + result);

		// 20 + 30 => 50
		System.out.println("결과는 " + 20 + 30);// 출력 시 앞의 타입이 문자면 뒤의 출력값도 문자열로 바뀐다.
		System.out.println("결과는 " + (20 + 30));// 따로 분리시키면 영향을 받지않음.
	}
}
