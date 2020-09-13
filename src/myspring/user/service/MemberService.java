package myspring.user.service;

import myspring.user.vo.MemberVO;

public interface MemberService {
	public void insertUser(MemberVO user);
	
	public MemberVO login(MemberVO user);
}
