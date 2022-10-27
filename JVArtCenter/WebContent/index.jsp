<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JV Art Center</title>
<style>
	/* 각자 필요한 content 길이만큼 height 속성값 수정해서 길이 조정 */
	/* #content { height: 2000px; } */
</style>
</head>
<body>

	<%@ include file="/views/common/menubar.jsp" %>
	
    <div class="wrap">
      <!--전체를 감싸는 wrap영역-->

      <div id="navi">
        <!--세부메뉴 영역-->
        세부메뉴
      </div>

      <div id="content">
        <!--바디-->
        <div id="content_1">왼쪽여백</div>
        <div id="content_2"></div>
        <div id="content_3">오른쪽여백</div>
      </div>	
    
    <%@ include file="/views/common/footerbar.jsp" %>

  </body>
</html>