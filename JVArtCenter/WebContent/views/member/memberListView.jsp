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

<title>JV 관리자 회원정보 조회 게시판</title>

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
								<th>회원번호</th>
								<th>아이디</th>
								<th>이름</th>
								<th>주소</th>
								<th>성별</th>
								<th>이메일</th>
								<th>정보 수정</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>3</td>
								<td>user03</td>
								<td>삼유저</td>
								<td>영등포구청역 3번 출구</td>
								<td>남</td>
								<td>user03@kh.com</td>
								<td><button type="button">수정하기</button></td>
							</tr>
							<tr>
								<td>2</td>
								<td>user02</td>
								<td>이유저</td>
								<td>강남역 5번 출구</td>
								<td>여</td>
								<td>user02@kh.com</td>
								<td><button type="button">수정하기</button></td>
							</tr>
							<tr>
								<td>1</td>
								<td>user01</td>
								<td>일유저</td>
								<td>수원역 11번 출구</td>
								<td>남</td>
								<td>user01@kh.com</td>
								<td><button type="button">수정하기</button></td>
							</tr>
						</tbody>
					</table>
				</div>

			</div>
			<!-- content 영역 끝 -->

		</div>
		<!-- End of Content Wrapper -->

	</div>

	<%@ include file="/views/admin/adminScript.html"%>

</body>
</html>