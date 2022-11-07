<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.kh.exhibition.model.vo.Exhibition" %>
<%ArrayList<Exhibition> list = (ArrayList<Exhibition>)request.getAttribute("list"); %>// 조회된 내용물 출력하기

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>검색결과</h3>
      	<% if(list.isEmpty()) { %>
            		 	<H2>조회된 리스트가 없습니다.</H2>
            	     	<% } else { %>
	                <% for(Exhibition ex : list) { %>
	                		<h1><%= ex.getExNo() %></h1>
	                		<h1><%= ex.getExTitle() %></h1>
	                		<h1><%=ex.getStartDate() %></h1>
	  						<h1><%=ex.getEndDate() %></h1>
	  						<% } %>
									<% } %>
	               


</body>
</html>