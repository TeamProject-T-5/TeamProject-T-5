package com.mealkit.product;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;





@Repository("productDao")
public class ProductDaoImpl implements ProductDao {


	@Autowired
	private  SqlSession sqlSession;
	
	// 상품추가
	@Override
	public void ProductEnroll(ProductVo product) {

		sqlSession.insert("Product.ProductEnroll", product );
		
	}


	//상품 목록
	@Override
	public List<ProductVo> productGetList() {
		List<ProductVo> productList = sqlSession.selectList("Product.ProductList");	
		System.out.println(productList);
	
		return  productList;
	}

	//상품 삭제
	@Override
	public void deleteproduct(int product_number) {
		
		System.out.println("삭제 시작 ");
		sqlSession.delete("Product.deleteProduct", product_number);

		System.out.println("삭제 종료 " );
	}

			//한식 페이지
			@Override
			public List<ProductVo> koreaList() {
				List<ProductVo> koreaList = sqlSession.selectList("Product.koreaList");
				return koreaList;
			}

			//중식 페이지
			@Override
			public List<ProductVo> chinaList() {
				List<ProductVo> chinaList = sqlSession.selectList("Product.chinaList");
				return chinaList;
			}

			//일식 페이지
			@Override
			public List<ProductVo> japList() {
				List<ProductVo> japList = sqlSession.selectList("Product.japList");
				return japList;
			}

			//양식 페이지
			@Override
			public List<ProductVo> euList() {
				List<ProductVo> euList = sqlSession.selectList("Product.euList");
				return euList;
			}

			//이벤트 페이지
			@Override
			public List<ProductVo> eventList() {
				List<ProductVo> eventList = sqlSession.selectList("Product.eventList");
				return eventList;
			}

		
		
		
		
		
	// 한식 상세 페이지
	@Override
	public ProductVo koreaInfo(int product_number) {
		
		ProductVo productVo = sqlSession.selectOne("Product.koreaInfo", product_number);
		
		return productVo;
	}

	// 중식 상세 페이지
	@Override
	public ProductVo chinaInfo(int product_number) {
		
		ProductVo productVo = sqlSession.selectOne("Product.chinaInfo", product_number);
		
		return productVo;
	}

	// 일식 상세 페이지
	@Override
	public ProductVo japInfo(int product_number) {
		
		ProductVo productVo = sqlSession.selectOne("Product.japInfo", product_number);
		
		return productVo;
	}

	// 양식 상세 페이지
	@Override
	public ProductVo euInfo(int product_number) {
		
		ProductVo productVo = sqlSession.selectOne("Product.euInfo", product_number);
		
		return productVo;
	}

	// 이벤트식 상세 페이지
	@Override
	public ProductVo eventInfo(int product_number) {
		
		ProductVo productVo = sqlSession.selectOne("Product.eventInfo", product_number);
		
		return productVo;
	}

	

	

		@Override
		public List<ProductVo> cateselect() {
			// TODO Auto-generated method stub
			return null;
		}


	

	

	
	

	

}
