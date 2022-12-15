package com.mealkit.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index/home";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "cart/cart";
	}
	
	@GetMapping("/loginForm")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("/loginForm2")
	public String loginForm() {
		return "login/loginform";
	}

	
}
