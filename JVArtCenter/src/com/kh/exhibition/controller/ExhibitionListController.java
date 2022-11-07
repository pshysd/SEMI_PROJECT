package com.kh.exhibition.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.exhibition.model.service.ExhibitionService;
import com.kh.exhibition.model.vo.Exhibition;

/**
 * Servlet implementation class ExhibitionListController
 */
@WebServlet("/exhibitionListView.do")
public class ExhibitionListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExhibitionListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String exlist = request.getParameter("exlist"); //파라메타가 하나만 넘어옴 
	    int pgno = Integer.parseInt(request.getParameter("pgno")); // 
	    String issearch = request.getParameter("issearch"); //
	    
	    //전시게시판 리스트 페이지에 필요한 정보들을 먼저 조회해 와야함
	    ArrayList<Exhibition> list = new ExhibitionService().selectExhibitionList(exlist);
	    
	    request.setAttribute("list", list );  // list 라는 키값으로 list 를 그대로 뿌려준다
	    request.setAttribute("pgno", pgno );  // (요청자)에게 넘겨줄 용도로 값을 셋팅해준다
	    request.setAttribute("exlist", exlist );  
	    request.setAttribute("issearch", issearch); 
	    
	    System.out.println("ExhibitionListController : exlist="+ exlist + " pgno=" + pgno + " count : "+ list.size());
	    
	    request.getRequestDispatcher("views/exhibition/exhibitionListView.jsp").forward(request,  response);
	}
	
        /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
