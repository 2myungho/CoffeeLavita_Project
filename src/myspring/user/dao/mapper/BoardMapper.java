package myspring.user.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import myspring.user.vo.BoardVO;

@Mapper
public interface BoardMapper {
	void insert(BoardVO vo); 
}
