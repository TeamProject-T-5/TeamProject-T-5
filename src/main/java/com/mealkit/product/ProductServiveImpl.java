package com.mealkit.product;


import java.io.File;
import java.util.HashMap;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service("productService")
public class ProductServiveImpl implements ProductService {

	
	@Autowired
	private ProductDao productDao;
	
	// 상품 등록
	@Override
	public void ProductEnroll(ProductVo product) {
		productDao.ProductEnroll(product);
		
	}

	// 상품 목록
	@Override
	public List<ProductVo> productGetList() {
		List<ProductVo> productList = productDao.productGetList();
		return productList;
	}
	
	
	// 상품 삭제
	@Override
	public void deleteproduct(int product_number) {
		productDao.deleteproduct(product_number); 
		
	}
	
		//한식 페이지
		@Override
		public List<ProductVo> koreaList() {
			List<ProductVo> koreaList = productDao.koreaList();
			return koreaList;
		}

		//중식 페이지
		@Override
		public List<ProductVo> chinaList() {
			List<ProductVo> chinaList = productDao.chinaList();
			return chinaList;
		}

		//일식 페이지
		@Override
		public List<ProductVo> japList() {
			List<ProductVo> japList = productDao.japList();
			return japList;
		}

		//양식 페이지
		@Override
		public List<ProductVo> euList() {
			List<ProductVo> euList = productDao.euList();
			return euList;
		}

		//이벤트식 페이지
		@Override
		public List<ProductVo> eventList() {
			List<ProductVo> eventList = productDao.eventList();
			return eventList;
		}
	
		// 한식상세 정보
		@Override
		public ProductVo koreaInfo(int product_number) {
			ProductVo koreaInfo = productDao.koreaInfo(product_number);			
			
			return koreaInfo;
		}
		
		// 중식상세 정보
		@Override
		public ProductVo chinaInfo(int product_number) {
			ProductVo chinaInfo = productDao.chinaInfo(product_number);
			return chinaInfo;
		}
		
		// 일식상세 정보
		@Override
		public ProductVo japInfo(int product_number) {
			ProductVo japInfo = productDao.japInfo(product_number);
			return japInfo;
		}

		// 양식상세 정보
		@Override
		public ProductVo euInfo(int product_number) {
			ProductVo euInfo = productDao.euInfo(product_number);
			return euInfo;
		}

		// 이벤트상세 정보
		@Override
		public ProductVo eventInfo(int product_number) {
			ProductVo eventInfo = productDao.eventInfo(product_number);
			return eventInfo;
		}

		
		
		

		// 카테고리	
			@Override
			public List<ProductCategory> cateList() {
				// TODO Auto-generated method stub
				return null;
			}

	

}
