package com.mealkit.product;


import java.io.File;
import java.util.HashMap;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mealkit.foodpaging.Criteria;





@Service("productService")
public class ProductServiveImpl implements ProductService {

	
	@Autowired
	private ProductDao productDao;	
	
	

	// 상품 등록
	@Transactional
	@Override
	public void ProductEnroll(ProductVo product) {
		
		productDao.ProductEnroll(product);
		
		if(product.getImageList() == null || product.getImageList().size() <= 0) {
			return;
		}
		
		product.getImageList().forEach(attach ->{
			
			attach.setProduct_number(product.getProduct_number());
			productDao.imageEnroll(attach);
			System.out.println( attach + "이미지 정보");
			
		});
		
	}

	// 이미지 등록
	@Override
	public void imageEnroll(AttachImageVO vo) {
		productDao.imageEnroll(vo);
		System.out.println("서비스 이미지등록 "+ vo);
	}
	

	// 이미지 정보 반환
	
	@Override
	public List<AttachImageVO> getAttachList(int product_number) {
		
		return productDao.getAttachList(product_number);
	}
	
	
	//  지정 상품 이미지 정보 얻기
	@Override
	public List<AttachImageVO> getAttachInfo(int product_number) {
		List<AttachImageVO> attach = productDao.getAttachInfo(product_number);	
		return  attach;
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
	
	
	// 정보 당
	@Override
		public List<ProductImgVo> getProductInfolist(int product_number) {
				
			List<ProductImgVo> getProductInfolist = productDao.getProductInfolist(product_number);
				 
			
			return getProductInfolist;
			}
	
	

	// 한식상세 정보
	@Override
	public ProductVo koreaInfo(int product_number) {
		
		
		ProductVo koreaInfo = productDao.koreaInfo(product_number);			
		koreaInfo.setImageList(productDao.getAttachList(product_number));
			
		System.out.println(koreaInfo  );
		
		return koreaInfo;
	}
	
	// 한식 리스트
	@Override
	public List<ProductImgVo> getProductImgList(Criteria cri) {
		System.out.println("1");
		List<ProductImgVo> productImgList = productDao.getProductImgList(cri ); 
		return productImgList;
	}
	
		
	
	
	
	// 중식상세 정보
	@Override
	public ProductVo chinaInfo(int product_number) {
		ProductVo chinaInfo = productDao.chinaInfo(product_number);
		return chinaInfo;
	}
	
	// 중식 리스트
	@Override
	public List<ProductImgVo> chinaImgList() {
		List<ProductImgVo> chinaImgList = productDao.chinaImgList( );
				return chinaImgList;
			}
				
	
	// 일식상세 정보
	@Override
	public ProductVo japInfo(int product_number) {
		ProductVo japInfo = productDao.japInfo(product_number);
		return japInfo;
	}
	
	// 일식 리스트
	@Override
	public List<ProductImgVo> japImgList() {
		List<ProductImgVo> japImgList = productDao.japImgList( );
			return japImgList;
			}
	

	// 양식상세 정보
	@Override
	public ProductVo euInfo(int product_number) {
		ProductVo euInfo = productDao.euInfo(product_number);
		return euInfo;
	}	
	
	// 양식 리스트
	@Override
	public List<ProductImgVo> euImgList() {
		List<ProductImgVo> euImgList = productDao.euImgList( );
		return euImgList;
	}

	
	
	
	
	
	
	
	
	// 이벤트상세 정보
	@Override
	public ProductVo eventInfo(int product_number) {
		ProductVo eventInfo = productDao.eventInfo(product_number);
		return eventInfo;
	}

	
	
	// 이벤트 리스트
	@Override
	public List<ProductImgVo> eventImgList() {
		List<ProductImgVo> eventImgList = productDao.eventImgList( );
		return eventImgList;
	}	
	
	
		//한식 페이징1
		@Override
		public List<ProductVo> koreaList(Criteria cri) {
			List<ProductVo> koreaList = productDao.koreaList(cri);
			return koreaList;
		}
		// 한식 페이징2
		@Override
		public int listCount() {
			
			return productDao.listCount();
		}
		// 중식 페이징1
		@Override
		public List<ProductVo> chinaList(Criteria cri) {
			List<ProductVo> chinaList = productDao.chinaList(cri);
			return chinaList;
		}
		
		// 중식 페이징2
		@Override
		public int listChinaCount() {
			
			return productDao.listChinaCount();
		}

		//일식 페이징1
		@Override
		public List<ProductVo> japList(Criteria cri) {
			List<ProductVo> japList = productDao.japList(cri);
			return japList;
		}
		
		// 일식 페이징2
		@Override
		public int listJapCount() {
			
			return productDao.listJapCount();
		}

		//양식 페이징1
		@Override
		public List<ProductVo> euList(Criteria cri) {
			List<ProductVo> euList = productDao.euList(cri);
			return euList;
		}
		
		// 양식 페이징2
		@Override
		public int listEuCount() {
			
			return productDao.listEuCount();
		}


		//이벤트식 페이징1
		@Override
		public List<ProductVo> eventList(Criteria cri) {
			List<ProductVo> eventList = productDao.eventList(cri);
			return eventList;
		}
		
		// 이벤트 페이징2
		@Override
		public int listEventCount() {
			
			return productDao.listEventCount();
		}
		
	
		// 카테고리	
			@Override
			public List<ProductCategory> cateList() {
				// TODO Auto-generated method stub
				return null;
			}











	

}
