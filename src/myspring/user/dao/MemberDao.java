package myspring.user.dao;

import myspring.user.vo.MemberVO;

public interface MemberDao {
	
	//ȸ������
	public void insert(MemberVO vo);
	
	//�α���
	public MemberVO login(MemberVO vo);
}
