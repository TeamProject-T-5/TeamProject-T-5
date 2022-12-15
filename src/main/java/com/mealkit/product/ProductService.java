package com.mealkit.product;


import java.util.HashMap;
import java.util.List;





public interface ProductService {

	
	 // 상품추가
	 public void ProductEnroll(ProductVo product) throws Exception;
	 
	 // 상품 목록
	 public List<ProductVo> productGetList();
	 	 
	 
	 // 상품 삭제	
	 public void deleteproduct(int product_number);
	 
	 
	 // 한식 페이지 ( 한식, 일식, 중식...)
	 public List<ProductVo> koreaList();
	 
	 // 중식
	 public List<ProductVo> chinaList();
	 
	 // 일식
	 public List<ProductVo> japList();
	 
	 // 양식
	 public List<ProductVo> euList();
	 
	 //이벤트
	 public List<ProductVo> eventList();
	 
	 
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
