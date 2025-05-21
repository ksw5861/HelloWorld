//package com.yedam;
///*
// * 라이브러리클래스.
// */
//public class Calendar {
//	static void showMonth() {
//		// Sun Mon Tue Wed Thu Fri Sat
//		//=============================
//		//                   1   2   3
//		//   4   5   6   7   8   9  10
//		//  11  12  13  14  15  16  17
//		//  ...
//	    //=============================
//		
//		int mon = 6; // 월 정보를 입력
//		// 요일
//		System.out.printf("         2025년  %d월        \n", mon);
//		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
//		System.out.println("=============================");
//
//		int space = ObjectExe.getSpace(mon);
//		int lastDate = ObjectExe.getLastDate(mon);
//		
//		// 빈 공간
//		for(int s = 1; s <= space; s++) {
//			System.out.printf("%4s", " ");
//		}
//		
//		// 날짜 출력
//		for(int day = 1; day <= 31; day++) {
//			System.out.printf("%4d", day); // %3d = __1
//			if((day + space) % 7 == 0) { 
//			System.out.println(); // 7일마다 엔터
//				}
//			}
//		System.out.println();
//		System.out.println("=============================");
//
//	}
//}
