package com.yedam.ref.app;

import java.util.Scanner;

import com.yedam.ref.Gender;
import com.yedam.ref.Student;

/*
 * 회원추가, 수정, 삭제, 조회 기능.
 * 1) 추가
 *  - 아이디, 이름, 전화번호, 포인트
 * 2) 수정
 *  - 아이디
 *  - 전화번호 (바뀔항목)
 * 3) 삭제
 *  - 아이디입력 후 enter -> 삭제
 * 4) 조회
 *  - 이름 (조회)
 */

public class MemberExe {
	static Member[] members = null;

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1. 회원추가 | 2. 회원수정 | 3. 회원삭제 | 4. 회원조회 | 5. 종료 ");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택 ▼");
			int selectNo = Integer.parseInt(scn.nextLine());
			members = new Member[10];
			if (selectNo == 1) {
				for (int i = 0; i < members.length; i++) {
					System.out.printf("member[%d] 아이디>> ", i+1);
					String memberId = scn.nextLine(); // 멤버아이디
					System.out.printf("member[%d] 이름>> ", i+1);
					String memberName = scn.nextLine();// 멤버이름
					System.out.printf("member[%d] 전화번호>> ", i+1);
					String phoneNum = scn.nextLine();// 전화번호
					System.out.printf("member[%d] 포인트>> ", i+1);
					int point = Integer.parseInt(scn.nextLine()); // 포인트
					
					Member member = new Member();
					member.memberId = memberId;
					member.memberName = memberName;
					member.phoneNum = phoneNum;
					member.point = point;

					members[i] = member;
					break;
				}
			} else if (selectNo == 2) {
				
			} else if (selectNo == 3) {

			} else if (selectNo == 4) { //회원조회
				String searchName = scn.nextLine();
//				if(searchName.equals()
			} else if (selectNo == 5) { // 프로그램 종료
				run = false;
			}
			System.out.println("프로그램 종료.");
		}
	}
}
