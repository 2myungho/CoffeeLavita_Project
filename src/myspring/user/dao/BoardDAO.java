package myspring.user.dao;

import java.util.List;

import myspring.user.vo.BoardVO;

public interface BoardDAO {
	//�Խñ� �ۼ�
	public void write(BoardVO vo);
	
	//�Խù� ��� ��ȸ
	public List<BoardVO> list();
}
