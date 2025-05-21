package com.yedam.ref;
// 실행클래스.
public class CalculatorExe {
	public static void main(String[] args) {
		int a = 20, b = 30;
		
		// sum의 기능활용.
		Calculator c1 = new Calculator();
		c1.sum(a,b); // 정적메소드.
		System.out.println(c1.sum(a,b));
		
		Calculator.sum(a, b);
		
//		CalculatorExe ps = new CalculatorExe();
//		ps.printStar();
		printStar();
	}
	
	static void printStar() {
		System.out.println("★");
	}
	
}
