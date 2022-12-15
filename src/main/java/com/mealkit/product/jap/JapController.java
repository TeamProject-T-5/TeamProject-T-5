package com.mealkit.product.jap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mealkit.product.ProductService;
import com.mealkit.product.ProductVo;

@RequestMapping
@Controller
public class JapController {
	
	
	@Autowired
	private ProductService productService;
	
		
	
	// 일식 분류 페이지
	@RequestMapping("product/product_jap_list")
	public  String jap(ProductVo productVo, Model model) {
		
		List<ProductVo> japList = productService.japList();
		System.out.println("japList" + japList);
		model.addAttribute("japList", japList);
		return "product/jap/product_jap_list";
	}
			
	// 일식 상세 페이지	   
	@RequestMapping("/product/jap/detail/jap_detail")
	public String japdetail(int product_number, Model model) {
				ProductVo japInfo = productService.koreaInfo(product_number);
				System.out.println(japInfo);
				model.addAttribute("japInfo", japInfo);
		return "product/jap/detail/jap_detail";
	}
			
			
	
		// �씪�떇 -> �옣諛붽뎄�땲
			@PostMapping("product/product_jap_list")
			public String japcart() {
				
				return "cart/cart";
			}
}
