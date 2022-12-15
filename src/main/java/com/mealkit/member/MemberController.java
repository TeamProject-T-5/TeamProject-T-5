package com.mealkit.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mealkit.address.AddressService;
import com.mealkit.address.AddressVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/WriteForm")
	public String writeForm() {
		return "namsu/WriteForm";
	}
	
	@PostMapping("/Write")
	public String write(MemberVo memberVo) {
		memberService.registerMember(memberVo);
		return "index/home";
	}
	
	// �쉶�썝�젙蹂� 異쒕젰
	// /MemberInfo?member_id=eaea
	@RequestMapping("/MemberInfo")
	public String memberInfo(MemberVo vo, String member_id, Model model) {	

		MemberVo member  =  memberService.getMember(vo.getMember_id());
		List<AddressVo> address = addressService.getAddressOne(member_id);
		
		model.addAttribute("addressList" , address);
		model.addAttribute("member", member);
		
		System.out.println("�쉶�썝�젙蹂� 異쒕젰 : " + member);
		System.out.println("�쉶�썝�젙蹂� 異쒕젰 : " + address);
		
		return "member/MemberInfo";
	}
	
	// �쉶�썝�젙蹂댁쓽 �씠硫붿씪, �쟾�솕踰덊샇 蹂�寃�
	@RequestMapping("/MemberInfoUpdate")
	public String memberInfoUpdate( MemberVo vo) {	

		
			memberService.updateMember(vo);
			
			 
			System.out.println("�쉶�썝�젙蹂� 蹂�寃� : " + vo);
				 
		return "index/home";
	}	
}
