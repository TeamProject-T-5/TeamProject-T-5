<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/views/include/nav2.jsp" %>
<meta charset="UTF-8">
<title>상품추가</title>
<style>
#wrap{}
#header{background-dolor : #fff}

</style>
</head>
<body>
	<%@include file="/WEB-INF/views/include/nav.jsp" %>
	<div id="wrap">
		<header id ="header">
			<div class="container">              
				    <div class="header clearfix">
					    <ul class="list1 clearfix">
						    <li class="home"><a href="/">홈으로</a></li>					
					    </ul>
					        <ul class="list2">
						        <li class="log">
                                <a href="/admin/admin_main">관리자페이지</a></li>                             
                            </ul>
                    </div>                   
			</div>
		</header><!-- header -->
	</div>
	

<div class="admin_content_wrap">
	<div class="admin_content_subject"><span>상품등록</span></div>
	<div class="admin_content_main">
		<form action="/admin/product_manage" method="post" id=enrollForm>
			<div class="form_section">
				<div class="form_section_title">
					<label>상품 이름</label>
				</div>
				<div class="form_section_content">
					<input name="product_name">
					<span id="ck_warn productName_warn">상품이름을 입력 해주세요</span>
				</div>
			</div>
			<div clas="form_section">
				<div class="from_section_title">
					<label>상품 분류</label>
				</div>
				<div class="form_section_content">
					<select name="category_code">
						<!-- 
							<input id="categoryName_input"  readonly="readonly">
							<input id="categoryCode_input"  name="categoryCode" type="hidden">
							<button class="categoryName_btn">분류 선택</button>
							<span id="ck_warn categoryName_warn">분류를 선택해주세요.</span>
						-->
						<option value="none" selected>=== 선택 ===</option>
                    	<option value="01">한식</option>
                    	<option value="02">중식</option>
                    	<option value="03">일식</option>
                    	<option value="04">양식</option>
                    	<option value="05">이벤트</option>
						<!--   -->
					</select>
					<span id="ck_warn categoryName_warn">분류를 선택해주세요.</span>
				</div>
			</div>
			<div class="form_section">
				<div class="form_section_title">
					<label>상품가격</label>
			</div>
			<div class="form_section_content">
				<input name="product_price" value="0">
				<span class="ck_warn productPrice_warn">상품 가격을 입력해주세요</span>
			</div>
		</div>
		<div class="form_section">
			<div class="form_section_title">
				<label>상품 재고</label>
			</div>
			<div class="form_section_content">
				<input name="product_stock" value="0">
				<span class="ck_warn productStock_warn">상품 재고를 입력해 주세요</span>
			</div>
		</div>
		<div class="form_section">
			<div class="form_section_title">
				<label>상품 설명</label>
			</div>
			<div class="form_section_content bit">
				<textarea name="product_desc" id="productText_textarea"></textarea>
				<span class="ck_warn productText_warn">상품 설명을 입력해주세요</span>
			</div>
		</div>
		
		<div class="form_section">
			<div class="form_section_title">
				<label>상품 이미지</label>
			</div>
			<div class="form_section_content">
				<input type="file" id="fileItem" name='uploadFile' style="height: 30px;">
				<div id="uploadResult">
				<!-- 
					<div id="result_card">
					<div class="imgDeleteBtn">x</div>
					<img src="/display?fileName=test.png">
					</div>
					 -->																		
				</div>
			</div>
		</div>
			<div class="btn_section">
				<button id="cancelBtn" class="btn">취소</button>
				<button id="enrollBtn" class="btn enroll_btn">등록</button>
			</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		
	</div>
	
</div>
       
<script>

 let enrollForm = $("#enrollForm")
	
  /*	취소버튼  */
$("cancelBtn").click(function(){

	lolocation.href="/admin/product_manage"

});


