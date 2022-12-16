<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 확인 페이지</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"/>
<link rel="stylesheet" href="/css/index/searchstyle.css">
</head>

<body>
<%@include file="/WEB-INF/views/include/nav.jsp" %>
	
	
  	<button class="enter" onclick="location.href='#'"><i class="fa-solid fa-magnifying-glass fa-lg"></i></button>
	<input type="search" class="search" placeholder="상품명을 입력하세요"> 
</body>
</html>