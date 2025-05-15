package com.yedam.operator;

public class OperatorExe {

	public static void main(String[] args) {
//		test();
//		test1();
//		test2();
//		test3();
//		test4();
		test5();
	}

	public static void test5() {
		String pass = "";
		int score = (int) (Math.random() * 100);
//		if(score > 60) {
//			pass = "합격";
//		}else {
//			pass = "불합격";
//		}
		// 삼항연산자로 변경.
		pass = (score >= 60) ? "합격" : "불합격";
		System.out.println("당신의 점수는 " + score + "점 ->" + pass);

//		pass = (score >= 60) ? (score >= 80) ? "우수" : "합격" : "불합격";
		pass = (score >= 80) ? "우수" : (score >= 60) ? "합격" : "불합격";
		System.out.printf("당신의 점수는 %d점 '%s'", score, pass);
	}

	// "월" 정보를 입력하면 "공란" 반환하는 메소드. getSpace()
	public static int getSpace(int month) {
		int space = 0;
		if (month == 3) { // 3월
			space = 6;
		} else if (month == 4) { // 4월
			space = 2;
		} else if (month == 5) { // 5월
			space = 4;
		} else if (month == 7) { // 7월
			space = 2;
		}
		return space;
	} // end of getSpace.

	// "월" 정보를 입력하면 말일을 알려주는 메소드 getLastDate(월)
	public static int getLastDate(int month) {
		int lastDate = 31;

		switch (month) {
		case 2:
			lastDate = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30;
			break;
		}
		return lastDate;

	}

	// 연습4. 달력형식으로 출력
	public static void test4() {
		int mon = 7;
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		// 빈공간.
		int space = getSpace(mon);
		int lastDate = getLastDate(mon);
		for (int s = 1; s <= space; s++) {
			System.out.printf("%4s", " ");
		}
		// 날짜출력.
		for (int day = 1; day <= lastDate; day++) {
			System.out.printf("%4d", day); // _|_|_ ->%3d 3자리
			if ((day + space) % 7 == 0) {
				System.out.println();
			}
		}
	}

	// 연습3.
	public static void test3() {
		boolean isTrue = true;
		for (int i = 1; i <= 10; i++) {
			if (isTrue) {
				System.out.printf("i의 값은 %d\n", i);
			}
			isTrue = !isTrue; // 토글 (true(on)면 false(off), false(off)이면 true(on)로 바꿔줌)
		}

	}

	// 연습2-1.
	public static void test2() {
		int num1 = 10;
		int num2 = 20;

		int result = ++num1 + num2++;
		System.out.printf("num1 => %d, num2 => %d, result => %d\n", num1, num2, result);

		boolean isTrue = true;
		if (!isTrue) {
			System.out.println("참입니다.");
		}
		// == 부정은 !=, > 부정은 <=, >= 부정은 <, < 부정은 >=, <= 부정은 >.
		result = 30;
		if (!(result != 30)) {
			System.out.println("result 값은 30보다 작거나 같습니다.");
		}

		if (!(--num1 > 10 || num2 < 20)) {
			System.out.printf("num1 => %d", num1);
		}

	}

	// 연습2. byte, short, long, int, char
	public static void test1() {
		byte num1 = 10;
		byte num2 = 20;
		// byte sum = num1 + num2; // 담을 수 있는 값 초과
		byte sum = (byte) (num1 + num2); // 정수연산의 기본은 int.
		// int sum = num1 + num2;
		System.out.println(sum);

		long num3 = 10000000000L;
		long num4 = 100L;
		System.out.println(Integer.MAX_VALUE); // 2147483647
	}

	// 연습1.
	public static void test() {
		// 증가, 감소 연산자 (++, --)
		byte num1 = -128;
		num1 = 127;
		num1++;
		System.out.println(num1);

		char ch1 = 'A'; // 65
		ch1 = 66;
		ch1 = '가';
		ch1 = 'A';
		ch1 = 'a';
		ch1 = 'お';
		ch1 = '漢';
		ch1 = 'ة';
		ch1 = '★';
		System.out.println((int) ch1);

		for (int i = 1; i <= 26; i++) {
			System.out.print(ch1++);
		}
	} // end of test.
}
