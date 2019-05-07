package com.spring.mvc3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	//*********************HttpServletRequest �̿��ϱ�
	@RequestMapping("/member/test1")
	public String test(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		return "member/test1";
	}
	//**************RequestParam�� �̿��ϱ�
	@RequestMapping("/member/join")
	public String join(@RequestParam("id") String id, @RequestParam("name") String name, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "member/join";
	}
	@RequestMapping("/member/person")
	public String personinfo(@RequestParam("name") String name,
								@RequestParam("id") String id,
								@RequestParam("address") String address,
								@RequestParam("email") String email,
								Model model) {
		Person person = new Person();
		person.setName(name);
		person.setId(id);
		person.setAddress(address);
		person.setEmail(email);
		
		model.addAttribute("personinfo", person);
		
		return "member/personinfo";
	}
	
}
