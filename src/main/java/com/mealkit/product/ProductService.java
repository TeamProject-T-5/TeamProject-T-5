package com.mealkit.product;


import java.util.HashMap;
import java.util.List;

import com.mealkit.foodpaging.Criteria;





public interface ProductService {

	
	 // 상품추가
	 public void ProductEnroll(ProductVo product) throws Exception;
	 
	 // 상품 목록
	 public List<ProductVo> productGetList();
	 
	 
	 // 상품 삭제	
	 public void deleteproduct(int product_number);
	 
	 //한식 리스트
	 public int listCount();
	 
	 // 한식 페이지
	 public List<ProductVo> koreaList(Criteria cri);
	 
	 // 중식 페이징
	 public int listChinaCount();
	 
	 // 중식
	 public List<ProductVo> chinaList(Criteria cri);
	 	 
	 //일식 페이징
	 public int listJapCount();

	 // 일식
	 public List<ProductVo> japList(Criteria cri);
	 
	 // 양식 페이징
	 public int listEuCount();
	 
	 // 양식
	 public List<ProductVo> euList(Criteria cri);
	 
	 // 이벤트 페이징
	 public int listEventCount();
	 
	 //이벤트
	 public List<ProductVo> eventList(Criteria cri);
	 
	 
	 // 한식 상세 페이지
	 public  ProductVo koreaInfo(int product_number);
	 

	 // 중식 상세 페이지
	 public  ProductVo chinaInfo(int product_number);
	 
	 

	 // 일식 상세 페이지
	 public  ProductVo japInfo(int product_number);
	 

	 // 양식 상세 페이지
	 public  ProductVo euInfo(int product_number);
	 
	 

	 // 이벤트식 상세 페이지
	 public  ProductVo eventInfo(int product_number);
	 
	 
	 
	 // 카테고리 
	 public List<ProductCategory> cateList();

	

	

	
	 
	 
	 
	

	

}
