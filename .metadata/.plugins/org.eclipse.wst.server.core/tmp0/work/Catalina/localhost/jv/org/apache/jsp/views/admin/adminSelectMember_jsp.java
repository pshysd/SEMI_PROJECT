/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-11-07 21:28:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.member.model.vo.Member;
import com.kh.common.model.vo.PageInfo;

public final class adminSelectMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/views/admin/adminScript.html", Long.valueOf(1667747194709L));
    _jspx_dependants.put("/views/admin/adminSidebar.jsp", Long.valueOf(1667856333379L));
    _jspx_dependants.put("/views/admin/adminTopbar.jsp", Long.valueOf(1667747194710L));
    _jspx_dependants.put("/views/admin/adminPath.jsp", Long.valueOf(1667747194709L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.common.model.vo.PageInfo");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
 String contextPath = request.getContextPath(); 
      out.write("    \r\n");
 // request 에 담았던 list 키값의 값을 뽑아오기 
	// ArrayList<Member> list = 
	//(ArrayList<Member>)request.getAttribute("list");
	ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
    String keyword = request.getParameter("keyword");
    String searchword = request.getParameter("searchword");
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage(); 

      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>JV 관리자 페이지</title>\r\n");
      out.write("  <!-- JQuery CDN -->\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- chart.js CDN (차트 api) -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- swiper.js CDN (이미지 스와이프 api) -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://unpkg.com/swiper/swiper-bundle.min.css\" />\r\n");
      out.write("<!-- <script src=\"https://unpkg.com/swiper/swiper-bundle.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 아이콘/글씨체 링크-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/vendor/fontawesome-free/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("    	/* ---------- 전체 스타일 ---------- */\r\n");
      out.write("		/* 영역 사이즈 고정 */   \r\n");
      out.write("		.wrapper {\r\n");
      out.write("			width: 1900px;\r\n");
      out.write("			/* 각자 필요한 길이만큼 height 속성값 수정해서 길이 조정 */\r\n");
      out.write("			height: 1000px;\r\n");
      out.write("		};\r\n");
      out.write("		#accordionSidebar { width: 224px; }\r\n");
      out.write("		#content-wrapper { width: 1676px; }\r\n");
      out.write("		\r\n");
      out.write("		#accordionSidebar, #content-wrapper {\r\n");
      out.write("			float: left;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#search{\r\n");
      out.write("			width: 100px;\r\n");
      out.write("			height: 40px;\r\n");
      out.write("		}\r\n");
      out.write("		#findType{\r\n");
      out.write("			height: 40px;\r\n");
      out.write("		}\r\n");
      out.write("		#searchbtn{\r\n");
      out.write("			background-color: rgba(31, 31, 209, 0.849);\r\n");
      out.write("			font-weight: 700;\r\n");
      out.write("			width: 90px;\r\n");
      out.write("		}\r\n");
      out.write("		#mem{\r\n");
      out.write("			width: 20px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		#member-search-admin{\r\n");
      out.write("			margin-left: 50px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		#info{\r\n");
      out.write("			margin-left: 50px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		#searchw{\r\n");
      out.write("			height: 40px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("	\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!-- 사이드메뉴바 -->\r\n");
      out.write("<ul\r\n");
      out.write("	class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\"\r\n");
      out.write("	id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Sidebar - Brand -->\r\n");
      out.write("	<a\r\n");
      out.write("		class=\"sidebar-brand d-flex align-items-center justify-content-center\"\r\n");
      out.write("		href=\"views/admin/adminMain.jsp\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"sidebar-brand-text mx-3\">JV artcenter admin</div>\r\n");
      out.write("	</a>\r\n");
      out.write("	<div class=\"sidebar-brand-icon rotate-n-15\"></div>\r\n");
      out.write("	<!-- Divider -->\r\n");
      out.write("	<hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 전시관리 메뉴 -->\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"\"\r\n");
      out.write("		data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\"\r\n");
      out.write("		aria-controls=\"collapseTwo\"> <i class=\"fas fa-fw fa-cog\"></i> <span>전시관리</span>\r\n");
      out.write("	</a>\r\n");
      out.write("		<div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\"\r\n");
      out.write("			data-parent=\"#accordionSidebar\">\r\n");
      out.write("			<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("				<a class=\"collapse-item\" href=\"/jv/admin_list.ex?currentPage=1\">전시 목록</a> <a class=\"collapse-item\"\r\n");
      out.write("					href=\"/jv/admin_enrollForm.ex\">전시 추가</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 회원관리 메뉴 -->\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"\"\r\n");
      out.write("		data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("		aria-expanded=\"true\" aria-controls=\"collapseUtilities\"> <i\r\n");
      out.write("			class=\"fas fa-fw fa-wrench\"></i> <span>회원관리</span>\r\n");
      out.write("	</a>\r\n");
      out.write("		<div id=\"collapseUtilities\" class=\"collapse\"\r\n");
      out.write("			aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("			<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("\r\n");
      out.write("				<a class=\"collapse-item\" href=\"/jv/selectmember.admin?currentPage=1\">회원 정보 조회</a>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 서비스관리 메뉴 -->\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"\"\r\n");
      out.write("		data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("		aria-expanded=\"true\" aria-controls=\"collapsePages\"> <i\r\n");
      out.write("			class=\"fas fa-fw fa-folder\"></i> <span>서비스관리</span>\r\n");
      out.write("	</a>\r\n");
      out.write("		<div id=\"collapsePages\" class=\"collapse\"\r\n");
      out.write("			aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("			<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("				<h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("				<a class=\"collapse-item\" href=\"/jv/admin_list.no?currentPage=1\">공지사항\r\n");
      out.write("					목록</a> <a class=\"collapse-item\"\r\n");
      out.write("					href=\"/jv/admin_list.news?currentPage=1\">뉴스레터 목록</a> <a\r\n");
      out.write("					class=\"collapse-item\" href=\"/jv/admin_list.qna?currentPage=1\">1대1문의\r\n");
      out.write("					목록</a> <a class=\"collapse-item\" href=\"/jv/admin_list.re?currentPage=1\">리뷰목록</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div></li>\r\n");
      out.write("\r\n");
      out.write("	<!--예매/결제관리 메뉴-->\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"\"\r\n");
      out.write("		data-target=\"#collapseTwo\" aria-expanded=\"true\"\r\n");
      out.write("		aria-controls=\"collapseTwo\"> <i class=\"fas fa-fw fa-cog\"></i> <span>예매결제관리</span>\r\n");
      out.write("	</a></li>\r\n");
      out.write("\r\n");
      out.write("	<!-- 통계 >메뉴로 넣을지 메인에 넣을지 고민중-->\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link\" href=\"\"> <i\r\n");
      out.write("			class=\"fas fa-fw fa-chart-area\"></i> <span>통계관리</span></a></li>\r\n");
      out.write("\r\n");
      out.write("	<!-- Divider -->\r\n");
      out.write("	<hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("	<div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("		<button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("<!-- 사이드메뉴바 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("	    <!-- Content Wrapper -->\r\n");
      out.write("	    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("	\r\n");
      out.write("	        <!-- content 영역 시작 -->\r\n");
      out.write("	        <div id=\"content\">\r\n");
      out.write("				\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("<!-- 상단바 -->\r\n");
      out.write("<nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\" id=\"adminTopbar\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("        <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 관리자 아이콘 -->\r\n");
      out.write("        <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\" style=\"margin-right: 30px; font-size: 20px;\"><b>ADMIN</b></span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- 상단바 끝-->");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("				\r\n");
      out.write("						<div id=\"member-search-admin\" >\r\n");
      out.write("					        <form action=\"");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=1\" method=\"get\">\r\n");
      out.write("								<select name=\"keyword\" id=\"findType\">\r\n");
      out.write("									<option value=\"\" hidden disabled selected>::검색 유형::</option>\r\n");
      out.write("									<option value=\"memName\">회원이름</option>\r\n");
      out.write("									<option value=\"phone\">연락처</option>\r\n");
      out.write("								</select>\r\n");
      out.write("								<input type=\"text\" name=\"searchword\" placeholder=\"검색어를 입력하세요\" id=\"searchw\" required>\r\n");
      out.write("								<button class=\"btn btn-success\" id=\"searchbtn\">검 색</button>\r\n");
      out.write("								<input type=\"hidden\" name=\"currentPage\" value=\"1\">\r\n");
      out.write("							</form>\r\n");
      out.write("		              </div><br>\r\n");
      out.write("		              				\r\n");
      out.write("					\r\n");
      out.write("						<table id=\"info\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr style=\"background-color:#4e73df; color:white; height:50px;\">\r\n");
      out.write("									<th width=\"20px\" style=\"text-align: center\">NO</th>\r\n");
      out.write("									<th width=\"200px\"style=\"text-align: center\">회원등급</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">아이디</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">비밀번호</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">성함</th>\r\n");
      out.write("									<th width=\"200px\" style=\"text-align: center\">휴대폰번호</th>\r\n");
      out.write("									<th width=\"50px\" style=\"text-align: center\">성별</th>\r\n");
      out.write("									<th width=\"300px\" style=\"text-align: center\">이메일</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">생년월일</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">가입일</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">탈퇴현황</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">정보수정</th>\r\n");
      out.write("									<th width=\"100px\" style=\"text-align: center\">탈퇴</th>\r\n");
      out.write("								  </tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody>\r\n");
      out.write("								");
 for(Member m : list) { 
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td width=\"20px\" style=\"text-align: center\">");
      out.print( m.getMemNo() );
      out.write("</td>\r\n");
      out.write("										<td width=\"200px\"style=\"text-align: center\">");
      out.print( m.getGrCode() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\">");
      out.print( m.getMemId() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\">");
      out.print( m.getMemPwd() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\">");
      out.print( m.getMemName() );
      out.write("</td>\r\n");
      out.write("										<td width=\"200px\" style=\"text-align: center\">");
      out.print( m.getPhone() );
      out.write("</td>\r\n");
      out.write("										<td width=\"40px\" style=\"text-align: center\">");
      out.print( m.getGender() );
      out.write("</td>\r\n");
      out.write("										<td width=\"300px\" style=\"text-align: center\">");
      out.print( m.getEmail() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\">");
      out.print( m.getBirthDate() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\">");
      out.print( m.getEnrollDate() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\">");
      out.print( m.getMemStatus() );
      out.write("</td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\"><a href=\"");
      out.print( contextPath );
      out.write("/adminUpdateForm.me?mno=");
      out.print( m.getMemNo() );
      out.write("\">수정</a></td>\r\n");
      out.write("										<td width=\"100px\" style=\"text-align: center\"><a href=\"");
      out.print( contextPath );
      out.write("/deletemember.admin?mno=");
      out.print( m.getMemNo() );
      out.write("\">삭제</a></td>\r\n");
      out.write("									</tr>\r\n");
      out.write("								");
} 
      out.write("\r\n");
      out.write("							</tbody>	\r\n");
      out.write("						</table><br>\r\n");
      out.write("			\r\n");
      out.write("				\r\n");
      out.write("       			 <div align=\"center\" class=\"paging-area\">\r\n");
      out.write("		            ");
 if(keyword != null) { 
      out.write("\r\n");
      out.write("		            	");
 if(currentPage != 1) { 
      out.write("\r\n");
      out.write("		                    <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=");
      out.print( currentPage - 1 );
      out.write("&searchword=");
      out.print(searchword );
      out.write("&keyword=");
      out.print(keyword );
      out.write("';\">&lt;</button>\r\n");
      out.write("		            	");
 } 
      out.write("\r\n");
      out.write("		            	\r\n");
      out.write("		            	");
 for(int p = startPage; p <= endPage; p++) { 
      out.write("\r\n");
      out.write("		            	\r\n");
      out.write("		            		");
 if(p != currentPage) { 
      out.write("\r\n");
      out.write("		                        <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=");
      out.print( p );
      out.write("&searchword=");
      out.print(searchword );
      out.write("&keyword=");
      out.print(keyword );
      out.write("';\">");
      out.print( p );
      out.write("</button>\r\n");
      out.write("		            		");
 } else { 
      out.write("\r\n");
      out.write("		                        <button disabled>");
      out.print( p );
      out.write("</button>\r\n");
      out.write("		            		");
 } 
      out.write("\r\n");
      out.write("		            	");
 } 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		                ");
 if(currentPage != maxPage) { 
      out.write("\r\n");
      out.write("		                    <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=");
      out.print( currentPage + 1 );
      out.write("&searchword=");
      out.print(searchword );
      out.write("&keyword=");
      out.print(keyword );
      out.write("';\">&gt;</button>\r\n");
      out.write("		            	");
 } 
      out.write("\r\n");
      out.write("		            	\r\n");
      out.write("		            ");
 } else { 
      out.write("\r\n");
      out.write("		            	");
 if(currentPage != 1) { 
      out.write("\r\n");
      out.write("		                    <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=");
      out.print( currentPage - 1 );
      out.write("';\">&lt;</button>\r\n");
      out.write("		            	");
 } 
      out.write("\r\n");
      out.write("		            	\r\n");
      out.write("		            	");
 for(int p = startPage; p <= endPage; p++) { 
      out.write("\r\n");
      out.write("		            	\r\n");
      out.write("		            		");
 if(p != currentPage) { 
      out.write("\r\n");
      out.write("		                        <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=");
      out.print( p );
      out.write("';\">");
      out.print( p );
      out.write("</button>\r\n");
      out.write("		            		");
 } else { 
      out.write("\r\n");
      out.write("		                        <button disabled>");
      out.print( p );
      out.write("</button>\r\n");
      out.write("		            		");
 } 
      out.write("\r\n");
      out.write("		            	");
 } 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		                ");
 if(currentPage != maxPage) { 
      out.write("\r\n");
      out.write("		                    <button onclick=\"location.href='");
      out.print( contextPath );
      out.write("/selectmember.admin?currentPage=");
      out.print( currentPage + 1 );
      out.write("';\">&gt;</button>\r\n");
      out.write("		            	");
 } 
      out.write("\r\n");
      out.write("		            ");
 } 
      out.write("\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <!-- content 영역 끝 -->\r\n");
      out.write("\r\n");
      out.write("	    </div>\r\n");
      out.write("	    <!-- End of Content Wrapper -->\r\n");
      out.write("	    \r\n");
      out.write("	</div>\r\n");
      out.write("	    \r\n");
      out.write("    ");
      out.write("<!-- Bootstrap core JavaScript-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Core plugin JavaScript-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom scripts for all pages-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page level plugins -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
