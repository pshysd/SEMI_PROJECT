/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-10-31 04:50:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.newsletter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newsletterListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/admin/adminScript.html", Long.valueOf(1666938634227L));
    _jspx_dependants.put("/views/admin/adminSidebar.jsp", Long.valueOf(1667181100098L));
    _jspx_dependants.put("/views/admin/adminTopbar.jsp", Long.valueOf(1666846132000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<title>JV 관리자 뉴스레터 게시판</title>\r\n");
      out.write("\r\n");
      out.write("<!-- 아이콘/글씨체 링크-->\r\n");
      out.write("<link href=\"resources/vendor/fontawesome-free/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link href=\"resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("/* ---------- 전체 스타일 ---------- */\r\n");
      out.write("/* 영역 사이즈 고정 */\r\n");
      out.write(".wrapper {\r\n");
      out.write("	width: 1900px;\r\n");
      out.write("	/* 각자 필요한 길이만큼 height 속성값 수정해서 길이 조정 */\r\n");
      out.write("	height: 1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(";\r\n");
      out.write("#accordionSidebar {\r\n");
      out.write("	width: 224px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content-wrapper {\r\n");
      out.write("	width: 1676px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#accordionSidebar, #content-wrapper {\r\n");
      out.write("	float: left;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("    ");
 String contextPath = request.getContextPath(); 
      out.write("\r\n");
      out.write("<!-- 사이드메뉴바 -->\r\n");
      out.write("<ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("    <!-- Sidebar - Brand -->\r\n");
      out.write("    <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"");
      out.print(contextPath);
      out.write("/\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">JV artcenter admin</div>\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"sidebar-brand-icon rotate-n-15\"> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Divider -->\r\n");
      out.write("    <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <!-- 전시관리 메뉴 -->\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("            aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("            <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("            <span>전시관리</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/list.ex?currentPage=1\">전시 목록</a>\r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/insert.ex\">전시 추가</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- 회원관리 메뉴 -->\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("            aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("            <i class=\"fas fa-fw fa-wrench\"></i>\r\n");
      out.write("            <span>회원관리</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
      out.write("            data-parent=\"#accordionSidebar\">\r\n");
      out.write("            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("              \r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/list.mb?currentPage=1\">회원 정보 조회</a>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <!-- 서비스관리 메뉴 -->\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("            aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("            <i class=\"fas fa-fw fa-folder\"></i>\r\n");
      out.write("            <span>서비스관리</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("            <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                <h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/list.no\">공지사항</a>\r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/list.nl\">뉴스레터</a>\r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/list.qna\">1대1문의</a>\r\n");
      out.write("                <a class=\"collapse-item\" href=\"");
      out.print(contextPath);
      out.write("/list.re\">리뷰</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("    <!--예매/결제관리 메뉴-->\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"\" data-target=\"#collapseTwo\"\r\n");
      out.write("            aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("            <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("            <span>예매결제관리</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("    <!-- 통계 >메뉴로 넣을지 메인에 넣을지 고민중-->\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"\">\r\n");
      out.write("            <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("            <span>통계관리</span></a>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("    <!-- Divider -->\r\n");
      out.write("    <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("    <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("    </div>\r\n");
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
      out.write("\r\n");
      out.write("					<table style=\"text-align: center; margin: auto;\">\r\n");
      out.write("						<thead>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th>글 번호</th>\r\n");
      out.write("								<th>카테고리</th>\r\n");
      out.write("								<th>제목</th>\r\n");
      out.write("								<th>작성일</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>5</td>\r\n");
      out.write("								<td>카테고리5</td>\r\n");
      out.write("								<td>글제목5</td>\r\n");
      out.write("								<td>2022-10-19</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>4</td>\r\n");
      out.write("								<td>카테고리4</td>\r\n");
      out.write("								<td>글제목4</td>\r\n");
      out.write("								<td>2022-10-18</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>3</td>\r\n");
      out.write("								<td>카테고리3</td>\r\n");
      out.write("								<td>글제목3</td>\r\n");
      out.write("								<td>2022-10-17</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>2</td>\r\n");
      out.write("								<td>카테고리2</td>\r\n");
      out.write("								<td>글제목2</td>\r\n");
      out.write("								<td>2022-10-16</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1</td>\r\n");
      out.write("								<td>카테고리1</td>\r\n");
      out.write("								<td>글제목1</td>\r\n");
      out.write("								<td>2022-10-15</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("					<br>\r\n");
      out.write("					<div align=\"center\">\r\n");
      out.write("						<a href=\"");
      out.print(contextPath);
      out.write("/enrollForm.nl\">뉴스레터 작성하기</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- content 영역 끝 -->\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<!-- Bootstrap core JavaScript-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Core plugin JavaScript-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom scripts for all pages-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page level plugins -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page level custom scripts -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/demo/chart-pie-demo.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
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
