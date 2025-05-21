package com.yedam;
/*
 * main 실행클래스.
 */
public class ObjectExe {
	public static void main(String[] args) {
			// 호출.
//			Calendar show = new Calendar();
//			show.showMonth();
	}
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
	
}
