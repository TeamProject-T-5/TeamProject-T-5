package com.mealkit.product.event;

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
public class EventController {
	
	
	@Autowired
	private ProductService productService;
	
		
	
	// 이벤트식 분류 페이지
	@RequestMapping("product/product_event_list")
	public  String event(ProductVo productVo, Model model) {
		
		List<ProductVo> eventList = productService.eventList();
		System.out.println("eventList" + eventList);
		model.addAttribute("eventList", eventList);
		return "product/event/product_event_list";
	}
			
	// 이벤트식 상세 페이지	   
	@RequestMapping("/product/event/detail/event_detail")
	public String eventdetail(int product_number, Model model) {
				ProductVo eventInfo = productService.eventInfo(product_number);
				System.out.println(eventInfo);
				model.addAttribute("eventInfo", eventInfo);
		return "product/event/detail/event_detail";
	}
			
			
	
		
}
