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
	
	//게시판 글 작성 화면
	@RequestMapping(value = "/writeView", method = RequestMethod.GET)
	public void writeView() {
		System.out.println("대기");
	}
	//게시판 글 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(BoardVO vo) {
		System.out.println("게시물이 등록되었습니다. : " + vo);
		service.write(vo);
		return "redirect:/";
	}
}
