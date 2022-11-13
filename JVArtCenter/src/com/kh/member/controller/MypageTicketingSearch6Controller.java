package com.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.reservation.model.service.ReservationService;
import com.kh.reservation.model.vo.Reservation;

/**
 * Servlet implementation class MypageTicketingSearch6Controller
 */
@WebServlet("/ticketingSearch6.me")
public class MypageTicketingSearch6Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MypageTicketingSearch6Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    int memNo = Integer.parseInt(request.getParameter("memNo"));
        int month = -6;
        
        ArrayList<Reservation> list = new ReservationService().selectMyResvList(memNo, month);
        
        response.setContentType("application/json; charset=UTF-8");
        new Gson().toJson(list, response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
