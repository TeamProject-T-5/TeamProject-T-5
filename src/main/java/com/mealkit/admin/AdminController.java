package com.mealkit.admin;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import java.awt.Graphics2D;


import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.mealkit.member.MemberService;
import com.mealkit.member.MemberVo;
import com.mealkit.paging.Criteria;
import com.mealkit.paging.PageMaker;
import com.mealkit.product.img.ImageVo;



@Controller
@RequestMapping
public class AdminController {

	@Autowired
	private MemberService memberService;
	
	// 愿�由ъ옄 硫붿씤�럹�씠吏�
	@RequestMapping("/admin/admin_main")
	public String adminmain() {
		return "/admin/admin_main";
	}
	
	@RequestMapping("/admin/userList")
	public String adminUserList(Model model, Criteria cri) {
		List<MemberVo> userList = memberService.getUserList(cri);
		model.addAttribute("userList", userList);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(memberService.listCount());
		System.out.println(pageMaker.getTotalCount());
		model.addAttribute("pageMaker", pageMaker);
		
		return "/admin/userList";
	}
	
	@RequestMapping("/admin/deleteMember")
	public String deleteMember(@RequestParam String member_id) {
		
		memberService.deleteMember(member_id);
		
		return "redirect:/admin/userList";
	}
		
	
	

}