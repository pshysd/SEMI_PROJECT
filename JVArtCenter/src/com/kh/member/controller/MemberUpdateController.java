package com.kh.member.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class MemberUpdateController
 */
@WebServlet("/update.me")
public class MemberUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateController() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    int memNo = Integer.parseInt(request.getParameter("memNo"));
	    String grCode = request.getParameter("grade");
	    String memId = request.getParameter("memId");
	    String memName = request.getParameter("memName");
	    String gender = request.getParameter("gender");
	    String email = request.getParameter("email");
	    String birthDate = request.getParameter("birthDate");
	    String phone = request.getParameter("phone");
	    String memStatus = request.getParameter("status");
	    
	    Member m = new Member(memNo,grCode, memId, memName, gender, email, birthDate, phone, memStatus);
	    int result = new MemberService().updateMember(m);
	    if(result>0) {
	        request.getSession().setAttribute("alertMsg", "정보 수정이 완료되었습니다.");
	        response.sendRedirect(request.getContextPath()+"/admin_list.me?currentPage=1");
	    }else {
	        request.getSession().setAttribute("alertMsg", "처리 과정에 문제가 발생했습니다.");
	        response.sendRedirect(request.getContextPath()+"/admin_list.me?currentPage=1");
	    }
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
