<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.member.model.vo.Member" %>
<%@ include file="../common/menubar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
<style>
	/* 각자 필요한 content 길이만큼 height 속성값 수정해서 길이 조정 */
	/* #content { height: 2000px; } */

	#content_2{
		margin: auto;
	}

	#login-form p{
            font-size: 45px;
            font-weight: 100px;
        
        }

        button {
         margin-left: 50%;
         width: 200px;
         height: 40px;
         font-weight:100px;
         font-size: 16px;
        }
        #loginbtn{
            background-color: black;
            color : white
        }
        #registerbtn {
            background-color: white;
        }
        button:hover{
            cursor: pointer;
           
        }

        #login-id , #find-id{
            margin-left: 10%;
            
        }
        
        input {
            /* border: none; */
            outline : none;
            /* text-decoration-line: underline; */
            margin-left: 10%;
			background-color: lightgrey;
      		border: none;
			height: 15px;
      
        }
        

</style>
</head>
<body>

    <div class="wrap">
      <!--전체를 감싸는 wrap영역-->
      
       <!-- 로그인 실패시 다시 로그인 페이지로 -->

      <div id="content">
        <!--바디-->
        <div id="content_1">왼쪽여백</div>
        
     
		 <div id="content_2">

		  	<form id="login-form" action="<%= contextPath %>/login.me" method="post">
		        
		            <table id="login-id">
		              <tr>
		                  <td><p align="center">로그인</p></td>
		              </tr>
		              <tr>
		                  <td><input type="text" name="memId" placeholder="아이디를 입력해주세요." maxlength="30" required></td>
		              </tr>
		              <tr>
		                  <td><input type="password" name="memPwd" placeholder="비밀번호를 입력해주세요."></td>
		              </tr>
		              <tr>
		                <td><input type="checkbox">
		                  아이디저장
		              </tr>
		          </table><br>
		        <div id="find-id">
		          <a href="">아이디찾기</a> |
		          <a href="">비밀번호 찾기</a>
		
		        </div> <br>
		        <table>
		              <tr>
		                  <td><button type="submit" id="loginbtn">로그인</button></td>
		              </tr>
		              <tr>
		                  <td><button type="button" id="registerbtn" onclick="enrollPage();">회원가입</button></td>
		              </tr>
		          </table>
		       
		      </form> 
			</div>
		 
		  	  	
        <div id="content_3">오른쪽여백</div>
      </div>	
    
    <script>
    	function enrollPage(){
    		
    		location.href = "<%= contextPath %>/views/member/memberEnrollForm.jsp";
    	}
    </script>
      
      
   </div> 
    
    <%@ include file="../common/footerbar.jsp" %>

  </body>
</html>