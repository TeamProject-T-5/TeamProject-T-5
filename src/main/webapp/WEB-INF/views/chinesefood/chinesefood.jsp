<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중식</title>
<link rel="stylesheet" href="css/food/chinesefood.css">
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
</head>
<body>
<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<div class="navbar">
      <ul>
      <sec:authorize access="isAuthenticated()">
      <sec:authentication property="principal.username" var="user_id" />
        <div id="user_id">${ user_id }님 안녕하세요. </div>	
      	<li><a href="#">마이페이지(미구현)</a></li>
        <li><a href="/cart">장바구니</a></li>
        <li>
        	<form id="frm2" action="/logout" method="post">
        		<a href="#" onclick="return chk_form()" >로그아웃</a>
        		<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" />
        	</form>
        </li>
	  </sec:authorize>
	  <sec:authorize access="isAnonymous()">
        <li><a href="/loginForm">로그인</a></li>
        <li><a href="/loginForm2">회원가입</a></li>
      </sec:authorize>
        </ul>
    </div>

	<div>
    	<a class="logo" href="/">로고</a>
    </div>
    
    <div id="SideMenu" class="sidemenu">
	  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
	  	<a href="/korea" style= "white-space:nowrap;">한식</a>
		<a href="/chinese" style="white-space:nowrap;">중식</a>
		<a href="/japanesefood" style="white-space:nowrap;">일식</a>
		<a href="/western" style="white-space:nowrap;">양식</a>
		<a href="#" style="white-space:nowrap;">이벤트 상품(미구현)</a>
		<a href="#" style="white-space:nowrap;">정보공유 게시판(미구현)</a>
		<a href="#" style="white-space:nowrap;">자유게시판(미구현)</a>
		<a href="#" style="white-space:nowrap;">고객센터(미구현)</a>
	</div>

	<span class="icon" style="font-size:30px; cursor:pointer" onclick="openNav()" >
		<i class="fa-solid fa-bars"></i>
	</span>
	 
	
	
	
	<script>
	function openNav() {
	    document.getElementById("SideMenu").style.width = "250px";
	}
	
	function closeNav() {
	    document.getElementById("SideMenu").style.width = "0";
	}
	
	</script>
	
	<div class="chinesefood">
	<h1>중식</h1>
	<ul>
        <a href="#">
        <img src="../images(chn)/고추잡채&꽃빵.jpg">
        </a>
        <p>고추잡채&꽃빵</p>
        <p>8,500</p>
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
        <img src="../images(chn)/꿔바로우.jpg">
        </a>
        <p>꿔바로우</p>
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
        <img src="../images(chn)/동파육.jpg">
        </a>
        <p>동파육</p>
        <p>9,000</p>
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
	      	<li><a href="chinesefood2/chinesefood2.html">2</a></li>
	      	<li><a href="chinesefood3/chinesefood3.html">3</a></li>
	      	<li><a href="chinesefood4/chinesefood4.html">4</a></li>
	      	<a href="chinesefood2/chinesefood2.html"><i class="fa-solid fa-caret-right" style="font-size: 30px; vertical-align: middle; color: gray;"></i></a>
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