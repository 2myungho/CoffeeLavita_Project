package myspring.user.service;

import java.util.List;

import myspring.user.vo.BoardVO;

public interface BoardService {
	//�Խñ� �ۼ�
	public void write(BoardVO vo);
	
	//�Խñ� ��� ��ȸ
	public List<BoardVO> list();
}
