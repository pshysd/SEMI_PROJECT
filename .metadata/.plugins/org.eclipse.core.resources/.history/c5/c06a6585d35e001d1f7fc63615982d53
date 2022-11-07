package com.kh.exhibition.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.exhibition.model.service.ExhibitionService;

/**
 * Servlet implementation class ExhibitionLikeController
 */
@WebServlet("/ExhibitionBookmark.do")
public class ExhibitionBookmarkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExhibitionBookmarkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int memNo = Integer.parseInt(request.getParameter("memNo"));
        int exNo = Integer.parseInt(request.getParameter("exNo"));
   
	     boolean  isChecked = new ExhibitionService().changeExhibitionBookmark(memNo , exNo);    //북마크가 있는지 없는지 가져옴 
         
         System.out.println("ctlr changeExhibitionBookmarked : " +  memNo + " " + exNo+ " = " + isChecked  );
         
         response.setContentType("application/x-json; charset=UTF-8");
         
         response.getWriter().write(isChecked + "");
         
         
         /*         
        request.setAttribute("isChecked", isChecked ); //ISBM이라는 변수를 JSP 에서 사용가능하다 
        
        request.getRequestDispatcher("views/exhibition/exhibitionDetailView.jsp").forward(request,  response);
	*/
         
	}
	   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
