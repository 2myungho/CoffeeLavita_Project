package myspring.user.dao;

import java.util.List;

import myspring.user.vo.MemberVO;

public interface MemberDao {
	
	//ȸ������
	public void insert(MemberVO vo);
	
	//�α���
	public MemberVO login(MemberVO vo);
	
	//ȸ�� ���
	public List<MemberVO> master();
}
