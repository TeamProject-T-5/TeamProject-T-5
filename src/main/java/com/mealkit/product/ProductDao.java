package com.mealkit.product;


import java.util.List;

import com.mealkit.foodpaging.Criteria;



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
	 public List<ProductVo> koreaList(Criteria cri);
	 
	 //한식 페이징
	 public int listCount();

	 //중식 페이지
 	 public List<ProductVo> chinaList(Criteria cri);
 	 
 	 //중식 페이징
 	 public int listChinaCount();

 	 //일식페이지
 	 public List<ProductVo> japList(Criteria cri);
 	 
 	 //일식 페이징
 	 public int listJapCount();

 	 //양식페이지
	 public List<ProductVo> euList(Criteria cri); 
	 
	 //양식 페이징
	 public int listEuCount();
	 
	 //이벤트
	 public List<ProductVo> eventList(Criteria cri);
	 
	 //이벤트 페이징
	 public int listEventCount();
	 
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
