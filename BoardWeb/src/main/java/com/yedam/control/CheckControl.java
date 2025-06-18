package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;

public class CheckControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// id = user01
		String user = req.getParameter("id");
		user = req.getParameter("pw");
		MemberService svc = new MemberServiceImpl();
		if (svc.getMemberInfo(user)) {
			resp.getWriter().print("{\"retCode\":\"Success\"}"); // {"retCode":"Success"}
		} else {
			resp.getWriter().print("{\"retCode\":\"NotExist\"}");
		}
	}
}
