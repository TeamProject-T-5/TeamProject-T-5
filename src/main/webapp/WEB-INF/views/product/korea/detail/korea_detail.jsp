<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물품 상세 페이지</title>
<link rel="stylesheet" href="css/product/korea/korea_detail.css">
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
<%@include file="/WEB-INF/views/include/nav2.jsp"%>

<style>
.info {
	overflow: hidden;
}

.info img {
	float: left;
	position: relative;
	left: 250px;
	top: 50px;
}

.info ul {
	overflow: hidden;
	float: left;
	display: block;
	position: relative;
	left: 300px;
}

.info p {
	line-height: 60px;
}

.info p a {
	text-decoration-line: none;
	color: white;
}

.info select {
	margin-left: 20px;
}

.info button {
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

input {
	width: 600px;
	height: 3.3em;
	position: relative;
	top: 50px;
	left: 210px;
}

#comment {
	position: relative;
	left: 300px;
}

#submit {
	background-color: rgb(0, 128, 255);
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

.text {
	position: relative;
	top: 0px;
	left: 0px;
}

.commentlist {
	position: relative;
	top: 60px;
	left: 260px;
}

img {
	width: 400px;
	height: 400px;
}
</style>
</head>


<body>
	<%@include file="/WEB-INF/views/include/nav.jsp"%>
	<div class="info">
		<div class="image_wrap" data-filename="${koreaInfo.fileName}"
			data-productnumber="${koreaInfo.product_number}"
			data-path="${koreaInfo.uploadPath}" data-uuid="${koreaInfo.uuid}">
			<img>
		</div>
		<form>
			<ul>
				<p>상품명 : ${koreaInfo.product_name}</p>
				<p>가격 : ${koreaInfo.product_price}</p>
				<p>
					수량선택: <select name="product_stock">
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
				<p>
					<button>
						<a href="../cart/cart.html">장바구니 담기</a>
					</button>
					<button>
						<a href="../purchase/purchase.html">결제하기</a>
					</button>
				</p>
				<textarea style="width: 675px; height: 200px;" readonly>
${koreaInfo.product_desc}
</textarea>
			</ul>
		</form>
	</div>
	<div id="comment">
		<span>댓글</span> <input id="input" placeholder="댓글을 입력해 주세요.">
		<button id="submit">등록</button>
	</div>
	<div class="commentlist">
		<ol>
			<div>
				<div class="info">
					<span class="name">USER1</span><br> <span class="date">2022.11.30
						17:27</span>
				</div>
			</div>
			<p class="text">든든하네요</p>
		</ol>
	</div>

</body>
<script>
$(document).ready(function(){
	
	/* 이미지 삽입 */
	const bobj = $(".image_wrap");
	
	if(bobj.data("productnumber")){
		const uploadPath = bobj.data("path");
		const uuid = bobj.data("uuid");
		const fileName = bobj.data("filename");			
		const fileCallPath = encodeURIComponent(uploadPath + "/s_" + uuid + "_" + fileName);
		
		
		bobj.find("img").attr('src', '/display?fileName=' + fileCallPath);
	} else {
		bobj.find("img").attr('src', '/resources/image/nothing.png');
	}	

	});		
	//$(document).ready(function(){
	// 수량 버튼 조작
let quantity = $(".quantity_input").val();
$(".plus_btn").on("click", function(){
	$(".quantity_input").val(++quantity);
});
$(".minus_btn").on("click", function(){
	if(quantity > 1){
		$(".quantity_input").val(--quantity);	
	}
});	
	
</script>
</html>