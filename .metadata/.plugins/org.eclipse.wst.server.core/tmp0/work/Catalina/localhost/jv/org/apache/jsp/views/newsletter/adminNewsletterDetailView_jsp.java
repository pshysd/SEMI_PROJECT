/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-11-07 19:45:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.newsletter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.newsletter.model.vo.Newsletter;
import com.kh.common.model.vo.Attachment;

public final class adminNewsletterDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/views/newsletter/../admin/adminSidebar.jsp", Long.valueOf(1667848462437L));
    _jspx_dependants.put("/views/newsletter/../admin/adminScript.html", Long.valueOf(1667747194709L));
    _jspx_dependants.put("/views/newsletter/../admin/adminTopbar.jsp", Long.valueOf(1667747194710L));
    _jspx_dependants.put("/views/newsletter/../admin/adminPath.jsp", Long.valueOf(1667747194709L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.newsletter.model.vo.Newsletter");
    _jspx_imports_classes.add("com.kh.common.model.vo.Attachment");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
 String contextPath = request.getContextPath(); 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	Newsletter ne = (Newsletter)request.getAttribute("ne");
	ArrayList<Attachment> list = (ArrayList<Attachment>)request.getAttribute("list");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>JV 관리자 페이지</title>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery CDN -->\r\n");
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
      out.write("<style>\r\n");
      out.write("	/* ---------- 전체 스타일 ---------- */\r\n");
      out.write("	/* 영역 사이즈 고정 */\r\n");
      out.write("	.wrapper {\r\n");
      out.write("		width: 2900px;\r\n");
      out.write("		/* 각자 필요한 길이만큼 height 속성값 수정해서 길이 조정 */\r\n");
      out.write("		height: 1500px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/* 1:1문의 커서 갖다대면 바뀌는거 */\r\n");
      out.write("	.qnaTitle:hover {\r\n");
      out.write("		cursor: pointer;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#content-wrapper #accordionSidebar {\r\n");
      out.write("		width: 224px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#content-wrapper {\r\n");
      out.write("		width: 1676px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#accordionSidebar, #content-wrapper {\r\n");
      out.write("		float: left;\r\n");
      out.write("		height: 100%;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/* ----- 추가한 스타일은 여기에 ----- */\r\n");
      out.write("	#news-paging>ul>li { \r\n");
      out.write("	  list-style-type : none; \r\n");
      out.write("	} \r\n");
      out.write("\r\n");
      out.write("	#hr2 {\r\n");
      out.write("			height : 1px;\r\n");
      out.write("			margin-left: 25px;\r\n");
      out.write("			background-color : black;     \r\n");
      out.write("	}\r\n");
      out.write("	#hr3 {\r\n");
      out.write("        width: 90%;\r\n");
      out.write("        height : 0.1px;\r\n");
      out.write("        margin-left: 25px;\r\n");
      out.write("        background-color : black;     \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("\r\n");
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
      out.write("		href=\"/jv/views/admin/adminMain.jsp\">\r\n");
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
      out.write("				<a class=\"collapse-item\" href=\"/jv/admin_list.me?currentPage=1\">회원 정보 조회</a>\r\n");
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
      out.write("\r\n");
      out.write("		<!-- Content Wrapper -->\r\n");
      out.write("		<div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("			<!-- content 영역 시작 -->\r\n");
      out.write("			<div id=\"content\">\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("				<div id=\"admin_contents\">\r\n");
      out.write("					\r\n");
      out.write("					<!-- content 내용 여기에 붙여넣기! -->\r\n");
      out.write("\r\n");
      out.write("			          <div id=\"news-header\">\r\n");
      out.write("			            <h2 style=\"font-size: 40px; margin-left: 40px;\">뉴스레터 관리</h2>\r\n");
      out.write("			          </div>\r\n");
      out.write("			`\r\n");
      out.write("					  <br><br>\r\n");
      out.write("\r\n");
      out.write("			          <div id=\"news-title-wrap\">\r\n");
      out.write("			            <div id=\"news-title\" style=\"font-size: 22px; font-weight: 900; margin-left: 50px;\">");
      out.print( ne.getNewsTitle() );
      out.write("</div>\r\n");
      out.write("			            <span id=\"news-category\" style=\"font-size: 18px; font-weight: 500; margin-left: 50px;\">");
      out.print( ne.getNewsCategory() );
      out.write("</span>\r\n");
      out.write("						<span id=\"news-date\" style=\"font-size: 18px; font-weight: 300; margin-left: 50px;\">");
      out.print( ne.getNewsDate() );
      out.write("</span>\r\n");
      out.write("						<span id=\"news-count\" style=\"font-size: 18px; font-weight: 300; margin-left: 50px;\">");
      out.print( ne.getNewsCount() );
      out.write("</span>\r\n");
      out.write("			          </div>\r\n");
      out.write("\r\n");
      out.write("					  <hr id=\"hr2\"><br>\r\n");
      out.write("			\r\n");
      out.write("			          <div id=\"news-content-wrap\" align=\"center\">\r\n");
      out.write("			            <p>\r\n");
      out.write("			            	");
 for(int i = 0; i < list.size(); i++) { 
      out.write("\r\n");
      out.write("			          			<img src=\"");
      out.print( contextPath );
      out.write('/');
      out.print( list.get(i).getFilePath() + list.get(i).getChangeName() );
      out.write("\" width=\"700px;\" height=\"400px;\">\r\n");
      out.write("			          		");
 } 
      out.write("\r\n");
      out.write("			            </p>\r\n");
      out.write("			            <p>\r\n");
      out.write("			                ");
      out.print( ne.getNewsContent() );
      out.write("\r\n");
      out.write("			            </p>\r\n");
      out.write("			          </div>\r\n");
      out.write("			\r\n");
      out.write("					  <hr id=\"hr3\">\r\n");
      out.write("\r\n");
      out.write("			             <div id=\"news-paging\">\r\n");
      out.write("			               <ul>\r\n");
      out.write("			                   <li id=\"news-prev\">\r\n");
      out.write("									<span style=\"color: dimgray;\"><b>이전 글</b></span> &ensp;\r\n");
      out.write("			                        <a href=\"");
      out.print( contextPath );
      out.write("/admin_detail.news?neno=");
      out.print( ne.getLastNo() );
      out.write('"');
      out.write('>');
      out.print( ne.getLastTitle() );
      out.write("</a>\r\n");
      out.write("			                   </li>\r\n");
      out.write("			                   <li id=\"news-next\">\r\n");
      out.write("									<span style=\"color: dimgray;\"><b>다음 글</b></span> &ensp;\r\n");
      out.write("			                        <a href=\"");
      out.print( contextPath );
      out.write("/admin_detail.news?neno=");
      out.print( ne.getNextNo() );
      out.write('"');
      out.write('>');
      out.print( ne.getNextTitle() );
      out.write("</a>\r\n");
      out.write("			                   </li>\r\n");
      out.write("			               </ul>\r\n");
      out.write("			             </div>\r\n");
      out.write("			   \r\n");
      out.write("			         \r\n");
      out.write("			          <div id=\"notice-bottom-btn\" align=\"center\">\r\n");
      out.write("			            <a href=\"");
      out.print( contextPath );
      out.write("/admin_updateForm.news?neno=");
      out.print( ne.getNewsNo() );
      out.write("\" class=\"btn btn-outline-primary\">수정</a>\r\n");
      out.write("			            <a href=\"");
      out.print( contextPath );
      out.write("/admin_delete.news?neno=");
      out.print( ne.getNewsNo() );
      out.write("\" class=\"btn btn-outline-primary\">삭제</a>\r\n");
      out.write("			            <a href=\"");
      out.print( contextPath );
      out.write("/admin_list.news?currentPage=1\" class=\"btn btn-outline-primary\">목록</a>\r\n");
      out.write("			          </div>\r\n");
      out.write("\r\n");
      out.write(" 				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- content 영역 끝 -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
