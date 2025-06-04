package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.BoardVO;
/*
 * 인터페이스 - XML 매칭.
 */
public interface BoardMapper {
	public List<BoardVO> selectList();
	public int insertBoard(BoardVO Board);
	public int updateBoard(BoardVO Board);
	public int deleteBoard(int Bno);
}
