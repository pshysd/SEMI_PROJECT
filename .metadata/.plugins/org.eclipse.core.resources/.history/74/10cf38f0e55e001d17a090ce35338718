<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.kh.exhibition.model.vo.Exhibition" %>
<%@ page import="com.kh.review.model.vo.Review" %>
<%@ include file="../common/menubar.jsp" %>
<% ArrayList<Exhibition> list = (ArrayList<Exhibition>)request.getAttribute("list"); // 조회된 내용물 출력하기%>
<% boolean isBM = (boolean)request.getAttribute("isBM"); // 컨트롤러에서 넘겨준 변수사용가능 %>
<% ArrayList<Review> review = (ArrayList<Review>)request.getAttribute("review"); // 조회된 리뷰 출력하기%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JV Art Center</title>
<style>
	/* 각자 필요한 content 길이만큼 height 속성값 수정해서 길이 조정 */
	/* #content { height: 1500px; } */
	
	/* ----- 추가한 스타일은 여기에 ----- */
	#ex_img{width: 500px; height: 300px;}
   /*탭메뉴*/
   section {
            display: none;
            padding: 20px 0 0;
            border-top: 1px solid #ddd;}
    
     /*라디오버튼 숨김*/
    input {
            display: none;}

    label {
            display: inline-block;
            margin: 0 0 -1px;
            padding: 15px 25px;
            font-weight: 600;
            text-align: center;
            color: #bbb;
            border: 1px solid transparent;}

    label:hover {
            color: #2e9cdf;
            cursor: pointer;}

    /*input 클릭시, label 스타일*/
    input:checked + label {
            color: #555;
            border: 1px solid #ddd;
            border-top: 2px solid #2e9cdf;
            border-bottom: 1px solid #ffffff;}

    #tab1:checked ~ #info1,
    #tab2:checked ~ #info2{
            display: block;}
</style>
    <!-- ajax jQuery -->
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script>
funcion ajax_bookmark() {
	console.log("눌렸습니다!");
	$.ajax({
		url  : "${pageContext.request.contextPath}/ExhibitionBookmark.do"
		type : "POST",
		data : {"memNo" : 1, 
			    "exNo" : 1},
		success : function(isChecked) {
			try {
				if (isChecked) {
					$("#like").text("O");
				}
				else {
					$("#like").text("X");
				}
			} 
			catch(e) {
				$("#like").text("Error!!!");
			}
		}
	})
}
$(function(){
	$("#like").on("click",function(){
		console.log("눌렸습니다!");
		var memNo = 1; 
		var exNo = 1;
		$.ajax({
			url  : "${pageContext.request.contextPath}/ExhibitionBookmark.do"
			type : "POST",
			data : {"memNo" : memNo, 
				    "exNo" : exNo},
			success : function(isChecked) {
				try {
					if (isChecked) {
						$("#like").text("O");
					}
					else {
						$("#like").text("X");
					}
				} 
				catch(e) {
					$("#like").text("Error!!!");
				}
			}
		})
	})
})

</script>

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
            <!-- content 내용 여기에 붙여넣기! -->
              <tr>
                  <td width="30%">
              <div class="detail-view">
<%             	  
              	    String exImage = null;
              	    String exTitle= null;
              	    String Artists= null;
              	    String StartDate=null;
              	    String EndDate=null;
              	    int Price =0;
              	    String exContent=null;
                    String lcCode=null;
              	 	
	                 for(Exhibition ex : list) {
	                	exImage = ex.getExImage();
	                	exTitle = ex.getExTitle();
	                	Artists = ex.getArtists();
	                	StartDate = ex.getStartDate();
	                	EndDate = ex.getEndDate();
	                	Price = ex.getPrice();
	                	exContent = ex.getExContent();
                    lcCode = ex.getLcCode();
	                 }
%>               
	  <img id="ex_img" src="<%= contextPath %>/<%=exImage%>" alt="<%=exTitle%>">    
            <h1>전시이름:<%= exTitle %></h1> 
            <h1>작가:<%= Artists %></h1>
	          <h1>기간: <%=StartDate%>~<%=EndDate%></h1>
	          <h1>관람료:<%=Price%>원</h1> 
            <h1>전시관:<%=lcCode%>관</h1>	      
            
   <h2 id="like" class="btn btn-primary" style="cursor: pointer; color: red; background-color:while;">O</h2>
   <button type="button" onclick="ajax_bookmark();"></button>
               
                    </div>
                  </td>
              </tr>
              <tr>
                  <td colspan="2">
                      
                  <input id="tab1" type="radio" name="tabs" checked> <!--디폴트 메뉴-->
                  <label for="tab1">전시정보</label>
                  <input id="tab2" type="radio" name="tabs">
                  <label for="tab2">리뷰</label>

                  <section id="info1" width="70%">
                  <p><%=exContent%></p>
                  </section>

  <section id="info2" width="70%">
  <h5>꼭 읽어주세요</h5>

  <div id="review">
    <div id="review_star"></div>
      <% if(isBM){%>
    		<h1>♥</h1>        
         <% } else { %>
    	  <h1>♡</h1><% }%>
     
    <div id="review_writer"> </div>
    <div id="review_msg"></div>
  </div>
  
                         <% if(review.isEmpty()) { %>
            		 			<H2>작성된 리뷰가 없습니다.</H2>
            	<% } else { %>
	                <% for(Review rw : review) { %>
	                
                 <div id="rw_writer"><%= rw.getMemNo() %></div>
	              <div id="rw_content"><%= rw.getReviewContent() %></div>
	              <div id="rw_rating"><%=rw.getRating() %></div>
                 <div id="rw_reviewDate"><%=rw.getReviewDate() %></div>

	                <% } %>
                <% } %>
                
    </section>
   
</div>
                </td>    
              </tr>
          </table>           
        </div>
        <div id="content_3"></div>
    </div>
   </div>
    
   <%@ include file="../common/footerbar.jsp" %>

  </body>
</html>