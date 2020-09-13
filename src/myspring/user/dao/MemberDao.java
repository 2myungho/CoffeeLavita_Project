package myspring.user.dao;

import myspring.user.vo.MemberVO;

public interface MemberDao {
	
	//회원가입
	public void insert(MemberVO vo);
}