/* 등록버튼 */
$("enrolllBtn").on(function(e){

 e.preventDefault();

 /* 체크 변수 */

	let productNameCk = false;
	let categoryNameCk = false;
	let productPriceCk = false;
	let productStockCk = false;
	let productTextCk = false;

/* 입력값, 체크 대상 변수 */

	let productName  = $("input[name='productName']").val();  //상품 이름
	let categoryName = $("input[name='categoryName']").val(); // 분류 이름
	let productPrice = $("input[name='productPrice']").val(); // 상품 가격
	let productStock = $("input[name='productStock']").val(); // 상품 재고
	let productText  =  $(".bit p").html();					// 상품 설명
	
/* 공란 체크 */


if(productName){
	$(".productName_warn").css('display', 'none');
	productNameCk = true;
}else{
	$(".productName_warn").css('display', 'block');
	productNameCk = false;
}


if(categoryName){
	$(".categoryName_warn").css('display', 'none');
	categoryNameCk = true;
}else{
	$(".categoryName_warn").css('display', 'block');
	categoryNameCk = false;
}

if(productPrice){
	$(".productPrice_warn").css('display', 'none');
	productPriceCk = true;
}else{
	$(".productPrice_warn").css('display', 'block');
	productPriceCk = false;
}

if(productStock){
	$(".productStock_warn").css('display', 'none');
	productStockCk = true;
}else{
	$(".productStock_warn").css('display', 'block');
	productStockCk = false;
}

if(productText != '<br data-cke-filler="true">'){
	$(".productText_warn").css('display', 'none');
	productTextCk = true;
}else{
	$(".productText_warn").css('display', 'block');
	productTextCk = false;
}

/* 최종 확인*/
if(productNameCk &&  categoryNameCk &&  productPriceCk &&  productPriceCk &&  productText){
	//alert('통과');
	enrollForm.submit();	
}else{
	return false;
}

});


	
/*  분류 선택 버튼 
$('.categoryName_btn').on("click",function(e){
		
		e.preventDefault();
		
		let popUrl = "/admin/productCategoryname";
		let popOption = "width = 650px, height=550px, top=300px, left=300px, scrollbars=yes";
		
		window.open(popUrl,"분류 찾기",popOption);	
		
	});
*/

	/* 이미지 업로드 */
	$("input[type='file']").on("change", function(e){
		
		 이미지 존재시 삭제 
		if($(".imgDeleteBtn").length > 0){
			deleteFile();
		}
		
		let formData = new FormData();
		let fileInput = $('input[name="uploadFile"]');
		let fileList = fileInput[0].files;
		let fileObj = fileList[0];
		
		if(!fileCheck(fileObj.name, fileObj.size)){
			return false;
		}
		
		formData.append("uploadFile", fileObj);
		
		$.ajax({
			url: '/admin/uploadAjaxAction',
	    	processData : false,
	    	contentType : false,
	    	data : formData,
	    	type : 'POST',
	    	dataType : 'json',
	    	success : function(result){
	    		console.log(result);
	    		showUploadImage(result);
	    	},
	    	error : function(result){
	    		alert("이미지 파일이 아닙니다.");
	    	}
		});		

		
	});
		
	/* var, method related with attachFile */
	let regex = new RegExp("(.*?)\.(jpg|png)$");
	let maxSize = 1048576; //1MB	
	
	function fileCheck(fileName, fileSize){

		if(fileSize >= maxSize){
			alert("파일 사이즈 초과");
			return false;
		}
			  
		if(!regex.test(fileName)){
			alert("해당 종류의 파일은 업로드할 수 없습니다.");
			return false;
		}
		
		return true;		
		
	}	
	
	
	/* 이미지 출력 */
	function showUploadImage(uploadResultArr){
		
		/* 전달받은 데이터 검증 */
		if(!uploadResultArr || uploadResultArr.length == 0){return}
		
		let uploadResult = $("#uploadResult");
		
		let obj = uploadResultArr[0];
		
		let str = "";
		
		let fileCallPath = encodeURIComponent(obj.uploadPath.replace(/\\/g, '/') + "/s_" + obj.uuid + "_" + obj.fileName);
		//replace 적용 하지 않아도 가능
		//let fileCallPath = encodeURIComponent(obj.uploadPath + "/s_" + obj.uuid + "_" + obj.fileName);
		
		str += "<div id='result_card'>";
		str += "<img src='/display?fileName=" + fileCallPath +"'>";
		str += "<div class='imgDeleteBtn' data-file='" + fileCallPath + "'>x</div>";
		str += "<input type='hidden' name='imageList[0].fileName' value='"+ obj.fileName +"'>";
		str += "<input type='hidden' name='imageList[0].uuid' value='"+ obj.uuid +"'>";
		str += "<input type='hidden' name='imageList[0].uploadPath' value='"+ obj.uploadPath +"'>";		
		str += "</div>";		
		
   		uploadResult.append(str);     
        
	}	
	
	
	/* 이미지 삭제 버튼 동작 */
	$("#uploadResult").on("click", ".imgDeleteBtn", function(e){
		
		deleteFile();
		
	});
	
	/* 파일 삭제 메서드 */
	function deleteFile(){
		
		let targetFile = $(".imgDeleteBtn").data("file");
		
		let targetDiv = $("#result_card");
		
		$.ajax({
			url: '/admin/deleteFile',
			data : {fileName : targetFile},
			dataType : 'text',
			type : 'POST',
			success : function(result){
				console.log(result);
				
				targetDiv.remove();
				$("input[type='file']").val("");
				
			},
			error : function(result){
				console.log(result);
				
				alert("파일을 삭제하지 못하였습니다.")
			}
		});
	}
	
	

</script>
</body>
</html>