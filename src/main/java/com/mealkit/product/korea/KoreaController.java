package com.mealkit.product.korea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mealkit.foodpaging.Criteria;
import com.mealkit.foodpaging.PageMaker;
import com.mealkit.product.ProductService;
import com.mealkit.product.ProductVo;

@RequestMapping
@Controller
public class KoreaController {


	@Autowired
	private ProductService productService;
		
	
	// �ѽ� �з� ������
	@RequestMapping("product/product_korea_list")
	public  String korea(ProductVo productVo, Model model, Criteria cri) {
		
		List<ProductVo> koreaList = productService.koreaList(cri);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(productService.listCount());
		System.out.println(pageMaker.getTotalCount());
		
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("koreaList", koreaList);
		return "product/korea/product_korea_list";
	}
			
	// �ѽ� �� ������	   product/korea/detail/korea_detail?product_number=1
	@RequestMapping("/product/korea/detail/korea_detail")
	public String koreadetail(int product_number, Model model) {
				ProductVo koreaInfo = productService.koreaInfo(product_number);
				System.out.println(koreaInfo);
				model.addAttribute("koreaInfo", koreaInfo);
		return "product/korea/detail/korea_detail";
		}
			
			
			// �ѽ� -> ��ٱ���
			@PostMapping("product/product_korea_list")
			public String koreacart() {
				
				return "cart/cart";
			}

}
