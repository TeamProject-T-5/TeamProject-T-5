<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
<title>관리자 페이지</title>
<style>
#wrap{}
#header{background-dolor : #fff}
#header.home{
	
	width: 25%;
	height: 100%;
	float: left;
	color: red;}
	
.admin_navi_wrap li a:link {color: black;}
.admin_navi_wrap li a:visited {color: black;}
.admin_navi_wrap li a:active {color: black;}
.admin_navi_wrap li a:hover {color: black;}	
	
</style>
</head>
<body>
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<div id="wrap">
		<header id ="header">
			<div class="container">                                
                    <div class="admin">
                        <h2>관리자페이지</h2>
                    </div>
					<div class="admin_main">
					    <a class="member_manage" href="/admin/userList" >회원관리</a>
						<a class="product_manage" href="/admin/product_manage" >상품관리</a>
						<a class="salse_manage" href="#" >매출관리(미구현)</a> 
					</div>
			</div>
		</header><!-- header -->
	</div>
	

</body>
</html>