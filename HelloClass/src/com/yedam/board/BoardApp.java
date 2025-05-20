package com.yedam.board;
/*
 * 게시판. 
 * Board: 필드... 1. 글번호 / 2. 제목 / 3. 내용 / 4. 작성자./ getter/setter 
 * BoardExe: 추가, 수정, 삭제, 목록.
 * BoardApp: main메소드 실행클래스.
 */

public class BoardApp {
	public static void main(String[] args) {
		BoardExe exe = new BoardExe();
		exe.execute();
	}
}
