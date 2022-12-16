<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet" href="css/cart/style.css">
</head>
<body>
<%@include file="/WEB-INF/views/include/nav.jsp" %>
<div class="container">
    <table class="cart__list">
            <form>
                <thead>
                    <tr>
                        <td colspan="2">상품정보</td>
                        <td>옵션</td>
                        <td>상품금액</td>
                        <td>배송비</td>
                    </tr>
                </thead>
            </form>
    </table>
    <div>
            <button onclick="javascript:history.back();">이전 페이지로 이동</button>
            <button>주문하기(미구현)</button>
    </div>
    </div>
    
</body>
</html>