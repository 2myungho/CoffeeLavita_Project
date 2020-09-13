package myspring.user.dao;

import myspring.user.vo.MemberVO;

public interface MemberDao {
	
	//회원가입
	public void insert(MemberVO vo);
	
	//로그인
	public MemberVO login(MemberVO vo);
}
