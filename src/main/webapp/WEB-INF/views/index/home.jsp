<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밀키트 쇼핑몰</title>
<link rel="stylesheet" href="/css/index/style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"/>
</head>

	<!-- 네비바 -->
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<!-- 네비바 끝 -->
	<form action="index/search" method="POST">
	<input type="text" class="search"  name="product_name" placeholder="상품명을 입력하세요" >
    <i><button class="enter">검색</button></i>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  </form>
  <img class="ad" src="../광고.jpg">
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
</body>
</html>