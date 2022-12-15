package com.mealkit.product.eu;

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
public class EuController {
	
	
	@Autowired
	private ProductService productService;
	
		
	
	// 양식 분류 페이지
	@RequestMapping("product/product_eu_list")
	public  String eu(ProductVo productVo, Model model) {
		
		List<ProductVo> euList = productService.euList();
		System.out.println("euList" + euList);
		model.addAttribute("euList", euList);
		return "product/eu/product_eu_list";
	}
			
	// 양식 상세 페이지	  product/eu/detail/eu_detail  
	@RequestMapping("/product/eu/detail/eu_detail")
	public String eudetail(int product_number, Model model) {
				ProductVo euInfo = productService.euInfo(product_number);
				System.out.println(euInfo);
				model.addAttribute("euInfo", euInfo);
		return "product/eu/detail/eu_detail";
	}
			
			
	
}
