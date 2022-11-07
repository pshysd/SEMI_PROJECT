<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.kh.member.model.vo.Member"%>
<%
	Member m = (Member)request.getAttribute("m");
	String contextPath = request.getContextPath();
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

<title>회원정보 수정 페이지</title>

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
					<form id="update-form" action="<%=contextPath%>/update.me"
						method="post">
						<input type="hidden" name="memNo" value="<%=m.getMemNo()%>">
						<table align="center" border="1px solid black">
							<tr>
								<td>이름</td>
								<td><input type="text" name="memName" id="" value="<%=m.getMemName()%>"></td>
								<td>등급</td>
								<td><input type="radio" name="grade" id="common" value="GR1"><label for="common">일반 </label> 
									<input type="radio" name="grade" id="vip" value="GR2"><label for="vip">VIP </label> 
									<input type="radio" name="grade" id="vvip" value="GR3"><label for="vvip">VVIP </label>
								</td>
							</tr>
							<tr>
								<td>성별</td>
								<td>
									<input type="radio" name="gender" id="M" value="M"><label for="M">남성</label>
									<input type="radio" name="gender" id="F" value="F"><label for="F">여성</label>
								</td>
								<td>연락처</td>
								<td><input type="text" name="phone" id="" value="<%=m.getPhone()%>" required></td>
							</tr>
							<tr>
								<td>아이디</td>
								<td><input type="text" name="memId" id="" value="<%=m.getMemId()%>"></td>
								<td>이메일</td>
								<td><input type="email" name="email" id="" value="<%=m.getEmail()%>"></td>
							</tr>
							<tr>
								<td>생년월일</td>
								<td><input type="date" name="birthDate" id="" value="<%=m.getBirthDate()%>"></td>
								<td>탈퇴여부</td>
								<td><input type="radio" name="status" id="Y" value="Y"><label for="Y">탈퇴</label>
								<input type="radio" name="status" id="N" value="N"><label for="N">가입</label></td>
							</tr>
						</table>
						<br>
						<div align="center">
							<button type="submit">수정하기</button>
						</div>
					</form>
				</div>
			</div>
			<!-- content 영역 끝 -->

			<script>
				const grade = document.querySelectorAll('input[name=grade]');
				const gender = document.querySelectorAll('input[name=gender]');
				const status = document.querySelectorAll('input[name=status]');
				grade.forEach((item) => {
					if(item.value === '<%=m.getGrCode()%>'){
						item.checked = true;
					}
				})

				gender.forEach(item => {
					if(item.id === '<%=m.getGender()%>'){
						item.checked = true;
					}
				})

				status.forEach(item => {
					if(item.id === '<%=m.getMemStatus()%>'){
						item.checked = true;
					}
				})
				
			</script>
		</div>
		<!-- End of Content Wrapper -->

	</div>

	<%@ include file="/views/admin/adminScript.html"%>

</body>
</html>