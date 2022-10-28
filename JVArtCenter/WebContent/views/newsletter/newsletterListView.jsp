<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>JV 관리자 뉴스레터 게시판</title>

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
								<th>글 번호</th>
								<th>카테고리</th>
								<th>제목</th>
								<th>작성일</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>5</td>
								<td>카테고리5</td>
								<td>글제목5</td>
								<td>2022-10-19</td>
							</tr>
							<tr>
								<td>4</td>
								<td>카테고리4</td>
								<td>글제목4</td>
								<td>2022-10-18</td>
							</tr>
							<tr>
								<td>3</td>
								<td>카테고리3</td>
								<td>글제목3</td>
								<td>2022-10-17</td>
							</tr>
							<tr>
								<td>2</td>
								<td>카테고리2</td>
								<td>글제목2</td>
								<td>2022-10-16</td>
							</tr>
							<tr>
								<td>1</td>
								<td>카테고리1</td>
								<td>글제목1</td>
								<td>2022-10-15</td>
							</tr>
						</tbody>
					</table>
					<br>
					<div align="center">
						<a href="<%=contextPath%>/enrollForm.nl">뉴스레터 작성하기</a>
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