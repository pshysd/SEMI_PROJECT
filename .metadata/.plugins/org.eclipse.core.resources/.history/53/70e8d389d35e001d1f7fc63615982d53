package com.kh.exhibition.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.exhibition.model.service.ExhibitionService;
import com.kh.exhibition.model.vo.Exhibition;
import com.kh.member.model.vo.Member;
import com.kh.review.model.vo.Review;
/**
 * Servlet implementation class ExhibitionDetailController
 */
@WebServlet("/ExhibitionDetailView.do")
public class ExhibitionDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExhibitionDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     int memNo = Integer.parseInt(request.getParameter("memNo"));
	     int exNo = Integer.parseInt(request.getParameter("exNo"));	        
        //전시게시판 리스트 페이지에 필요한 정보들을 먼저 조회해 와야함
        ArrayList<Exhibition> list = new ExhibitionService().selectExhibitionDetail(exNo); //디테일 가져옴
	        
        request.setAttribute("list", list );  // list 라는 키값으로 list 를 그대로 뿌려준다
	    
        System.out.println("ExhibitionDetailController : memNo="+ memNo + " exNo="+ exNo + " count=" + list.size());
        //checked bookmark
         boolean isBM = new ExhibitionService().checkExhibitionBookMarked(memNo , exNo);    //북마크가 있는지 없는지 가져옴
            
        System.out.println("ctlr checkExhibitionBookMarked : " +  memNo + " " + exNo+ " = " + isBM  );
                  
        request.setAttribute("isBM", isBM ); //ISBM이라는 변수를 JSP 에서 사용가능하다 

        ArrayList<Review> review = new ExhibitionService().selectExhibitionReview(exNo); //리뷰리스트를 가져옴 
        request.setAttribute("review", review ); //리뷰정보를 줌 
        
         System.out.println("svc selectExhibitionReview : " );    
        
	    // 조회수 증가용 서비스 먼저 요청 후 성공 시 상제조회 요청
	    request.getRequestDispatcher("views/exhibition/exhibitionDetailView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
 }

