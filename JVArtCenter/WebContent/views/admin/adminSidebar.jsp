<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 사이드메뉴바 -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="views/admin/adminMain.jsp">

		<div class="sidebar-brand-text mx-3">JV artcenter admin</div>
	</a>
	<div class="sidebar-brand-icon rotate-n-15"></div>
	<!-- Divider -->
	<hr class="sidebar-divider my-0">



	<!-- 전시관리 메뉴 -->
	<li class="nav-item"><a class="nav-link collapsed" href=""
		data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true"
		aria-controls="collapseTwo"> <i class="fas fa-fw fa-cog"></i> <span>전시관리</span>
	</a>
		<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="/jv/admin_list.ex?currentPage=1">전시 목록</a> <a class="collapse-item"
					href="/jv/admin_enrollForm.ex">전시 추가</a>
			</div>
		</div></li>



	<!-- 회원관리 메뉴 -->
	<li class="nav-item"><a class="nav-link collapsed" href=""
		data-toggle="collapse" data-target="#collapseUtilities"
		aria-expanded="true" aria-controls="collapseUtilities"> <i
			class="fas fa-fw fa-wrench"></i> <span>회원관리</span>
	</a>
		<div id="collapseUtilities" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">

				<a class="collapse-item" href="/jv/selectmember.admin?currentPage=1">회원 정보 조회</a>

			</div>
		</div></li>



	<!-- 서비스관리 메뉴 -->
	<li class="nav-item"><a class="nav-link collapsed" href=""
		data-toggle="collapse" data-target="#collapsePages"
		aria-expanded="true" aria-controls="collapsePages"> <i
			class="fas fa-fw fa-folder"></i> <span>서비스관리</span>
	</a>
		<div id="collapsePages" class="collapse"
			aria-labelledby="headingPages" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Login Screens:</h6>
				<a class="collapse-item" href="/jv/admin_list.no?currentPage=1">공지사항
					목록</a> <a class="collapse-item"
					href="/jv/admin_list.news?currentPage=1">뉴스레터 목록</a> <a
					class="collapse-item" href="/jv/admin_list.qna?currentPage=1">1대1문의
					목록</a> <a class="collapse-item" href="/jv/admin_list.re?currentPage=1">리뷰목록</a>
			</div>
		</div></li>

	<!--예매/결제관리 메뉴-->
	<li class="nav-item"><a class="nav-link collapsed" href=""
		data-target="#collapseTwo" aria-expanded="true"
		aria-controls="collapseTwo"> <i class="fas fa-fw fa-cog"></i> <span>예매결제관리</span>
	</a></li>

	<!-- 통계 >메뉴로 넣을지 메인에 넣을지 고민중-->
	<li class="nav-item"><a class="nav-link" href=""> <i
			class="fas fa-fw fa-chart-area"></i> <span>통계관리</span></a></li>

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>
<!-- 사이드메뉴바 끝 -->

