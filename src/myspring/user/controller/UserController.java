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
		System.out.println("==> UserController 기본 생성자 호출됨!!");
	}
	 
	 @RequestMapping(value = "/register.do")
	 public String register(MemberVO user) {
		 System.out.println(user);
		 service.insertUser(user);
		 System.out.println("회원가입 완료");
		 return "log";
	 }
	 
	 @RequestMapping(value = "/log.do",method = RequestMethod.POST)
	 public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) {
		 System.out.println("컨트롤의 vo입니당. : " + vo);
		 
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
	 //로그아웃의 href가 logdout.do이면 바로 로그아웃이 된다.
		public String logout(HttpSession session){
		 System.out.println("로그아웃이 됩니다.");
			session.invalidate();
			
			return "redirect:/";
		}
	 
	 //master 페이지 로딩
	 @RequestMapping(value = "/master", method = RequestMethod.GET)
	 public String master(Model model) {
		 System.out.println("마스터 페이지 회원목록");
		 model.addAttribute("master",service.master());
		 return "master";
	 }

}
