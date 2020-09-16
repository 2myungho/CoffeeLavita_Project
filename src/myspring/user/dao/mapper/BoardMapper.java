package myspring.user.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myspring.user.vo.BoardVO;
import myspring.user.vo.UserVO;

@Mapper
public interface BoardMapper {
	//���
	void insert(BoardVO vo);
	//���
	List<BoardVO> list();
	//�󼼸��
	BoardVO read(int bno);
	//����
	void update(BoardVO vo);
	//����
	void delete(int id);
}
