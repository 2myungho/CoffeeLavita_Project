package myspring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myspring.user.service.BoardService;
import myspring.user.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	//�Խ��� �� �ۼ� ȭ��
	@RequestMapping(value = "/writeView", method = RequestMethod.GET)
	public void writeView() {
		System.out.println("���");
	}
	//�Խ��� �� �ۼ�
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(BoardVO vo) {
		System.out.println("�Խù��� ��ϵǾ����ϴ�. : " + vo);
		service.write(vo);
		return "redirect:/";
	}
}
