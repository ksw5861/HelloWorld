package com.yedam.board;

import java.util.Scanner;

/*
 * 추가 / 수정 / 삭제 / 목록
 */
public class BoardExe {
	// 필드.
	private Board[] boards; // 데이터 저장.
	private Scanner scn = new Scanner(System.in);

	private int bno = 0;

	// 생성자.
	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board("홍길동", 10, "날씨가 좋습니다.", "오늘 기온이 30도가 넘어요");
		boards[1] = new Board("감길동", 11, "날씨가 안좋습니다.", "오늘 기온이 30도가 넘어요");
	}

	// 메소드.
	void execute() {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println(" 1. 글 작성 | 2. 내용 수정 | 3. 글 삭제 | 4. 게시글 목록 | 5. 게시판 종료 ");
			System.out.println("----------------------------------------------------------------");
			System.out.println("선택>> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1: // 추가.
				addBoard();
				break;
			case 2: // 수정.

			case 3: // 삭제.

			case 4: // 목록.
				boardList();
				break;
			case 5: // 종료.
				System.out.println("게시판을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
				break;
			} // end of switch.
		} // end of while.
	} // end of execute.

	// 기능. 글 작성(추가)
	// "글번호를 입력하세요>>" 1
	// "제목을 입력하세요>>" 오늘은 덥네요.
	// "내용을 입력하세요>>" 오늘 기온이 30도가 넘습니다. 날씨 버그났네요
	// "작성자를 입력하세요>>" 홍길동
	// "글 작성이 완료되었습니다." / "글 작성을 실패했습니다." 메세지 출력.

	void addBoard() {
		System.out.println("작성자를 입력하세요>> ");
		String writer = scn.nextLine();
		System.out.println("글 번호를 입력하세요>> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("제목을 입력하세요>> ");
		String title = scn.nextLine();
		System.out.println("내용을 입력하세요>> ");
		String content = scn.nextLine();

		// Board인스턴스 선언하고 값을 지정.
		Board board = new Board(writer, no, title, content);

		// 배열에 저장.
		boards[bno++] = board;
		System.out.println("글 작성이 완료되었습니다.");

	} // end of addBoard.
	/* 기능 */
	// 글번호 제목 작성자
	// =================================
	// 1 날씨가 좋아요 이준석
	// 2 날씨가 안좋아요 이재명
	// 3 날씨가 좋지않지요 김문수
	// 4 날씨가 좋을수도있고 안철수

	// ** 등록된 글이 없습니다 **
	void boardList() {
		System.out.println("글번호      제목     작성자");
		System.out.println("=============================");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				boards[i].showInfo();
			}
		}
		// 상세보기.
		System.out.println("=============================");
		System.out.println("상세보기: 글번호입력, 메뉴로 이동(q)");
		System.out.println("=============================");
		String str = scn.nextLine();
		// 메뉴, 상세
		if (str.equals("q")) {
			return;
		} else {
			int no = Integer.parseInt(str);
			// 배열에서 조회.
			for(int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getBoardNo() == no) {
					boards[i].detailInfo();
				}
			}
		}
		System.out.println();
	}
}
