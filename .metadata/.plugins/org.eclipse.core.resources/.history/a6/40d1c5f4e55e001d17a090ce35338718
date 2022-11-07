<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ include
file="../common/menubar.jsp" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <!-- JQuery CDN -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <title>회원가입</title>

    <style>
      #register {
        font-size: 40px;
        font-weight: 600;
        text-align: center;
        margin-bottom: 20px;
      }

      #known {
        font-size: 15.5px;
        font-weight: 500;
        text-align: center;
        color: rgba(0, 0, 0, 0.631);
        margin-top: 10px;
      }

      .must::before {
        content: '*';
        color: red;
      }

      #resetbtn,
      #submitbtn {
        width: 15% !important;
        vertical-align: center;
      }

      #enroll-form {
        width: 80%;
        margin: auto;
      }

      #userId,
      #userPassword,
      #pwdChecked,
      #name,
      #telephone,
      #email,
      #gender,
      #birthday {
        height: 40px;
        margin: 15px;
      }

      #enroll > div > label,
      #enroll > div > input {
        height: 100%;
        padding: 5px;
        vertical-align: middle;
      }

      #enroll label {
        width: 150px;
        line-height: 30px;
      }

      #enroll input[type='text'],
      #enroll input[type='password'] {
        width: 250px;
      }

      #telephone > input {
        width: 100px !important;
      }

      #emailid,
      #domain-txt,
      #domain-list {
        width: 150px !important;
      }

      .box {
        width: 100px;
        height: 100%;
        vertical-align: middle;
        margin-right: 5px;
      }

      #idCheck,
      #emailCheck {
        height: 100%;
        margin: 0px 5px !important;
        padding: 10px 20px;
      }

      #enroll button:hover {
        cursor: pointer;
      }

      #gender input[type='radio'] {
        width: 17px !important;
        margin-right: 10px;
        height: 17px !important;
        line-height: 30px;
      }

      #gender span {
        margin-right: 10px;
        height: 15px;
        line-height: 30px;
      }

      #enroll {
        margin-left: 120px;
        margin-top: 20px;
      }
    </style>
  </head>
  <body>
    <div class="wrap">
      <div id="navi">
        <!--세부메뉴 영역-->
      </div>

      <div id="content">
        <!--바디-->
        <div id="content_1"></div>
        <div id="content_2">
          <form id="enroll-form" action="<%= contextPath %>/insert.me" method="post">
            <h3 id="register">회원가입</h3>
            <div class="progress">
              <div
                class="progress-bar progress-bar-striped progress-bar-animated"
                role="progressbar"
                aria-valuenow="100"
                aria-valuemin="0"
                aria-valuemax="100"
                style="width: 100%"
              ></div>
            </div>
            <br />

            <h5 id="known">
              회원님의 개인정보를 안전하게 보호하고 있으며, 회원님의 동의 없이는 공개 또는 제3자에게 제공되지 않습니다.
              <br />
              입력하신 이메일 주소로 예매내역이 발송됩니다.
            </h5>
            <br /><br />
            <div id="enroll">
              <!--회원가입 폼-->
              <p style="color: rgba(247, 7, 7, 0.835); font-weight: bold; margin: 0px" class="must">
                표시는 필수입력 항목입니다.
              </p>
              <br /><br />
              <div id="userId">
                <label class="must"> 아이디</label>
                <input type="text" name="memId" placeholder="아이디를 입력해주세요." required />
                <button id="idCheck" class="btn btn-dark">중복확인</button>
              </div>
              <div id="userPassword">
                <label class="must"> 비밀번호</label>
                <input type="password" name="memPwd" placeholder="비밀번호를 입력해주세요." required />
              </div>
              <div id="pwdChecked">
                <label class="must"> 비밀번호 확인</label>
                <input type="password" placeholder="비밀번호를 재입력해주세요." required />
              </div>

              <div id="name">
                <label class="must"> 이름</label>
                <input type="text" name="memName" placeholder="이름을 입력해주세요." required />
              </div>

              <div id="telephone">
                <label>- 휴대폰번호</label>
                <select class="box" name="phone1" id="phone" style="width: 70px">
                  <option value="010" selected>010</option>
                  <option value="011">011</option>
                  <option value="016">016</option>
                  <option value="017">017</option>
                  <option value="018">018</option>
                  <option value="019">019</option>
                </select>
                - <input type="text" name="phone2" /> - <input type="text" name="phone3" />
              </div>

              <div id="email">
                <label class="must"> 이메일</label>
                <input class="box" id="emailid" type="text" name="email1"0 /> @
                <input class="box" id="domain-txt" type="text" name="email2" />&nbsp;
                <select class="box" id="domain-list" id="domin">
                  <option value="type">직접입력</option>
                  <option value="naver.com">naver.com</option>
                  <option value="gmail.com">gmail.com</option>
                  <option value="hanmail.net">hanmail.net</option>
                  <option value="nate.com">nate.com</option>
                  <option value="hotmail.com">hotmail.com</option>
                </select>
                <button type="button" id="checkEmail" class="btn btn-dark">이메일인증</button>
              </div>
              <div id="checkAuth"style="display:none">
                <input type="text">
                <button type="button" class="btn">인증하기</button>
              </div>
              <div id="gender">
                <label class="must"> 성별</label>
                <input type="radio" name="gender" value="M" /><span>남</span>
                <input type="radio" name="gender" value="F" /><span>여</span>
              </div>

              <div id="birthday">
                <label>- 생년월일</label>
                <select class="box" id="birth-year" name="year">
                  <option disabled selected>연도</option>
                  <% for(int i = 1940; i <= 2022; i ++) { %>
                  <option><%= i %></option>
                  <% } %>
                </select>
                <select class="box" id="birth-month" name="month">
                  <option disabled selected>월</option>
                  <% for(int i = 1; i <= 12; i ++) { %>
                  <option><%= i %></option>
                  <% } %>
                </select>
                <select class="box" id="birth-day" name="day">
                  <option disabled selected>일</option>
                  <% for(int i = 1; i <= 31; i ++) { %>
                  <option><%= i %></option>
                  <% } %>
                </select>
              </div>
              <br /><br /><br />
            </div>

            <div align="center">
              <button type="reset" id="resetbtn" class="btn btn-primary">초기화</button>
              <button type="submit" id="submitbtn" class="btn btn-dark">회원가입</button>
            </div>
          </form>

          <script>
            $("#domain-list").on("change", function() {
            	// console.log($("#domain-list").val());

            	if($(this).val() !== "type") {
            		$("#domain-txt").val($(this).val());
            		$("#domain-txt").attr("disabled", true);
            	} else {
            		$("#domain-txt").val("");
            		$("#domain-txt").attr("disabled", false);
            	}
            });
          
            const idCheckBtn = document.getElementById('idCheck')

            idCheckBtn.addEventListener('click', () => {
              $.ajax({
                url : '<%=contextPath%>/idCheck.me',
                type : 'get',
                data : {memId : $('input[name=memId]').val()},
                success : (res) => {
                  if(res === "NNNNN"){
                    alert('이미 사용중이거나 탈퇴한 회원의 아이디입니다. 다른 아이디를 입력해주세요');
                    $('input[name=memId]').val('');
                    $('input[name=memId]').focus();
                  }else{
                    alert('사용 가능한 아이디입니다.');
                    $('input[name=memPwd]').focus();
                  }
                },
                error : console.log('아이디 체크 AJAX 통신 중 문제 발생') // 잘되는데 이거 왜뜨지
              })
            });

            const checkEmailBtn = document.getElementById('checkEmail');

              checkEmailBtn.addEventListener('click', () => {
                const email = document.querySelector('input[name=email1]').value+"@"+document.querySelector('input[name=email2]').value;

              $.ajax({  
                url : '<%=contextPath%>/sendEmail.me',
                type : 'get',
                data : {email : email},
                success : (res) => {
                  $('#checkEmail').css.attr('display', 'block');
                },
                error : console.log('이메일 인증 AJAX 통신 중 문제 발생')
              });
            });
          </script>
        </div>

        <div id="content_3"></div>
      </div>
    </div>

    <%@ include file="../common/footerbar.jsp" %>
  </body>
</html>
































