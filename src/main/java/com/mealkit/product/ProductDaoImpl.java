package com.mealkit.product;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;

import com.mealkit.foodpaging.Criteria;





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
			public List<ProductVo> koreaList(Criteria cri) {
				List<ProductVo> koreaList = sqlSession.selectList("Product.koreaList", cri);
				return koreaList;
			}
			
			//한식 페이징
			@Override
			public int listCount() {
				
				 return sqlSession.selectOne("Product.listCount"); 
			}

			//중식 페이지
			@Override
			public List<ProductVo> chinaList(Criteria cri) {
				List<ProductVo> chinaList = sqlSession.selectList("Product.chinaList", cri);
				return chinaList;
			}
			
			//중식 페이징
			@Override
			public int listChinaCount() {
				
				return sqlSession.selectOne("Product.listChinaCount"); 
			}

			//일식 페이지
			@Override
			public List<ProductVo> japList(Criteria cri) {
				List<ProductVo> japList = sqlSession.selectList("Product.japList", cri);
				return japList;
			}
			
			//일식 페이징
			@Override
			public int listJapCount() {
				
				return sqlSession.selectOne("Product.listJapCount");
			}

			//양식 페이지
			@Override
			public List<ProductVo> euList(Criteria cri) {
				List<ProductVo> euList = sqlSession.selectList("Product.euList", cri);
				return euList;
			}
			
			// 양식 페이징
			@Override
			public int listEuCount() {
				
				return sqlSession.selectOne("Product.listEuCount");
			}

			//이벤트 페이지
			@Override
			public List<ProductVo> eventList(Criteria cri) {
				List<ProductVo> eventList = sqlSession.selectList("Product.eventList", cri);
				return eventList;
			}

			// 이벤트 페이징
			@Override
			public int listEventCount() {
				
				return sqlSession.selectOne("Product.listEventCount");
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
