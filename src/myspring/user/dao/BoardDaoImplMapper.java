package myspring.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.user.dao.mapper.BoardMapper;
import myspring.user.vo.BoardVO;

@Repository
public class BoardDaoImplMapper implements BoardDAO {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public void write(BoardVO vo) {
		System.out.println("여기는 Dao입니당 : "+ vo);
		boardMapper.insert(vo);
	}

}
