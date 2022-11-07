<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.ArrayList, com.kh.exhibition.model.vo.Exhibition,, com.kh.common.model.vo.Attachment"%>
<%@ include file="adminPath.jsp"%>
<%-- 스트립틀릿은 여기에 --%>
<%
	Exhibition e = (Exhibition) request.getAttribute("e");
ArrayList<Attachment> list = (ArrayList<Attachment>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>JV 관리자 페이지</title>

<!-- JQuery CDN -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- chart.js CDN (차트 api) -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>

<!-- swiper.js CDN (이미지 스와이프 api) -->
<link rel="stylesheet"
	href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<!-- <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script> -->

<!-- 아이콘/글씨체 링크-->
<link
	href="https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/startbootstrap-sb-admin-2@4.1.4/css/sb-admin-2.min.css"
	rel="stylesheet">

<style>
/* ---------- 전체 스타일 ---------- */
/* 영역 사이즈 고정 */
.wrapper {
	width: 2900px;
	/* 각자 필요한 길이만큼 height 속성값 수정해서 길이 조정 */
	height: 1500px;
}

/* 1:1문의 커서 갖다대면 바뀌는거 */
.qnaTitle:hover {
	cursor: pointer;
	font-weight: bold;
}

#content-wrapper #accordionSidebar {
	width: 224px;
}

#content-wrapper {
	width: 1676px;
}

#accordionSidebar, #content-wrapper {
	float: left;
	height: 100%;
}

/* ----- 추가한 스타일은 여기에 ----- */
#hr3 {
	width: 90%;
	height: 0.1px;
	margin-left: 25px;
	background-color: black;
}
</style>
</head>

<body>
	<div class="wrapper">

		<%@ include file="adminSidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- content 영역 시작 -->
			<div id="content">

				<%@ include file="adminTopbar.jsp"%>

				<div id="admin_contents">

					<!-- content 내용 여기에 붙여넣기! -->

					<div id="exihibit-header">
						<h2 style="font-size: 40px; margin-left: 40px;">전시 관리</h2>
					</div>

					<br>
					<br>

					<div>
						<table align="center">
							<tr>
								<th width="300px">제목</th>
								<td width="600px"><%=%></td>
							</tr>
							<tr>
								<th>전시장</th>
								<td><%=%></td>
							</tr>
							<tr>
								<th>내용</th>
								<td><%=%></td>
							</tr>
							<tr>
								<th>시작일</th>
								<td><%=%></td>
							</tr>
							<tr>
								<th>종료일</th>
								<td><%=%></td>
							</tr>
							<tr>
								<th>가격</th>
								<td><%=%></td>
							</tr>
							<tr>
								<th>작가</th>
								<td><%=%></td>
							</tr>
						</table>
					</div>

					<div id="exhibit-attachment-wrap" align="center">
						<pre><%=%></pre>
						<p>
							<%
								for (int i = 0; i < list.size(); i++) {
							%>
							<img
								src="<%=contextPath%>/<%=list.get(i).getFilePath() + list.get(i).getChangeName()%>"
								width="700px;" height="400px;">
							<%
								}
							%>
						</p>
					</div>

					<hr id="hr3">

					<div id=exhibit-bottom-btn " align="center">
						<a href="#" class="btn btn-outline-primary">수정</a> 
						<a href="#" class="btn btn-outline-primary">삭제</a> 
						<a href="#" class="btn btn-outline-primary">목록</a>
					</div>

				</div>

			</div>
			<!-- content 영역 끝 -->
		</div>
		<!-- End of Content Wrapper -->

	</div>

	<%@ include file="adminScript.html"%>

</body>

</html>