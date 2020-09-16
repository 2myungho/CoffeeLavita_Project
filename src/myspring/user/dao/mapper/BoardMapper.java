package myspring.user.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myspring.user.vo.BoardVO;
import myspring.user.vo.UserVO;

@Mapper
public interface BoardMapper {
	//등록
	void insert(BoardVO vo);
	//목록
	List<BoardVO> list();
	//상세목록
	BoardVO read(int bno);
	//수정
	void update(BoardVO vo);
	//삭제
	void delete(int id);
}
