package myspring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.user.dao.BoardDAO;
import myspring.user.vo.BoardVO;

@Service
public class BoardServiceImple implements BoardService {
	
	@Autowired
	BoardDAO boarddao;

	@Override
	public void write(BoardVO vo) {
		System.out.println("여기는 서비스입니당. : " + vo);
		boarddao.write(vo);
	}

}
