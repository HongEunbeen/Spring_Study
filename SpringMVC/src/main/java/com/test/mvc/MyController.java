package com.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/post/memberinfo")//url
	public String bbb() {
		return "post/memberinfo";
	}
	@RequestMapping("/model13")
	public String ccc(Model model) {
		model.addAttribute("name", "jung");
		return "test4";
	}
	@RequestMapping("/model/ex")
	public String ddd(Model model) {
		model.addAttribute("address", "관악구 신림동 미림여자정보과학고등학교");
		return "model/test5";
	}
	@RequestMapping("/model/mav")
	public ModelAndView eee(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("email", "s2017s40@e-mirim.hs.kr");
		mav.setViewName("model/test6");
		return mav;
	}
	@RequestMapping("/post/member")
	public String postmemgber(Model model) {
		model.addAttribute("name", "홍은빈");
		return "post/member";
	}
}