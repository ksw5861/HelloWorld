package com.yedam.board;

import java.util.Scanner;

import com.yedam.ObjectExe;

/*
 * 추가(addBoard) / 
 * 수정 (modifyBoard) - 글번호, 바뀔내용, 바뀔제목 / 
 * 삭제 (removeBoard) - 글번호/ 
 * 목록(boardList) - 상세화면 조회 /
 * 조회기능(글번호 -> 글반환) getBoard /
 * 순번부여(nextSequence) / 
 */
public class BoardExe {
	// 필드.
	private Board[] boards; // 데이터 저장.
	private Scanner scn = new Scanner(System.in);

	private int bno = 11; // 배열인덱스. 이미 넣어놓은 인덱스 0,1 사용중

	// 생성자.
	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board(10, "날씨가 좋습니다.", "오늘 기온이 30도가 넘어요", "홍길동");
		boards[1] = new Board(11, "날씨가11 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[2] = new Board(12, "날씨가12 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[3] = new Board(13, "날씨가13 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[4] = new Board(14, "날씨가14 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[5] = new Board(15, "날씨가15 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[6] = new Board(16, "날씨가16 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[7] = new Board(17, "날씨가17 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[8] = new Board(18, "날씨가18 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[9] = new Board(19, "날씨가19 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
		boards[10] = new Board(20, "날씨가20 안좋습니다.", "오늘 기온이 30도가 넘어요", "김길동");
	}

	// 메소드.
	void execute() {
		boolean run = true;
		// 아이디 입력.
		while (run) {
			System.out.println("아이디를 입력하세요>>");
			String uname = scn.nextLine();
			// 비밀번호 입력.
			System.out.println("비밀번호를 입력하세요>>");
			String passwd = scn.nextLine();
			// 로그인 성공하면..
			if (!UserExe.login(uname, passwd)) {
				System.out.println("아이디 또는 비밀번호를 확인하세요.");
				continue;
			}
//			System.out.println("환영합니다!!");
			break;
		}
//		while (run) {
//			for (int i = 0; i < 3; i++) {
//				System.out.println("아이디를 입력하세요>>");
//				String uname = scn.nextLine();
//				// 비밀번호 입력.
//				System.out.println("비밀번호를 입력하세요>>");
//				String userPw = scn.nextLine();
//				// 로그인 실패하면..
//				int cnt = 3;
//				if (!UserExe.login(uname, userPw)) {
//					cnt--;
//					System.out.printf("아이디 또는 비밀번호를 확인하세요.(남은기회: %d회)\n", cnt);
//					continue;
//				}
//			}			
//			// 로그인 성공하면..
//			break;
//		}
		while (run) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(" 1. 글 작성 | 2. 내용 수정 | 3. 글 삭제 | 4. 게시글 목록 | 5. 달력 보기 | 6. 게시판 종료 ");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("선택>> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1: // 추가. (addBoard)
				addBoard();
				break;
			case 2: // 수정. (modifyBoard) - 글번호, 바뀔내용, 바뀔제목
				modifyBoard();
				break;
			case 3: // 삭제.
				removeBoard();
				break;
			case 4: // 목록.
				boardList();
				break;
			case 5:
				showMonth();
				break;
			case 6: // 종료.
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
		int no = nextSequence();// Integer.parseInt(userMessage("글번호를 입력하세요"));
		String title = userMessage("제목을 입력하세요");
		String content = userMessage("내용을 입력하세요");
		String writer = userMessage("작성자를 입력하세요");

		// Board인스턴스 선언하고 값을 지정.
		Board board = new Board(no, title, content, writer);

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
//		sort();
		int page = 1;
		// while 반복문.
		while (true) {
			int start = (page - 1) * 5;
			int end = page * 5;
			System.out.println("글번호      제목     작성자");
			System.out.println("=========================================================");
			for (int i = start; i < end; i++) {
				if (boards[i] != null) {
					boards[i].showInfo();
				}
			}
			// 상세보기.
			System.out.println("=========================================================");
			System.out.println("상세보기-글번호입력| 이전페이지(p) | 다음페이지(n) |메뉴로 이동(q)");
			System.out.println("=========================================================");
			String str = scn.nextLine();
			// 메뉴, 상세
			if (str.equals("q")) {
				return;
			} else if (str.equals("n")) {
				page++;
			} else if (str.equals("p")) {
				page--;
			}

			else {
				int no = Integer.parseInt(str);
				// 배열에서 조회.
				Board sboard = getBoard(no);
				if (sboard == null) {
					System.out.println("해당번호글이 없습니다.");
					return;
				}
				sboard.detailInfo();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getBoardNo() == no) {
						boards[i].detailInfo();
					}
				}
				System.out.println();
			}
		} // end of while.
	} // end of boardList.

	// 수정.
	void modifyBoard() {
		int bno = userMenu("수정할 글번호 입력");
		Board result = getBoard(bno);
		if (result == null) {
			System.out.println("조회한 결과가 없습니다.");
			return;
		}
		String title = userMessage("수정할 제목 입력");
		String content = userMessage("수정할 내용 입력");
		//
		result.setContent(content);
		result.setTitle(title);
		System.out.println("수정완료.");
	}

	// 삭제.
	void removeBoard() {
		int bno = userMenu("삭제할 글번호 입력");
		Board result = getBoard(bno);
		if (result == null) {
			System.out.println("조회한 결과가 없습니다.");
			return;
		} else {
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getBoardNo() == bno) {
					boards[i] = null;
					System.out.println("삭제완료.");
					return;
				}
			}
		}
	} // end of removeBoard().

	// 단건조회(getBoard)
	// 글번호를 활용해서 배열에서 조회하고 Board 반환.
	Board getBoard(int bno) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == bno) {
				return boards[i];
			}
		}
		return null; // 조건에 맞는 글 번호가 없으면 null 반환.
	} // end of getBoard.

	// 사용자의 입력값을 반환.
	String userMessage(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();

	}

	int userMenu(String msg) {
		System.out.println(msg + ">> ");
		return Integer.parseInt(scn.nextLine());
	}

	// 순번생성.
	int nextSequence() {
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && max < boards[i].getBoardNo()) {
				max = boards[i].getBoardNo();
			}
		}
		return max + 1;
	}

	void sort() {
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i + 1] == null) {
					continue;
				}
				if (boards[i] == null) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
					continue;
				}
				if (boards[i].getBoardNo() < boards[i + 1].getBoardNo()) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
				}
			}
		}
	} // end of sort.

	static void showMonth() {
		// Sun Mon Tue Wed Thu Fri Sat
		// =============================
		// 1 2 3
		// 4 5 6 7 8 9 10
		// 11 12 13 14 15 16 17
		// ...
		// =============================

		int mon = 6; // 월 정보를 입력
		// 요일
		System.out.printf("          2025년  %d월        \n", mon);
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("=============================");

		int space = ObjectExe.getSpace(mon);
		int lastDate = ObjectExe.getLastDate(mon);

		// 빈 공간
		for (int s = 1; s <= space; s++) {
			System.out.printf("%4s", " ");
		}

		// 날짜 출력
		for (int day = 1; day <= 31; day++) {
			System.out.printf("%4d", day); // %3d = __1
			if ((day + space) % 7 == 0) {
				System.out.println(); // 7일마다 엔터
			}
		}
		System.out.println();
		System.out.println("=============================");

	}

} // end of class.
