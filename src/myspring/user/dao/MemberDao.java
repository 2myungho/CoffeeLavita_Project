package myspring.user.dao;

import java.util.List;

import myspring.user.vo.MemberVO;

public interface MemberDao {
	
	//회원가입
	public void insert(MemberVO vo);
	
	//로그인
	public MemberVO login(MemberVO vo);
	
	//회원 목록
	public List<MemberVO> master();
}
