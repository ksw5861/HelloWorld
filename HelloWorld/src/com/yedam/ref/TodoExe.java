package com.yedam.ref;

import java.util.Scanner;

public class TodoExe {
	
	static Student[] scores = null; // 학생점수저장.
	public static void main(String[] args) {
		init();

		boolean run = true; // 반복문 실행/종료
		int studentNum = 0; //
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			// 배열의 선언없이 메뉴를 선택할 경우에는 NullPointer예외.
			if (selectNo == 2 || selectNo == 3 || selectNo == 4)
				if (scores == null) {
					System.out.println("학생수를 지정하세요.");
					continue;
				}

			if (selectNo == 1) { // 학생수 지정.
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new Student[studentNum]; // 배열의 크기지정.

			} else if (selectNo == 2) { // 이름 및 점수입력.
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] 이름>> ", i);
					String name = scn.nextLine(); // 이름 저장.
					System.out.printf("scores[%d] 점수>> ", i);
					int score = Integer.parseInt(scn.nextLine());
					System.out.printf("scores[%d] 키>> ", i);
					double height = Double.parseDouble(scn.nextLine());
					System.out.printf("scores[%d] 성별>> ", i);
					String gender = scn.nextLine(); // 성별저장.
					Gender gen = Gender.MALE;
					if(gender.equals("남") || gender.equals("남자")){
						gen = Gender.MALE;
					} else if (gender.equals("여") || gender.equals("여자")) {
						gen = Gender.FEMALE;
					}
					// 인스턴스 생성.
					Student student = new Student();
					student.studentName = name;
					student.score = score;
					student.height = height;
					student.gender = gen;

					scores[i] = student; // 배열에 저장.
				}
			} else if (selectNo == 3) { // 점수 리스트 확인.
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("이름: %s, 점수: %d, 키: %.1f, 성별: %s\n", scores[i].studentName, scores[i].score,
							scores[i].height, scores[i].gender);
					sum += scores[i].score;
				}
				if (sum == 0) {
					System.out.println("점수를 입력하세요.");
					continue;
				}
				System.out.print("검색조건 ex) 남 또는 여>>");
				String keyword = scn.nextLine(); // "남", "여", "엔터"
				Gender gen = Gender.MALE; //초기화.
				if(keyword.equals("남") || keyword.equals("남자") //
					|| keyword.equals("Men") || keyword.equals("M")){
					gen = Gender.MALE;
				} else if (keyword.equals("여") || keyword.equals("여자") //
					|| keyword.equals("Women") || keyword.equals("W")){
					gen = Gender.FEMALE;
				}
				// "이름, 점수" 출력.
				for (int i = 0; i < scores.length; i++) {
					if (keyword.equals("") || gen == scores[i].gender) {
						System.out.printf("score[%d]> %s %d \n", i, scores[i].studentName, scores[i].score);
					}
				}
			} else if (selectNo == 4) { // 최댓값과 평균값 구하기
				int sum = 0; // 합계변수 선언.
				double avg = 0; // 평균변수 선언.
				int max = 0; // 최댓값변수 선언.
				Student maxStd = new Student(); // 최고점수를 받은 학생의 이름 저장.
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i].score; // 점수누적.
					if (max < scores[i].score) {
						max = scores[i].score;
						maxStd.score = scores[i].score;
						maxStd.studentName = scores[i].studentName;
						maxStd.height = scores[i].height;
						maxStd.gender = scores[i].gender;
					}
				}
				avg = 1.0 * sum / scores.length;
				System.out.printf("최고의학생: %s\n키: %.1f\n성별: %s\n최고점수: %d\n평균점수: %.2f\n", maxStd.studentName,
						maxStd.height, maxStd.gender, max, avg);

			} else if (selectNo == 5) { // 프로그램 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void init() {
		
		Student s1 = new Student(); // 인스턴스 생성.
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
		s1.gender = Gender.MALE; // "남자", "Man".

		Student s2 = new Student(); // 인스턴스 생성.
		s2.studentName = "김민선";
		s2.score = 85;
		s2.height = 165.7;
		s2.gender = Gender.FEMALE; // "여자", "Woman".

		Student s3 = new Student();
		s3.studentName = "박철민";
		s3.score = 90;
		s3.height = 180.3;
		s3.gender = Gender.MALE;

		// 초기데이터.
		scores = new Student[] { s1, s2, s3 };
	}
}
