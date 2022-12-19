package com.mealkit.address;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	// 諛곗넚吏� �엯�젰(���옣)
	@PostMapping("/AddressInsert")
	public String insertAddress(AddressVo vo,Principal principal) throws Exception {
		System.out.println(principal.getName());
		addressService.insertAddress(vo, principal);

		
		System.out.println("�솗�씤" + vo + principal);
		
		return "redirect:/AddressList?member_id=" + vo.getMember_id();
	}
	
	// 諛곗넚吏� 紐⑸줉 議고쉶
	@GetMapping("/AddressList")
	public String addressList(String member_id,Model model) throws Exception {
		
		List<AddressVo> addressList = addressService.getAddressList(); 
		List<AddressVo> addressOne = addressService.getAddressOne(member_id);
		// �솗�옣 for臾� or forEach臾� �옄二쇱벐�엫
//		for(AddressVo address : addressList) {  // :�뮘�뿉 �뿴嫄고삎 (List) 媛앹껜
//			address.(�븘�뱶紐�) �벑�벑
//		}
//		for(int i = 0; i < addressList.size(); i++) {
//			
//		}
		
// �씪諛섏쟻�씤 for臾멸낵 �룞�씪�븳 �슚怨� �솗�옣for臾몄� db�뿉�꽌 �빐�떦 �뜲�씠�꽣瑜� �떎 異쒕젰�븷�븣 �씪諛� for臾몄� �젙�빐以� 媛믩쭔 異쒕젰		
		
		
		model.addAttribute("addressList", addressList);
		model.addAttribute("addressOne", addressOne);
		return "address/AddressList";
	}
	
	// 諛곗넚吏� �젙蹂� 蹂�寃�
	@RequestMapping(value = "/AddressUpdate", method = RequestMethod.GET)
	public String addressUpdate(int address_member_no, Model model) throws Exception {
		AddressVo addressOne = addressService.getAddressOne2(address_member_no);
		model.addAttribute("addressOne", addressOne);
		return "address/AddressModify"; 
	}
	
	//諛곗넚吏� �젙蹂� �궘�젣
	@RequestMapping(value = "/AddressDelete", method = RequestMethod.GET)
	public String addressDelete(int address_member_no) throws Exception { 
		System.out.println("�궘�젣 :  �꽌鍮꾩뒪濡� 吏꾩엯");
		AddressVo vo = addressService.getAddressOne2(address_member_no);
		addressService.deleteAddress(address_member_no); // �꽆踰� 媛믪쑝濡� �궘�젣
		
		return "redirect:/AddressList?member_id=" + vo.getMember_id();
			
	}
	
	//諛곗넚吏� �젙蹂� �긽�꽭 蹂�寃� �럹�씠吏�
	@RequestMapping("/AddressModify")
	public String addressModify(AddressVo vo) {
		addressService.updateAddress(vo);
		AddressVo vo2 = addressService.getAddressOne2(vo.getMember_address_no());
		System.out.println("�굹�뒗 vo2 : " + vo2.getMember_id());
		return "redirect:/AddressList?member_id=" + vo2.getMember_id(); 
	}

}
