<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- 메뉴바 아이콘 -->
<script src="https://kit.fontawesome.com/c7bfbb0e5b.js"
	crossorigin="anonymous"></script>
<!-- 부트스트랩 css 사용 -->
<link rel="stylesheet" href="https://bootswatch.com/5/lux/bootstrap.css">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>
<!-- <title>menubar</title> -->
<!-- index.jsp 타이틀보다 우선하기 때문에 주석처리 -->
</head>
<style>

/* ---------- 전체 스타일 ---------- */
div { /*표 확인용 */
	/* border: 0.5px solid lightgrey;  */
	box-sizing: border-box;
}

.wrap {
	width: 1900px;
}

a {
	text-decoration: none;
}

/* header, content, footer의 공통속성 : 가로길이 100% */
.wrap>div {
	width: 100%;
}

/* ---------- header ---------- */
#header {
	height: 150px;
}

/* 메인메뉴 전체를 감싸는 ul */
#navbar_menu>a {
	display: block;
	line-height: 35px;
}

#navbar_menu {
	display: flex;
	list-style: none;
	padding-left: 0;
	font-size: large;
	position: relative;
	margin-left: 550px;
}

#navbar_menu>li {
	font-size: 20px;
	position: static;
}

/* 각 메인 메뉴 */
.nav-item {
	font-size: 20px;
}

/* 메인메뉴 우측 아이콘 */
#navbar_icons {
	font-size: 20px;
	display: flex;
	padding: 5px 10px;
}

#search, #user, #calender {
	padding: 10px 12px;
}

/* 서브메뉴를 담당하는 ul 태그에 대한 스타일 */
#navbar_menu>li>div {
	list-style-type: none;
	padding: 0px;
	display: none; /* 평소에는 안보여주다가 마우스가 올라가는 순간 보여지게끔 */
	position: absolute;
}
/* 메인메뉴에 마우스가 올라가는 순간 서브메뉴가 펼쳐져서 보이게끔 */
#navbar_menu>li>a:hover+div {
	display: block; /* 메인메뉴에만 마우스가 올라갔을때만 유지됨 */
}
/* 서브메뉴에도 마우스가 올라갈 때 펼쳐진게 유지될 수 있게끔 */
#navbar_menu>li>div:hover {
	display: block;
}
/* 서브메뉴 글씨만 좀 더 작게 보이게끔 */
#navbar_menu>li>div a {
	font-size: 15px;
}

#navbar_menu>li>div a:hover {
	font-size: 18px;
}

/* 고정된 세부메뉴 전체를 감싸는 div */
#navi {
	height: 75px;
	text-align: center;
}

/* ---------- content ---------- */
#content {
	height: 1050px;
	display: flex;
}

#content>div {
	height: 100%;
}

#content_1 {
	width: 15%;
	float: left;
}

#content_2 {
	width: 70%;
	height: 100%;
}

#content_3 {
	width: 15%;
	float: right;
}
</style>
<body>
	<div class="wrap">
		<!--전체를 감싸는 wrap영역-->

		<div id="header">
			<!--헤더영역-->

			<div>
				<nav class="navbar navbar-expand-lg navbar-light bg-light"
					style="border: 1px 0px;">
					<div class="container-fluid">
						<a class="navbar-brand" href="#"><span
							style="margin-left: 10px;">JV</span> ART CENTER</a>
						<button class="navbar-toggler" type="button"
							data-bs-toggle="collapse" data-bs-target="#navbarColor03"
							aria-controls="navbarColor03" aria-expanded="false"
							aria-label="Toggle navigation">
							<span class="navbar-toggler-icon"></span>
						</button>
						<div class="collapse navbar-collapse" id="navbarColor03">
							<ul class="navbar-nav me-auto" id="navbar_menu">
								<li class="nav-item"><a class="nav-link dropdown" href="#"
									role="button" aria-haspopup="true" aria-expanded="false">전시</a>
									<div class="dropdown-menu">
										<a class="dropdown-item" href="#">현재전시</a> <a
											class="dropdown-item" href="#">지난전시</a> <a
											class="dropdown-item" href="#">오픈예정</a>

									</div></li>
								<li class="nav-item"><a class="nav-link"
									href="views/reservation/ReservationStep1View.jsp">예매</a></li>
								<li class="nav-item"><a class="nav-link dropdown" href="#"
									role="button" aria-haspopup="true" aria-expanded="false">안내</a>
									<div class="dropdown-menu">
										<a class="dropdown-item" href="#">JV소개</a> <a
											class="dropdown-item" href="#">전시관 안내</a> <a
											class="dropdown-item" href="#">편의시설 안내</a> <a
											class="dropdown-item" href="#">오시는길</a>

									</div></li>
								<li class="nav-item dropdown"><a class="nav-link dropdown"
									href="#" role="button" aria-haspopup="true"
									aria-expanded="false">서비스</a>
									<div class="dropdown-menu">
										<a class="dropdown-item" href="#">공지사항</a> <a
											class="dropdown-item" href="#">FAQ</a> <a
											class="dropdown-item" href="#">1대1 문의</a> <a
											class="dropdown-item" href="#">뉴스레터</a>
									</div></li>
							</ul>

						</div>
						<div id="navbar_icons">
							<a href=""><i id="search"
								class="fa-solid fa-magnifying-glass"></i></a> <a href=""><i
								id="calender" class="fa-regular fa-calendar-days"></i></a> <a
								href=""><i id="user" class="fa-regular fa-user"></i></a>
						</div>
					</div>
				</nav>
			</div>
		</div>

	</div>
</body>
</html>
