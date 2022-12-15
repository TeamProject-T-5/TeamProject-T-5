<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한식</title>
<link rel="stylesheet" href="/css/product/korea/korea_list.css">
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
</head>
<body>
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	  <c:forEach var="koreaList"  items="${ koreaList }">
        <tr>	
		 <a href="/product/korea/detail/korea_detail?product_number=${koreaList.product_number}">${koreaList.product_name}</a>
		 <td>${koreaList.product_name}</td>
		 
		 <td>${koreaList.product_price}</td>
		   
		 <td>
		  
		  
		 </td>       
        </tr>
       
       </c:forEach>
      

</body>
<script>
	function chk_form() {
		document.getElementById('frm2').submit();
	}
</script>
</html>