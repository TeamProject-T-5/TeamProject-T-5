package com.mealkit.product.korea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mealkit.product.ProductService;
import com.mealkit.product.ProductVo;

@RequestMapping
@Controller
public class KoreaController {


	@Autowired
	private ProductService productService;
		
	
	// 한식 분류 페이지
	@RequestMapping("product/product_korea_list")
	public  String korea(ProductVo productVo, Model model) {
		
		List<ProductVo> koreaList = productService.koreaList();
		System.out.println("korealist" + koreaList);
		model.addAttribute("koreaList", koreaList);
		return "product/korea/product_korea_list";
	}
			
	// 한식 상세 페이지	   product/korea/detail/korea_detail?product_number=1
	@RequestMapping("/product/korea/detail/korea_detail")
	public String koreadetail(int product_number, Model model) {
				ProductVo koreaInfo = productService.koreaInfo(product_number);
				System.out.println(koreaInfo);
				model.addAttribute("koreaInfo", koreaInfo);
		return "product/korea/detail/korea_detail";
		}
			
			
			// 한식 -> 장바구니
			@PostMapping("product/product_korea_list")
			public String koreacart() {
				
				return "cart/cart";
			}

}
