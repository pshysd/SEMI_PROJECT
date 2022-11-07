package com.kh.qna.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.common.model.vo.PageInfo;
import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;
import com.kh.qna.model.service.QnaService;
import com.kh.qna.model.vo.Qna;

/**
 * Servlet implementation class AdminQnaListController
 */
@WebServlet("/admin_list.qna")
public class AdminQnaListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminQnaListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String keyword = request.getParameter("keyword");
       String searchword = request.getParameter("searchword");
	   
	    // 페이징 처리
        int listCount;
        int currentPage;
        int pageLimit = 5;
        int boardLimit = 10;
        int maxPage;
        int startPage;
        int endPage;
        
        if(keyword != null && keyword.equals("category")) {
            listCount = new QnaService().selectCateListCount(searchword);
        } else if(keyword != null && keyword.equals("memId")) {
            listCount = new QnaService().selectMemIdListCount(searchword);
        } else if(keyword != null && keyword.equals("title")) {
            listCount = new  QnaService().selectTitleListCount(searchword);
        } else {
            listCount = new  QnaService().selectListCount();
        }
        currentPage = Integer.parseInt(request.getParameter("currentPage"));
        maxPage = (int)Math.ceil((double)listCount/boardLimit);
        startPage = ((currentPage - 1) / pageLimit) * pageLimit + 1;
        endPage = startPage + pageLimit - 1;
        if(endPage > maxPage) {
            endPage = maxPage;
        }
        
        PageInfo pi =  new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
        
        ArrayList<Qna> list = null;
        if(keyword != null && searchword != null) {
            list = new QnaService().selectList(pi, keyword, searchword);
        } else {
            list = new QnaService().selectList(pi);
        }

        if(list != null) {
            request.setAttribute("pi", pi);
            request.setAttribute("list", list);
            request.setAttribute("keyword", keyword);
            request.setAttribute("searchword", searchword);
        }
        request.getRequestDispatcher("views/admin/adminQnaListView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
