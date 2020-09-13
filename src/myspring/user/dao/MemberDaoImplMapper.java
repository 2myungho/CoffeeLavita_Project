package myspring.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.user.dao.mapper.MemberMapper;
import myspring.user.vo.MemberVO;

@Repository
public class MemberDaoImplMapper implements MemberDao {
	@Autowired
	private MemberMapper memberMapper;	

	@Override
	public void insert(MemberVO vo) {
		System.out.println(vo);
		memberMapper.insertUser(vo);
	}
	
}
