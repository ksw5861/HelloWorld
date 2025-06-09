package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.BoardVO;

/*
 * 인터페이스(BoardMapper) - XML(BoardMapper.xml) 매칭.
 */
public interface BoardMapper {
	public List<BoardVO> selectList(); //목록.
	public List<BoardVO> selectListWithPaging(int page); // 페이징
	public BoardVO selectBoard(int bno); //단건조회.
	public int updateReadCnt(int bno); //조회count증가.
	public int insertBoard(BoardVO board);
	public int updateBoard(BoardVO board);
	public int deleteBoard(int bno);
}