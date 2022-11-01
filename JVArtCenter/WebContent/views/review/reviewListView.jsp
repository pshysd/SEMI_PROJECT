<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.kh.common.model.vo.PageInfo, java.util.ArrayList, com.kh.review.model.vo.Review"%>
<%
	PageInfo pi = (PageInfo) request.getAttribute("pi");
ArrayList<Review> list = (ArrayList<Review>) request.getAttribute("list");

int currentPage = pi.getCurrentPage();
int startPage = pi.getStartPage();
int endPage = pi.getEndPage();
int maxPage = pi.getMaxPage();
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

<title>리뷰 현황 조회 게시판</title>

<!-- 아이콘/글씨체 링크-->
<link href="resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- CSS -->
<link href="resources/css/sb-admin-2.min.css" rel="stylesheet">

<style>
/* ---------- 전체 스타일 ---------- */
/* 영역 사이즈 고정 */
.wrapper {
	width: 1900px;
	/* 각자 필요한 길이만큼 height 속성값 수정해서 길이 조정 */
	height: 1000px;
}

;
#accordionSidebar {
	width: 224px;
}

#content-wrapper {
	width: 1676px;
}

#accordionSidebar, #content-wrapper {
	float: left;
	height: 100%;
}
</style>
</head>
<body>
	<div class="wrapper">

		<%@ include file="/views/admin/adminSidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- content 영역 시작 -->
			<div id="content">

				<%@ include file="/views/admin/adminTopbar.jsp"%>

				<div id="admin_contents">

					<table style="text-align: center; margin: auto;">
						<thead>
							<tr>
								<th>번호</th>
								<th>작성자</th>
								<th>전시명</th>
								<th>내용</th>
								<th>평점</th>
								<th>작성일</th>
							</tr>
						</thead>
						<tbody>
							<%
								if (list.isEmpty()) {
							%>
							<td colspan="6">조회 결과가 없습니다.</td>
							<%
								} else {
							%>
							<%
								for (Review r : list) {
							%>
							<tr>
								<td><%=r.getReviewNo()%></td>
								<td><%=r.getMemNo()%></td>
								<td><%=r.getExNo()%></td>
								<td><%=r.getReviewContent()%></td>
								<td><%=r.getRating()%></td>
								<td><%=r.getReviewDate()%></td>
								<td><button type="button" onclick="deleteConfirm('<%=contextPath%>/delete.re?rno=<%=r.getReviewNo()%>')">삭제하기</button>
							</tr>
							<%
								}
							%>
							<%
								}
							%>
						</tbody>
					</table>
					<script>
						function deleteConfirm(url){
							if(confirm('정말 삭제하시겠습니까?')){
								location.href=url;
							}
						}
					</script>
					<br> <br>

					<div align="center">
						<%
							if (currentPage != 1) {
						%>
						<button
							onclick="location.href='<%=contextPath%>/list.re?currentPage=<%=currentPage - 1%>'">&lt;</button>
						<%
							}
						%>
						<%
							for (int p = startPage; p <= endPage; p++) {
						%>
						<%
							if (p != currentPage) {
						%>
						<button
							onclick="location.href='<%=contextPath%>/list.re?currentPage=<%=p%>'"><%=p%></button>
						<%
							} else {
						%>
						<button disabled><%=p%></button>
						<%
							}
						%>
						<%
							}
						%>
						<%
							if (currentPage != maxPage) {
						%>
						<button
							onclick="location.href='<%=contextPath%>/list.re?currentPage=<%=currentPage + 1%>'">&gt;</button>
						<%
							}
						%>
					</div>
				</div>

			</div>
			<!-- content 영역 끝 -->

		</div>
		<!-- End of Content Wrapper -->

	</div>

	<%@ include file="/views/admin/adminScript.html"%>

</body>
</html>