package com.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.mapper.ReplyMapper;
import com.yedam.vo.ReplyVO;

public class ReplyServiceImpl implements ReplyService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession();
	ReplyMapper mapper = sqlSession.getMapper(ReplyMapper.class);
	
	@Override
	public List<ReplyVO> replyList(int bno, int page){
		return mapper.selectList(bno, page);
	}
	
	@Override
	public boolean addReply(ReplyVO rno) {
		int r = mapper.insertReply(rno); //추가?
		if(r == 1) {
			sqlSession.commit(); // 커밋.
			return true;
		}
		return false;
	}
	
	
	@Override
	public ReplyVO getReply(int rno) {
		ReplyVO reply = mapper.selectReply(rno); // 댓글번호 -> 조회.
		if(reply != null) {
			sqlSession.commit(); //커밋
		}
		return reply;
	}
	
	@Override
	public boolean removeReply(int rno) {
		// 댓글삭제
		int r = mapper.deleteReply(rno);
		if (r == 1) {
			sqlSession.commit();// 커밋처리.
			return true;
		}
		return false;
	}

	@Override
	public int totalCount(int bno) {
		return mapper.selectTotal(bno);
	}
}
