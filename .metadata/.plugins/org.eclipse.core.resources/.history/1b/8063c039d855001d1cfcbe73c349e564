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
<link href="../../resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- CSS -->
<link href="../../resources/css/sb-admin-2.min.css" rel="stylesheet">

<style>
/* ---------- 전체 스타일 ---------- */
/* 영역 사이즈 고정 */
.wrapper {
	width: 1900px;
	/* 각자 필요한 길이만큼 height 속성값 수정해서 길이 조정 */
	height: 2400px;
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
					<!-- 첫번째 줄 // 뭔 매출이였지 일단 오늘 -->
					<div class="rows">
						<div id="today">TODAY</div>
						<div id="todayee">₩ 50,000</div>
					</div>

					<!-- 두번째 줄 // 월간 매출, 성별별 통계 -->
					<div class="rows">
						<div class="barChart">
							<canvas id="perMonth"></canvas>
						</div>
						<div class="circleChart">
							<canvas id="gender"></canvas>
						</div>
					</div>
					<!-- 차트 js영역 -->
					<script type="text/javascript">
									var lineContext = document.getElementById('perMonth')
										.getContext('2d');
									var perMonth = new Chart(lineContext, {
										type: 'line', // 차트의 형태
										data: { // 차트에 들어갈 데이터
											labels: [
												//x 축
												'7월', '8월', '9월', '10월', '11월', '12월'],
											datasets: [{ //데이터
												label: '월간 매출 추이', //차트 제목
												fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
												data: [1000000, 1200000, 3300000,
													5500000, 5200000, 7000000, 12000000 //x축 label에 대응되는 데이터 값
												],
												backgroundColor: [
													//색상
													'rgba(255, 99, 132, 0.2)'],
												borderColor: [
													//경계선 색상
													'rgba(255, 99, 132, 1)'],
												//경계선 굵기
												borderWidth: 3
											}]
										},
										options: {
											maintainAspectRatio: false,
											scales: {
												yAxes: [{
													ticks: {
														beginAtZero: true
													}
												}]
											}
										}
									});
									var CircleContext = document.getElementById('gender')
										.getContext('2d');
									var gender = new Chart(CircleContext, {
										type: 'doughnut', // 차트의 형태
										data: { // 차트에 들어갈 데이터
											labels: [
												//x 축
												'20대 남성', '20대 여성', '30대 남성', '30대 여성'],
											datasets: [{ //데이터
												label: '성별별 예매율', //차트 제목
												fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
												data: [10, 30, 20, 40 //x축 label에 대응되는 데이터 값
												],
												backgroundColor: [
													//색상
													'rgba(255, 99, 132, 0.2)',
													'rgba(54, 162, 235, 0.2)',
													'rgba(255, 206, 86, 0.2)',
													'rgba(75, 192, 192, 0.2)',
													'rgba(153, 102, 255, 0.2)',
													'rgba(255, 159, 64, 0.2)'],
												borderColor: [
													//경계선 색상
													'rgba(255, 99, 132, 1)',
													'rgba(54, 162, 235, 1)',
													'rgba(255, 206, 86, 1)',
													'rgba(75, 192, 192, 1)',
													'rgba(153, 102, 255, 1)',
													'rgba(255, 159, 64, 1)'],
												borderWidth: 1
												//경계선 굵기
											}]
										},
										options: {
											maintainAspectRatio: false,
											scales: {
												yAxes: [{
													ticks: {
														beginAtZero: true
													}
												}]
											}
										}
									});
								</script>
					<!-- 세번째 줄 // 답변 대기중인 1:1 문의
						-> 글 제목 클릭 시 상세페이지
					-->
					<div>
						<table style="text-align:center;">
							<thead>
								<tr>
									<th>글 번호</th>
									<th>카테고리</th>
									<th>글 제목</th>
									<th>작성자</th>
									<th>날짜</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>31</td>
									<td>결제</td>
									<td class="qnaTitle">할인해주세요</td>
									<td>진상1</td>
									<td>2022-10-17</td>
								</tr>
								<tr>
									<td>22</td>
									<td>기타</td>
									<td class="qnaTitle">직원분 맘에들어서그러는데 연락처좀알려주세요</td>
									<td>진상2</td>
									<td>2022-10-13</td>
								</tr>
								<tr>
									<td>15</td>
									<td>전시</td>
									<td class="qnaTitle">제가해도이거보다잘할거같은데</td>
									<td>진상3</td>
									<td>2022-10-11</td>
								</tr>
							</tbody>
						</table>
					</div>

					<script>
									const qnaTitles = document.querySelectorAll('.qnaTitle');

									qnaTitles.forEach(item => {
										item.addEventListener('click', onClickHandler);
									})

									function onClickHandler(event) {
										const qno = event.currentTarget.previousElementSibling.previousElementSibling.textContent;
										// 제이쿼리 못써서 지저분함니다 정리가능하신분 정리바람의나라

										location.href="/jv/detail.qna?qno="+qno;
									}
					</script>
				</div>

			</div>
			<!-- content 영역 끝 -->
		</div>
		<!-- End of Content Wrapper -->

	</div>

	<%@ include file="adminScript.html"%>

</body>

</html>