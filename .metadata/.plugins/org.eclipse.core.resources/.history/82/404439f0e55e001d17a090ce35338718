<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.kh.exhibition.model.vo.Exhibition" %>
<%ArrayList<Exhibition> list = (ArrayList<Exhibition>)request.getAttribute("list"); // 조회된 내용물 출력하기%>
<%@ include file ="../common/menubar.jsp"%>

     <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JV Art Center</title>
<style>
	/* 각자 필요한 content 길이만큼 height 속성값 수정해서 길이 조정 */
	/* #content { height: 1500px; } */
	
	/* ----- 추가한 스타일은 여기에 ----- */
	
</style>
</head>
<body>

    <div class="wrap">
      <!--전체를 감싸는 wrap영역-->
      
      <div id="navi">
        <!--세부메뉴 영역-->
      </div>

      <div id="content">
        <!--바디-->
        <div id="content_1"></div>
        <div id="content_2">
        
        
          <form action = "exhibitionSearchView.do" method="get">
          <input type="text" name="searchWord" placeholder="작가명,작품명 검색">
          <input type="submit" value="Search">
          </form>
          

            <!-- content 내용 여기에 붙여넣기! -->
            
                        <br>
                        <h2 align="center">현재전시</h2>

                         <% if(list.isEmpty()) { %>
            		 			<H2>조회된 리스트가 없습니다.</H2>
            	<% } else { %>
	                <% for(Exhibition ex : list) { %>
	              
        			   <a href=<%= contextPath %>/ExhibitionDetailView.do?exNo=<%=ex.getExNo()%>>
        			   
        			   <img src="<%= contextPath %>/<%=ex.getExThumbnail()%>" alt="<%=ex.getExTitle()%>">
        			   </a>
        			   <h3>전시명 : <%= ex.getExTitle() %></h3>
        			   <h3>전시기간 : <%=ex.getStartDate() %>~<%=ex.getEndDate() %></h3>
        			       <% } %>
                <% } %>
            <script>
              $(function() {
                $(".thumbnail").click(function() {
                  
                  location.href = "<%= contextPath %>/ExhibitionDetailView.do?exNo=" + $(this).children().eq(0).val();
                });
              });
            </script>
    
        </div>
              
              
            
        </div>
        <div id="content_3"></div>
    </div>
   </div>
    
   <%@ include file="../common/footerbar.jsp" %>

  </body>
</html>
        