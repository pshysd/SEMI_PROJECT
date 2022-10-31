<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>1:1문의 조회 게시판</title>
    
    <!-- 아이콘/글씨체 링크-->
	<link href="../../resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
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
			height: 1000px;
		};
		#accordionSidebar { width: 224px; }
		#content-wrapper { width: 1676px; }
		
		#accordionSidebar, #content-wrapper {
			float: left;
			height: 100%;
		}
		
    </style>
</head>
<body>
	<div class="wrapper">
	
		<%@ include file="/views/admin/adminSidebar.jsp" %>
		
	    <!-- Content Wrapper -->
	    <div id="content-wrapper" class="d-flex flex-column">
	
	        <!-- content 영역 시작 -->
	        <div id="content">
				
				<%@ include file="/views/admin/adminTopbar.jsp" %>
	
	            <div id="admin_contents">
	                콘텐츠영역
	                여기에 작성하면 됩니다. 
	            </div>
	
	        </div>
	        <!-- content 영역 끝 -->
	
	    </div>
	    <!-- End of Content Wrapper -->
	    
	</div>
	    
    <%@ include file="/views/admin/adminScript.html" %>
	
</body>
</html>