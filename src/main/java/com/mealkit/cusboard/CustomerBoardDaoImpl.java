package com.mealkit.cusboard;

import java.security.Principal;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mealkit.paging.Criteria;


@Repository
public class CustomerBoardDaoImpl implements CustomerBoardDao{

	@Autowired
	SqlSession sqlSession;
	
	
	 @Override 
	 public void customerBoardInsert(CustomerBoardVo customerBoardVo, 
			 Principal principal) {
		 customerBoardVo.setMember_id(principal.getName());
		 System.out.println("customerBoardVo = " + customerBoardVo);
		 sqlSession.insert("CustomerBoard.CustomerBoardInsert", customerBoardVo); 
	 }
	 

	@Override
	public List<CustomerBoardVo> getCustomerBoardList(Criteria cri) {
		List<CustomerBoardVo> customerboardList  
		   =  sqlSession.selectList("CustomerBoard.CustomerBoardList", cri);
		return customerboardList;
	}
	
	@Override
	public int listCount() {
		
		return sqlSession.selectOne("CustomerBoard.listCount");
	}
	
	 @Override
	 public CustomerBoardVo customerBoardDetail(int cus_no) {
		 CustomerBoardVo customerBoardDetail =
		 sqlSession.selectOne("CustomerBoard.CustomerBoardDetail", cus_no);
		 return customerBoardDetail; 
	 }
	  
	  @Override
	  public void updateCustomerBoard(CustomerBoardVo customerBoardVo) {
		  sqlSession.update("CustomerBoard.CustomerBoardUpdate", customerBoardVo); 
	  }
	  
	  @Override public void deleteCustomerBoard(int cus_no) {
	  sqlSession.delete("CustomerBoard.DeleteCustomerBoard", cus_no);
	  
	  }
	 



}