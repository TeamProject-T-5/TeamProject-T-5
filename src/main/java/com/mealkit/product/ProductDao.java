package com.mealkit.product;


import java.util.List;



public interface ProductDao {

	 // 상품 추가
	 public void ProductEnroll(ProductVo product);
	
	 //상품 목록
	 public List<ProductVo> productGetList();

	 //상품 삭제	
	 public void deleteproduct(int product_number);
	 
	
	 //상품 분류된 페이지 ( 한식, 일식, 중식...)
	 public List<ProductVo> cateselect();

	 //한식페이지
	 public List<ProductVo> koreaList();

	 //중식페이지
 	 public List<ProductVo> chinaList();

 	 //일식페이지
 	 public List<ProductVo> japList();

 	 //양식페이지
	 public List<ProductVo> euList(); 

	 //이벤트
	 public List<ProductVo> eventList();
	 
	// 한식 상세 페이지
	public  ProductVo koreaInfo(int product_number);

	// 중식 상세 페이지
	public ProductVo chinaInfo(int product_number);
	
	// 일식 상세 페이지
	public ProductVo japInfo(int product_number);

	// 양식 상세 페이지
	public ProductVo euInfo(int product_number);

	// 이벤트 상세 페이지
	public ProductVo eventInfo(int product_number);
	 
	 
}
