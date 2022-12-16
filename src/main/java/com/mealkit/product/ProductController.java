package com.mealkit.product;



import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	// 상품페이지
	@RequestMapping("product/product_main")
	public  String main() {
		
		return "product/product_ main";
	}
	
	
	// 제품상세
	@RequestMapping("product/detail/product_detail")
	public  String detail() {
		
		return "product/detail/product_detail";
	}

	
	

		
		// 상품관리페이지
	@RequestMapping(value = "/admin/product_manage", method = RequestMethod.GET)
		public  String adminpro(ProductVo productVo, Model model) {
			List<ProductVo> productList = productService.productGetList();
			
				model.addAttribute("list", productList);
					return "admin/product_manage";
		
	}	
		
		// 상품등록페이지
		@RequestMapping("/admin/newproduct_manage")
		public String newproducrt() {
				
			return "/admin/newproduct_manage";
			}
		
		
		// 상품 등록
		@RequestMapping(value="admin/product_manage", method = RequestMethod.POST )
		public String productEnrollPost(
				ProductVo product,RedirectAttributes rttr)throws Exception{
			
				productService.ProductEnroll(product);
			
				rttr.addFlashAttribute("enroll_result", product.getProduct_number());
			
						return "redirect:/admin/product_manage";
				}
		// 상품삭제
		@RequestMapping("/admin/Product/deleteProduct")
		public String deleteproduct(@RequestParam int product_number) {
			productService.deleteproduct(product_number);
			
			return "redirect:/admin/product_manage";
		}
		
		
		
		
		
	
		
}

