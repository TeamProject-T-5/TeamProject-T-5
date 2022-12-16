<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>양식</title>
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
<link rel="stylesheet" href="/css/food/style.css">
<style type="text/css">
		li {
		list-style: none;
		padding: 6px;
		float: left;
	}
</style>
</head>
	<body>
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	    <div class="koreanfood">
	    <c:forEach var="euList"  items="${ euList }">
	    	<div>
		    	<ul class="food1">
		        <li>
		        <a href="/product/eu/detail/eu_detail?product_number=${euList.product_number}">
		        <img src="/img/Korean_Food/Gopchang/곱창전골.jpg">
		        </a>
		        <div><a href="/product/eu/detail/eu_detail?product_number=${euList.product_number}">${euList.product_name}</a></div>
		        <div>${euList.product_price}</div>
		       
				     <i class="fa-solid fa-star" style="color:green"></i>
				     <i class="fa-solid fa-star" style="color:green"></i>
				     <i class="fa-solid fa-star" style="color:green"></i>
				     <i class="fa-solid fa-star" style="color:green"></i>
				     <i class="fa-solid fa-star" style="color:green"></i>
		        </li>
		        </ul>
	        </div>
	        </c:forEach>
	        
	   		<!-- 페이징  -->
			<div>
			  <ul style="width: 700px; text-align: center;">
			    <c:if test="${pageMaker.prev}">
			    	<li><a href="/product/product_eu_list${pageMaker.makeQuery(pageMaker.startPage - 1)}">이전</a></li>
			    </c:if> 
			
			    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
			    	<li><a href="/product/product_eu_list${pageMaker.makeQuery(idx)}">${idx}</a></li>
			    </c:forEach>
			
			    <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
			    	<li><a href="/product/product_eu_list{pageMaker.makeQuery(pageMaker.endPage + 1)}">다음</a></li>
			    </c:if> 
			  </ul>
			 </div> 
		 </div>
	</body>
	<script>
		function chk_form() {
			document.getElementById('frm2').submit();
		}
	</script>
</html>