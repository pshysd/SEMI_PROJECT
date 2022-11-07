package com.kh.exhibition.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.common.model.vo.Attachment;
import com.kh.exhibition.model.service.ExhibitionService;
import com.kh.exhibition.model.vo.Exhibition;

/**
 * Servlet implementation class AdminExhibitionDetailController
 */
@WebServlet("/admin_detail.ex")
public class AdminExhiitionDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminExhiitionDetailController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int eno = Integer.parseInt(request.getParameter("eno"));
	    
	    Exhibition e = new ExhibitionService().selectExhibition(eno);
	    
	    ArrayList<Attachment> list = new ExhibitionService().selectAttachmentList(eno);
	    
	    
	           /*        
        int newsNo = Integer.parseInt(request.getParameter("neno"));
      
        Newsletter ne = new NewsletterService().selectNewsletter(newsNo);
        ArrayList<Attachment> list  = new NewsletterService().selectAttachmentList(newsNo); 
        
        if(list != null) {
            request.setAttribute("ne", ne);
            request.setAttribute("list", list);
            request.getRequestDispatcher("views/newsletter/adminNewsletterDetailView.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMsg", "뉴스레터 상세조회 실패");
        }
    }
	            
	        }*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
