package com.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class MemberListController
 */
@WebServlet("/list.mb")
public class MemberListController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListController() {
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 페이징 처리용 변수들 세팅
        int listCount = new MemberService().selectListCount(); // 현재 총 멤버들 숫자 (탈퇴한 멤버 포함x)
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        ; // 현재 요청한 페이지 (즉, 사용자가 요청한 페이지 수)
        int pageLimit = 10; // 페이지 하단에 보여질 페이징 바의 페이지 최대 갯수 (직접 설정)
        int boardLimit = 10;// 한 페이지에 보여질 게시글의 최대 갯수 (몇 개 단위씩 리스트가 보여질건지 직접 설정)

        int maxPage = (int) Math.ceil((double) listCount / boardLimit);// 가장 마지막 페이지가 몇 번 페이지인지 (총 페이지 수)
        int startPage = (currentPage - 1) / pageLimit * pageLimit + 1; // 페이지 하단에 보여질 페이징 바의 시작 수
        int endPage = startPage + pageLimit - 1; // 페이지 하단에 보여질 페이징 바의 끝 수

        if (endPage > maxPage) {
            endPage = maxPage;
        }

        PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
        // 회원 정보 받아올 arraylist -> 서비스로 연결
        ArrayList<Member> list = new MemberService().selectMemberList(pi);

        request.setAttribute("pi", pi);
        request.setAttribute("list", list);

        request.getRequestDispatcher("views/member/memberListView.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
