package myspring.user.service;

import java.util.List;

import myspring.user.vo.BoardVO;

public interface BoardService {
	//게시글 작성
	public void write(BoardVO vo);
	
	//게시글 목록 조회
	public List<BoardVO> list();
}
