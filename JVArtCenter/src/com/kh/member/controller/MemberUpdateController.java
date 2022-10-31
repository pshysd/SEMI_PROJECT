package com.kh.member.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class MemberUpdateController
 */
@WebServlet("/update.mb")
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
	    String memName = request.getParameter("memName");
	    String grCode = request.getParameter("grade");
	    String gender = request.getParameter("gender");
	    String phone = request.getParameter("phone");
	    String memId = request.getParameter("memId");
	    String email = request.getParameter("email");
	    String birthDate = request.getParameter("birthDate");
	    String memStatus = request.getParameter("status");
	    
	    Member m = new Member(grCode, memId, memName, gender, email, birthDate, phone, memStatus)
	    response.sendRedirect("");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
