<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>양식</title>
<link rel="stylesheet" href="css/food/westernfood.css">
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
</head>
<body>
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<div class="westernfood">
	<h1>양식</h1>
	<ul>
        <a href="#">
        <img src="../images(usa)/감바스알아히요.jpg">
        </a>
        <p>감바스 알 아히요</p>
        <p>8,500</p>
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
        <img src="../images(usa)/고르곤졸라 불고기 퀘사디아.png">
        </a>
        <p>고르곤졸라 불고기 퀘사디아</p>
        <p>9,500</p>
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
        <img src="../images(usa)/트리플 치즈 파스타.png">
        </a>
        <p>트리플 치즈 파스타</p>
        <p>8,500</p>
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
	      	<li><a href="westernfood2/westernfood2.html">2</a></li>
	      	<li><a href="westernfood3/westernfood3.html">3</a></li>
	      	<li><a href="westernfood4/westernfood4.html">4</a></li>
	      	<a href="westernfood2/westernfood2.html"><i class="fa-solid fa-caret-right" style="font-size: 30px; vertical-align: middle; color: gray;"></i></a>
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