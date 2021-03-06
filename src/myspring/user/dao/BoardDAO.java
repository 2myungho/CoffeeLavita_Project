package myspring.user.dao;

import java.util.List;

import myspring.user.vo.BoardVO;

public interface BoardDAO {
	//게시글 작성
	public void write(BoardVO vo);
	
	//게시물 목록 조회
	public List<BoardVO> list();
	
	//게시물 조회
	public BoardVO read(int bno);
	
	//게시물 수정
	public void update(BoardVO vo);
	
	//게시물 삭제
	public void delete(int bno);
}