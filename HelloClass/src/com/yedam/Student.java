package com.yedam;

/*
 * 라이브러리 클래스.
 */
public class Student {
	// 필드(속성)
	private int studentNo; // private를 사용하면 해당 클래스에서만 사용가능하다. 외부에서 접근불가.
	String studentName;
	double height;
	int engScore;
	int mathScore;
	
	// 생성자(객체:instance의 초기화)
	// 반드시 생성
	public Student() {
		// 매개값이 없는 생성자 => 기본생성자.
		// 컴파일러가 생성. 
	}               // 매개값 ▼           매개값 ▼
	public Student(int studentNo, String studentName) {
		this.studentNo = studentNo; // 첫번째 매개값은 학생번호 할당.
		this.studentName = studentName; // 두번째 매개값은 학생이름 할당.
	}
	public Student(int studentNo, int engScore, int mathScore) {
		this.studentNo = studentNo;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	// 메소드(기능)
	void study() {
		System.out.println("공부를 합니다.");
	}
	void introduce() {
		System.out.printf("학번은 %d이고, 이름은 %s 입니다.\n", studentNo, studentName);
	}
	//영어, 수학.
	void setEngScore(int engScore) {
		if (engScore < 0 || engScore > 100) {
			return;
		}
		this.engScore = engScore;
	}
	void setMathScore(int mathScore) {
		if(mathScore < 0 || mathScore > 100) {
			return;
		}
		this.mathScore = mathScore;
	}
	
	int getEngScore() {
		return engScore;
	}
	
	int getMathScore() {
		return mathScore;
	}
	
	// 학번, 학생명. (getter, setter)
	
	void setstudentNo(int studentNo) {
		if(studentNo < 0 || studentNo > 10000) {
			return;
		}
		this.studentNo = studentNo;
	}
	
	void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	
	int getStudentNo() {
		return studentNo;
	}
	
	String getStudentName() {
		return studentName;
	}
}

