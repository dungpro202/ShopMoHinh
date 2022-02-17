package com.projectmaven.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String sayhello(ModelMap map) {
		map.addAttribute("msg","Anh Dũng");
		return "hello";
	}
}
