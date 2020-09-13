package myspring.user.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import myspring.user.service.MemberService;
import myspring.user.vo.MemberVO;
import myspring.user.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	MemberService memberservice;
	
	public UserController() {
		System.out.println("==> UserController 기본 생성자 호출됨!!");
	}
	 
	 @RequestMapping(value = "/log.do")
	 public void register(MemberVO user) {
		 System.out.println(user);
		 memberservice.insertUser(user);
		 System.out.println("회원가입 완료");
	 }

}
