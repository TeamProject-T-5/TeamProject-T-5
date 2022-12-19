<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밀키트 쇼핑몰</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
	

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightgallery/2.5.0/css/lightgallery.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightgallery/2.5.0/css/lg-thumbnail.min.css"/>
<link rel="stylesheet" href="/css/index/style.css">


</head>

	<!-- 네비바 -->
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<!-- 네비바 끝 -->
	<form action="index/search" method="POST">
	<input type="text" class="search"  name="product_name" placeholder="상품명을 입력하세요" >
    <button class="enter"><i class="fa-solid fa-magnifying-glass fa-lg"></i></button>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  </form>
 
 
  <div class="slider">
  		<div><a><img class="ad" src="img/ad.jpg"></a></div>
  		<div><a><img class="ad" src="img/kit.jpg"></a></div>
  </div>
  
		<i class="fa-solid fa-chevron-left"></i>
  		<i class="fa-solid fa-chevron-right"></i>
 

  

    <h1>제일 많이 팔린 밀키트 TOP 3(미구현)</h1>
 
 
    <div class="mealkit">
      <ul>
        <a href="#"><img src=""></a>
        <p>TOP 1. 돼지국밥</p>
        <p class="price">7,000</p>
        <div>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
	     </div>
	  </ul>
      <ul>
        <a href="#"><img src="img/Chinese_Food/Chili shrimp/칠리새우.jpg"></a>
        <p>TOP 2. 칠리새우 </p>
        <p class="price">8,500</p>
        <div>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
	     </div>
	  </ul>
      <ul>
        <a href="#"><img src="../images(jpn)/규카츠.jpg"></a>
        <p>TOP 3. 규카츠</p>
        <p class="price">9,000</p>
        <div>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
		     <i class="fa-solid fa-star" style="color:green"></i>
	     </div>
	   </ul>
      <div class="clearfix"></div>
    </div>
    
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightgallery/2.5.0/lightgallery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightgallery/2.5.0/plugins/thumbnail/lg-thumbnail.min.js"></script>

<script>

$(document).ready(function(){
  $('.slider').slick({
	 
				// 옆으로 이동하는 화살표 표시 여부
		dots : false, 		// 스크롤바 아래 점으로 페이지네이션 여부
		autoplay : true
  });
});
		
</script>

</body>


</html>