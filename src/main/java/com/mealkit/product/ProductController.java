package com.mealkit.product;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	// ��ǰ ����
	@RequestMapping("product/product_main")
	public  String main() {
		
		return "product/product_ main";
	}
	
	
	// ��ǰ ��
	@RequestMapping("product/detail/product_detail")
	public  String detail() {
		
		return "product/detail/product_detail";
	}
	/*
	@RequestMapping(value = "/product/detail/product_detail", method = RequestMethod.GET)
	public String details(ProductVo productVo, Model model, int product_number) {
		ProductVo  one = productService.getProductInfo(product_number);
		model.addAttribute("one", one);
		return "product/detail/product_detail";
	}
*/
	
	

		
		//  ��ǰ ����
		@RequestMapping(value = "/admin/product_manage", method = RequestMethod.GET)
		public  String adminpro(ProductVo productVo, Model model) {
			List<ProductVo> productList = productService.productGetList();
			model.addAttribute("list", productList);
			return "admin/product_manage";
			
		}		
		
		//��ǰ �߰�
		@RequestMapping("/admin/newproduct_manage")
		public String newproducrt() {
				
			return "/admin/newproduct_manage";
			}
		
		
		// ��ǰ �߰� 
		@RequestMapping(value="admin/product_manage", method = RequestMethod.POST )
		public String productEnrollPost(
				ProductVo product, RedirectAttributes rttr)throws Exception{
					
				productService.ProductEnroll(product);
				rttr.addFlashAttribute("enroll_result", product.getProduct_number());
					
						return "redirect:/admin/product_manage";
				}
		// ��ǰ ����
		@RequestMapping("/admin/Product/deleteProduct")
		public String deleteproduct(@RequestParam int product_number) {
			productService.deleteproduct(product_number);
			
			return "redirect:/admin/product_manage";
		}
		
	
		/* �̹��� ��� */
		@GetMapping("/display")
		public ResponseEntity<byte[]> getImage(String fileName){
			
			
			
			File file = new File("c:\\upload\\" + fileName);
			
			ResponseEntity<byte[]> result = null;
			
			try {
				
				HttpHeaders header = new HttpHeaders();
				
				header.add("Content-type", Files.probeContentType(file.toPath()));
				
				result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK);
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			return result;
			
		}
}

