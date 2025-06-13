package com.yedam.common;

import java.util.List;

import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.ReplyVO;

public class Apptest {
	public static void main(String[] args) {
		ReplyService svc = new ReplyServiceImpl();
//		// 입력.
//		ReplyVO rep = new ReplyVO();
//		rep.setBoardNo(221);
//		rep.setReply("설레는댓글창열기");
//		rep.setReplyer("newbie");
//		svc.addReply(rep);
//		
//		// 삭제.
//		svc.removeReply(7);
		
		
		// 목록.
		List<ReplyVO> list = svc.replyList(221);
		for(ReplyVO reply:list) {
			System.out.println(reply.toString());
		}
		
//		ReplyVO reply = svc.getReply(3);
//		System.out.println(reply.toString());
	}
}
