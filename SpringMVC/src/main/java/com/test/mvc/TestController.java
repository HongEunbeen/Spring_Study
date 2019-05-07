package com.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aaa")
public class TestController {
	@RequestMapping("/bbb")
	public String bb() {
		
		return "/aaa/bbb";
	}
}
