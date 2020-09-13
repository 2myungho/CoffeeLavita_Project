package myspring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.user.dao.MemberDao;
import myspring.user.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao memberdao;
	
	@Override
	public void insertUser(MemberVO user) {
		memberdao.insert(user);
		
	}

	@Override
	public MemberVO login(MemberVO user) {
		return memberdao.login(user);
	}



}
