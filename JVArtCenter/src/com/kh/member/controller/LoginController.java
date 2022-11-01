package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login.me")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    //인코딩처리
	    request.setCharacterEncoding("UTF-8");
	    String memId = request.getParameter("memId");
	    String memPwd = request.getParameter("memPwd");
	    
	    Member m = new Member();
	    m.setMemId(memId);
	    m.setMemPwd(memPwd);
	    
	    Member loginUser = new MemberService().loginMember(m);
	    
	    // System.out.println("controller : " + loginUser);
	    
	    if(loginUser == null ) { //로그인 실패시 
	        HttpSession session = request.getSession();
	        session.setAttribute("errorMsg","잘못된 아이디 혹은 잘못된 비밀번호입니다.");
	        
	        RequestDispatcher view = request.getRequestDispatcher("views/member/loginPage.jsp");
	        view.forward(request, response);
	       

	        
	    }else if(loginUser != null && loginUser.getMemId().equals("admin")) {
             
             request.getRequestDispatcher(request.getContextPath() + "/data.ad").forward(request, response);
             
         }  else { //로그인 성공시 
             HttpSession session = request.getSession();
             session.setAttribute("loginUser", loginUser);
             
             // 성공메세지도 담기
             session.setAttribute("alertMsg", "성공적으로 로그인이 되었습니다.");
             
             //로그아웃아이콘이 붙은 메인페이지로 이동
             //RequestDispatcher view = request.getRequestDispatcher("views/member/afterlogin.jsp");
             // view.forward(request, response);
             response.sendRedirect(request.getContextPath());
         };
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
