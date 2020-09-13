package myspring.user.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import myspring.user.service.MemberService;
import myspring.user.vo.MemberVO;
import myspring.user.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	MemberService service;
	
	public UserController() {
		System.out.println("==> UserController �⺻ ������ ȣ���!!");
	}
	 
	 @RequestMapping(value = "/log.do")
	 public void register(MemberVO user) {
		 System.out.println(user);
		 service.insertUser(user);
		 System.out.println("ȸ������ �Ϸ�");
	 }
	 
	 @RequestMapping(value = "/index",method = RequestMethod.POST)
	 public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) {
		 System.out.println("��Ʈ���� vo�Դϴ�. : " + vo);
		 
		 HttpSession session = req.getSession();
		 MemberVO login = service.login(vo);
		 
		 if(login == null) {
			 session.setAttribute("member", null);
			 rttr.addFlashAttribute("msg",false);
		 }else {
			 session.setAttribute("member",login);
		 }
		 
		 return "redirect:/";
	 }
	 
	 @RequestMapping(value = "/logout.do", method = RequestMethod.GET)
		public String logout(HttpSession session){
		 System.out.println("�α׾ƿ��� �˴ϴ�.");
			session.invalidate();
			
			return "redirect:/";
		}

}
