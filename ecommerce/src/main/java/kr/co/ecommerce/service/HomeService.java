package kr.co.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ecommerce.dao.table.MemberTable;
import kr.co.ecommerce.repository.mybatis.MemberMapper;

@Service
public class HomeService {

	@Autowired
	private MemberMapper memberMapper;

	public MemberTable getMemberInfo(int memberId) {
		return memberMapper.selectMember1(memberId);
	}

}
