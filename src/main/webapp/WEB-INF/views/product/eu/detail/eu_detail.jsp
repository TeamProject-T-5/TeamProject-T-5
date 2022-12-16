<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물품 상세 페이지</title>
<link rel="stylesheet" href="css/product/eu/eu_detail.css">
<%@include file="/WEB-INF/views/include/nav2.jsp" %>

<style>

		.info{
			
			overflow: hidden;
			
		}
		
		.info img{
			float: left;
			position: relative;
			left: 250px;
			top: 50px;
			
		}
		
		.info ul{
			overflow: hidden;
			float: left;
			display: block;
			position: relative;
    		left: 300px;
		}

		.info p{
			line-height: 60px;
		}
		
		.info p a{
			text-decoration-line: none;
			color:white;
		}

		.info select{
			margin-left: 20px;
		}

		.info button{
			cursor: pointer; 
			width: 25%; 
		    margin: 25px 20px;
		    border: none;
		    background-color: #1673ea;
		    color: #fff; 
		    font-size: 14px; 
		    font-weight: bold;
		    line-height: 50px;
		    
		}
		
		
		
		input{
   			width: 600px;
    		height: 3.3em;
    		position: relative;
    		top: 50px;
    		left: 210px;
		}
		
		#comment{
			position: relative;
			left: 300px;
		}
		
		#submit{
		    background-color: rgb(0, 128,255);
		    width: 80px;
		    height: 50px;
		    font-size: 15px;
		    font-weight: bold;
		    color: aliceblue;
		    border: none;
		    cursor: pointer;
		    position: relative;
		    top: 52px;
		    left: 204px;
		    
		}
		
		.text{
			position: relative;
			top: 0px;
			left: 0px;
		}
		
		.commentlist{
			position: relative;
			top: 60px;
			left: 260px;
		}
		
		</style>
</head>


<body>
<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<div class="info">
		<img src="/img/Korean_Food/Gopchang/곱창전골.jpg">
		<form>
		<ul>
			<p>상품명	: ${euInfo.product_name}	</p>
			<p>가격	: ${euInfo.product_price}:	</p> 
			<p>수량선택:
		
		
        			<select name="product_stock">
			            <option value="01">1</option>
			            <option value="02">2</option>
			            <option value="03">3</option>
			            <option value="04">4</option>
			            <option value="05">5</option>
			            <option value="06">6</option>
			            <option value="07">7</option>
			            <option value="08">8</option>
			            <option value="09">9</option>
			            <option value="10">10</option>
			        </select>
			     <p><button><a href="../cart/cart.html">장바구니 담기</a></button>
			     <button><a href="../purchase/purchase.html">결제하기</a></button>
			</p>
			<textarea style="width: 675px; height: 200px;" readonly>
${euInfo.product_desc}
</textarea>
		</ul>
		</form>	
	</div>
	<div id= "comment">
		<span>댓글</span>
		<input id= "input" placeholder="댓글을 입력해 주세요.">
		<button id= "submit">등록</button>
	</div>
	<div class="commentlist">
		<ol>
			<div>
				<div class="info">
					<span class="name">USER1</span><br>
					<span class="date">2022.11.30 17:27</span>
				</div>
			</div>
			<p class="text">든든하네요</p>			
		</ol>
	</div>
					
</body>
</html>