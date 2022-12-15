<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
		 $(document).ready(function(){
			 $("#btnUpdate").click(function(){
				 document.form1.action = "${path}/member/MemberInfo";
				 document.form1.submit();
			 });
		 });
	</script>
</head>
<body>

	<h2>회원정보</h2>
	<form action="/MemberInfoUpdate" method="post"> <!-- 폼액션 정보 변경 -->
		

		<div id ="member_id">
			아이디<input type="text" id="member_id" name="member_id" value="${member.member_id}" readonly />
		</div>
		
		<div id="member_name">
			이름<input type="text" id="member_name" name="member_name" value="${member.member_name}" readonly >
		</div>
		
		<div id="member_phone">
			휴대폰 번호<input type="text" id="member_phone" name="member_phone" value="${member.member_phone}" >
		</div>
		
		<div id="member_email">
			이메일<input type="text" ID="member_email" name="member_email" value="${member.member_email}" />
		</div>
		
		<div id="member_pwd">
			비밀번호<input type="password" id="member_pwd" name="password" value="${member.member_pwd}" /> 
		</div>
		
		<div id="member_npwd">
			새 비밀번호<input type="password" id="member_npwd" name="member_npwd" placeholder="새로운 비밀번호를 입력해주세요" /> 
		</div>
		
		<div id="member_npwd2">
			새 비밀번호 확인<input type="password" id="member_npwd2" placeholder="새로운 비밀번호를 다시 입력해주세요" /> 
		</div>
		
		<div>
			<span>배송지목록</span>
		</div>
			<div id="addressList">
		<c:forEach var="addressList" items="${addressList}" varStatus="varStatus">
			<input type="text" id="address${varStatus.index}" name="addressList" value="${addressList.member_address1} ${addressList.member_address2} ${addressList.member_address3}" readonly>
		</c:forEach>
			</div>
		<div>
			<a href="AddressList?member_id=${member.member_id}">배송지 관리</a> 
		</div>

        <div>
			<button type="submit">수정하기</button>
		</div>
            		
		<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" /> 
	</form>
</body>
</html>