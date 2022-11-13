package com.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class MypageMemDeleteController
 */
@WebServlet("/mydelete.me")
public class MypageMemDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MypageMemDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
	
		String memId = ((Member)request.getSession().getAttribute("loginUser")).getMemId();
		String memPwd = request.getParameter("userPwd");
		
		HttpSession session = request.getSession();
		
		Member m = new Member();
		m.setMemId(memId);
		m.setMemPwd(memPwd);
		
		int result = new MemberService().deleteMember(m);
		
		if(result > 0) { // 성공 
			
			session.setAttribute("alertMsg", "성공적으로 회원탈퇴 되었습니다. 그동안 이용해 주셔서 감사합니다.");
			
			session.removeAttribute("loginUser");
			
			response.sendRedirect(request.getContextPath());
		}
		else { // 실패 
			
			request.setAttribute("errorMsg", "회원 탈퇴에 실패했습니다.");
			response.sendRedirect(request.getContextPath() + "/mypageMain.me");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
