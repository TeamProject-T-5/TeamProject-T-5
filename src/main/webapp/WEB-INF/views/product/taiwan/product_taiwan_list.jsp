<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중식</title>
<link rel="stylesheet" href="css/product/taiwan.css">
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
</head>
<body>
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<div class="koreanfood">
	<h1>한식</h1>
	<ul>
        <a href="#">
        <img src="../images(kor)/돼지국밥.jpg">
        </a>
        <p>돼지국밥</p>
        <p>7,000</p>
        <div>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
	     </div>
      </ul>
	
	<ul>
		<a href="#">
        <img src="../images(kor)/감자탕.jpg">
        </a>
        <p>감자탕</p>
        <p>8,000</p>
        <div>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-regular fa-star" style="color:green"></i>
	     </div>
	</ul>
    
    <ul>
    	<a href="#">
        <img src="../images(kor)/갈비탕.jpg">
        </a>
        <p>갈비탕</p>
        <p>7,500</p>
        <div>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-regular fa-star" style="color:green"></i>
	     </div>
    </ul>
     
      <div class="pagemove">
	      <ul>
	      	<li><span>1</span></li>
	      	<li><a href="koreanfood2/koreanfood2.html">2</a></li>
	      	<li><a href="koreanfood3/koreanfood3.html">3</a></li>
	      	<li><a href="koreanfood4/koreanfood4.html">4</a></li>
	      	<a href="koreanfood2/koreanfood2.html"><i class="fa-solid fa-caret-right" style="font-size: 30px; vertical-align: middle; color: gray;"></i></a>
	      </ul>
	  </div>
      
      <div class="clearfix"></div>
    </div>

</body>
<script>
	function chk_form() {
		document.getElementById('frm2').submit();
	}
</script>
</html>