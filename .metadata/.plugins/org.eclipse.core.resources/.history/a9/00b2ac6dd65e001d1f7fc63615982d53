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
 * Servlet implementation class exhibitionSearchController
 */
@WebServlet("/exhibitionSearchView.do")
public class ExhibitionSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExhibitionSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    String searchword = request.getParameter("searchword");
	    int pgno = Integer.parseInt(request.getParameter("pgno")); //
	    String issearch = request.getParameter("issearch"); //
	    
	    System.out.println("ctlr  ExhibitionSearchController: "+searchword);

        //전시게시판 리스트 페이지에 필요한 정보들을 먼저 조회해 와야함
        ArrayList<Exhibition> list = new ExhibitionService().selectExhibitionSearch(searchword);
        
        request.setAttribute("list", list );  // list 라는 키값으로 list 를 그대로 뿌려준다
        request.setAttribute("pgno", pgno );  // (요청자)에게 넘겨줄 용도로 값을 셋팅해준다
        request.setAttribute("searchword", searchword );  
        request.setAttribute("issearch", issearch );
        
        System.out.println("ExhibitionSearchController : searchWord="+ searchword + " pgno=" + pgno + " count : "+ list.size());
        
        request.getRequestDispatcher("views/exhibition/exhibitionListView.jsp").forward(request,  response);
     //   request.getRequestDispatcher("views/exhibition/exhibitionSearchView.jsp").forward(request,  response);
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
