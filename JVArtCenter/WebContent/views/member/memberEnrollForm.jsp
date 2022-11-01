<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.kh.member.model.vo.Member"%>
<%@ include file="../common/menubar.jsp"%>
<%
	Member m = (Member) request.getAttribute("m");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
#content_2 {
	margin: auto;
}
</style>
</head>
<body>

	<div id="content">
		<!--바디-->
		<div id="content_1">왼쪽여백</div>
		<div id="content_2">

			<div id="register-form">
				<!--회원가입 폼-->
				<div id="userId">
					<p>로그인 정보 * 표시는 필수 입력항목입니다.</p>
					아이디*<br> <input type="text" name="id"
						placeholder="아이디를 입력해주세요." required>
					<button style="margin-left: 1%">중복체크</button>
					<br>
					<br>
				</div>
				<div id="userPassword">
					비밀번호*<br> <input type="password" name="password"
						value="password" placeholder="비밀번호를 입력해주세요."> <br>
					<br>
				</div>
				<div id="passChecked">
					비밀번호 확인*<br> <input type="password" name="passwordchecked"
						placeholder="비밀번호를 재입력 해 주세요."> <br>
					<br>
				</div>

				<div id="name">
					이름*<br> <input type="text" name="userName"
						placeholder="이름을 입력해주세요." required>
				</div>
				<br>

				<div id="telephone">
					휴대폰번호*<br> <select>
						<option value="">010</option>
						<option value="">011</option>
						<option value="">016</option>
						<option value="">017</option>
						<option value="">018</option>
						<option value="">019</option>
					</select> - <input type="number"> - <input type="number">
				</div>

				<div id="email">
					이메일*<br> <input type="text" id="emailid" name="userEmail"
						placeholder="이메일 입력" required>@ <input type="text"
						id="domain-txt"> <select class="box" id="domin-list">
						<option value="type">직접입력</option>
						<option value="naver.com">naver.com</option>
						<option value="google.com">google.com</option>
						<option value="hanmail.net">hanmail.net</option>
						<option value="nate.com">nate.com</option>
						<option value="kakao.com">kakao.com</option>
					</select>
					<button>이메일인증</button>
				</div>
				<br> 생년월일
				<div class="info" id="info__birth">
					<select class="box" id="birth-year">
						<option disabled selected>출생 연도</option>
					</select> <select class="box" id="birth-month">
						<option disabled selected>월</option>
					</select> <select class="box" id="birth-day">
						<option disabled selected>일</option>
					</select>
				</div>
				<br>

				<div>
					<button type="reset">취소</button>
					<button type="submit">가입하기</button>
				</div>

			</div>
		</div>
		<div id="content_3">오른쪽여백</div>
	</div>

	<%@ include file="../common/footerbar.jsp"%>

	<script>

      // 도메인 직접 입력 or domain option 선택
      const domainListEl = document.querySelector('#domain-list')
      const domainInputEl = document.querySelector('#domain-txt')
// select 옵션 변경 시
      domainListEl.addEventListener('change', (event) => {
  // option에 있는 도메인 선택 시
    if(event.target.value !== "type") {
    // 선택한 도메인을 input에 입력하고 disabled
    domainInputEl.value = event.target.value
    domainInputEl.disabled = true
    } else { // 직접 입력 시
    // input 내용 초기화 & 입력 가능하도록 변경
    domainInputEl.value = ""
    domainInputEl.disabled = false
   }
});

// '출생 연도' 셀렉트 박스 option 목록 동적 생성
const birthYearEl = document.querySelector('#birth-year')
// option 목록 생성 여부 확인
isYearOptionExisted = false;
birthYearEl.addEventListener('focus', function () {
  // year 목록 생성되지 않았을 때 (최초 클릭 시)
  if(!isYearOptionExisted) {
    isYearOptionExisted = true
    for(var i = 1940; i <= 2022; i++) {
      // option element 생성
      const YearOption = document.createElement('option')
      YearOption.setAttribute('value', i)
      YearOption.innerText = i
      // birthYearEl의 자식 요소로 추가
      this.appendChild(YearOption);
    }
  }
});
// Month, Day도 동일한 방식으로 구현
     </script>
</body>
</html>