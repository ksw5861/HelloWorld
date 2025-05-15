package com.yedam.operator;

import java.util.Scanner;

public class ScannerExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int bank = 0; // 현재 계좌의 금액.
		while (true) { // 무한반복문..
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			int menu = Integer.parseInt(scn.nextLine()); // Integer.parseInt("30"); // scn.nextLine -> 사용자의 입력을 기다리는중..
			if (menu == 1) {
				System.out.println("입금액을 입력하세요 >>");
				int inputMoney = Integer.parseInt(scn.nextLine()); // 입금 금액.
				if ((bank + inputMoney) > 100000) {
					System.out.println("10만원 초과하여 입금하실 수 없습니다.");
					bank += 0;
				} else if ((bank + inputMoney) <= 100000 || (bank + inputMoney) == 100000) {
					bank += inputMoney;
				}
			}

			else if (menu == 2) {
				System.out.println("출금액을 입력하세요 >>");
				int outputMoney = Integer.parseInt(scn.nextLine()); // 출금 금액.

				if ((bank - outputMoney) >= 0) {
					bank -= outputMoney;
				} else if ((bank - outputMoney) < 0) {
					System.out.println("잔액이 부족합니다.");
					bank -= 0;
				}
			} else if (menu == 3) {
				System.out.println("현재 계좌의 잔액은 " + bank + "원 입니다.");
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break; // 반복문 탈출.
			} else {
				System.out.println("잘못 입력하셨습니다, 1 ~ 4 숫자만 입력해주세요.");
			}

		} // end of while.
		System.out.println("end of prog.");

	} // end of main.

} // end of class.
