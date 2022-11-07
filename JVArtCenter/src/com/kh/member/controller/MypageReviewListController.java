package com.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.vo.Member;
import com.kh.review.model.service.ReviewService;
import com.kh.review.model.vo.Review;

/**
 * Servlet implementation class mypageReviewList
 */
@WebServlet("/mypageReviewList")
public class MypageReviewListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MypageReviewListController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
        HttpSession session = request.getSession();
        
	    //System.out.println("세션값 ######### ;" + session.getAttribute("loginUser").toString());
	    Review review = new Review();
	    
	    Member loginUser = (Member)session.getAttribute("loginUser");
	    
	    review.setMemNo(String.valueOf(loginUser.getMemNo())); // session에 memNo 가져오고싶은데 어떻데 가져와야하는지... memno를 보내서 리스트에 보내주니깐
	    //Member loginUser = (Member)session.getAttribute("2");
	  //  int memNo = Integer.parseInt(request.getParameter("mno"));
	   
//	    ArrayList<Review>list = new ReviewService().selectMypageReviewList(review);	     
	    //응답페이지에서필요로하는 데이터영역담기
//	    request.setAttribute("list", list);
	    
	    //포워딩
	    request.getRequestDispatcher("/views/member/mypageReviewList.jsp").forward(request, response);
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
